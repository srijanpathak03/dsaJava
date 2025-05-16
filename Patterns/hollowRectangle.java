package Patterns;
public class hollowRectangle {
    public static void hollowRect(int r , int c){
        for(int i = 1;i<=r ; i++){
            for (int j = 1;j<=c;j++){
                if(i==1 || j == 1 ||i == r || j == c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRect(5, 5);
    }
}
