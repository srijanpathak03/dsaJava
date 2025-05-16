package Patterns;



public class JavaBasics{
    public static void main(String[] args) {
        int n = 4;
        int k = 65;
        for (int i = 1;i<=n ;i++){
            
            for(int j = 1;j<=i ;j++){
                System.out.print((char)k);
                k=k+1;
            }
            System.out.println();
        }
    }
}


