package Arrays2D;

public class SearchInSorted {
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while(row < matrix.length && col >=0){
            if(matrix[row][col]==key){
                System.out.println("Found at ("+row+","+col+")");
                return true;
            }
            else if (key < matrix[row][col]){
                col--;
            }else if(key > matrix[row][col]){
                row++;
            }
        }
        System.out.println("NOT FOUND");
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,  4,  7,  11, 15},
            {2,  5,  8,  12, 19},
            {3,  6,  9,  16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        staircaseSearch(matrix, 9);
    }
}
