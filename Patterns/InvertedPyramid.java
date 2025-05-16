package Patterns;
public class InvertedPyramid {
    public static void InvPyramid(int n){
        
        for (int i= 1; i<=n ; i++){
            //for space
            for (int j= 1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvPyramid(5);
    }
}
