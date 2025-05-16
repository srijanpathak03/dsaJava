import java.util.*;

public class MyClass {
    static class Node {
        String label;
        List<Node> children;
        Node parent;
        int ancestorLocked, descendantLocked, userID;
        boolean isLocked;

        Node(String name, Node parentNode) {
            this.label = name;
            this.parent = parentNode;
            this.children = new ArrayList<>();
            this.ancestorLocked = 0;
            this.descendantLocked = 0;
            this.userID = 0;
            this.isLocked = false;
        }

        void addChildren(List<String> childLabels, Node parentNode) {
            for (String childLabel : childLabels) {
                Node child = new Node(childLabel, parentNode);
                children.add(child);
            }
        }
    }

    static Node buildTree(Node root, int numChildren, List<String> nodeLabels) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int startIndex = 1;

        while (!q.isEmpty() && startIndex < nodeLabels.size()) {
            Node currentNode = q.poll();

            List<String> tempChildrenLabels = new ArrayList<>();
            for (int i = startIndex; i < startIndex + numChildren && i < nodeLabels.size(); i++) {
                tempChildrenLabels.add(nodeLabels.get(i));
            }
            currentNode.addChildren(tempChildrenLabels, currentNode);
            startIndex += numChildren;

            for (Node child : currentNode.children) {
                q.add(child);
            }
        }

        return root;
    }

    static class LockingTree {
        private Node root;
        private Map<String, Node> labelToNode = new HashMap<>();
        private List<String> outputLog = new ArrayList<>();

        LockingTree(Node treeRoot) {
            this.root = treeRoot;
        }

        Node getRoot() {
            return root;
        }

        void fillLabelToNode(Node currentNode) {
            if (currentNode == null) return;
            labelToNode.put(currentNode.label, currentNode);
            for (Node child : currentNode.children) {
                fillLabelToNode(child);
            }
        }

        void updateDescendant(Node currentNode, int value) {
            for (Node child : currentNode.children) {
                child.ancestorLocked += value;
                updateDescendant(child, value);
            }
        }

        boolean checkDescendantsLocked(Node currentNode, int id, List<Node> lockedNodes) {
            if (currentNode.isLocked) {
                if (currentNode.userID != id) return false;
                lockedNodes.add(currentNode);
            }
            if (currentNode.descendantLocked == 0) return true;
            for (Node child : currentNode.children) {
                if (!checkDescendantsLocked(child, id, lockedNodes)) {
                    return false;
                }
            }
            return true;
        }

        boolean lockNode(String label, int id) {
            Node targetNode = labelToNode.get(label);
            if (targetNode.isLocked ||
                targetNode.ancestorLocked != 0 ||
                targetNode.descendantLocked != 0) {
                return false;
            }

            Node cur = targetNode.parent;
            while (cur != null) {
                cur.descendantLocked++;
                cur = cur.parent;
            }
            updateDescendant(targetNode, 1);
            targetNode.isLocked = true;
            targetNode.userID = id;
            return true;
        }

        boolean unlockNode(String label, int id) {
            Node targetNode = labelToNode.get(label);
            if (!targetNode.isLocked || targetNode.userID != id) {
                return false;
            }

            Node cur = targetNode.parent;
            while (cur != null) {
                cur.descendantLocked--;
                cur = cur.parent;
            }
            updateDescendant(targetNode, -1);
            targetNode.isLocked = false;
            return true;
        }

        boolean upgradeNode(String label, int id) {
            Node targetNode = labelToNode.get(label);
            if (targetNode.isLocked ||
                targetNode.ancestorLocked != 0 ||
                targetNode.descendantLocked == 0) {
                return false;
            }

            List<Node> lockedDescendants = new ArrayList<>();
            if (!checkDescendantsLocked(targetNode, id, lockedDescendants)) {
                return false;
            }

            for (Node desc : lockedDescendants) {
                unlockNode(desc.label, id);
            }
            return lockNode(label, id);
        }

        void processQueries(List<Query> queries) {
            for (Query q : queries) {
                boolean res;
                switch (q.opcode) {
                    case 1:
                        res = lockNode(q.label, q.userId);
                        break;
                    case 2:
                        res = unlockNode(q.label, q.userId);
                        break;
                    case 3:
                        res = upgradeNode(q.label, q.userId);
                        break;
                    default:
                        res = false;
                }
                outputLog.add(res ? "true" : "false");
            }
        }

        void printOutputLog() {
            for (String s : outputLog) {
                System.out.println(s);
            }
        }
    }

    static class Query {
        int opcode;
        String label;
        int userId;

        Query(int opcode, String label, int userId) {
            this.opcode = opcode;
            this.label = label;
            this.userId = userId;
        }
    }

    public static void main(String[] args) {
        // Hardcoded input as per sample
        int numNodes = 7;
        int numChildren = 2;
        int numQueries = 5;

        List<String> nodeLabels = Arrays.asList(
            "World", "Asia", "Africa", "China", "India", "SouthAfrica", "Egypt"
        );

        List<Query> queries = Arrays.asList(
            new Query(1, "China", 9),
            new Query(1, "India", 9),
            new Query(3, "Asia", 9),
            new Query(2, "India", 9),
            new Query(2, "Asia", 9)
        );

        Node rootNode = new Node(nodeLabels.get(0), null);
        rootNode = buildTree(rootNode, numChildren, nodeLabels);

        LockingTree lockingTree = new LockingTree(rootNode);
        lockingTree.fillLabelToNode(lockingTree.getRoot());

        lockingTree.processQueries(queries);
        lockingTree.printOutputLog();
    }
}


