package Patterns;
public class butterfly {
    public static void butter(int n){
        //outer loop
        for(int i = 1; i<=n ; i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for inverted part
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        butter(4);
    }
}
