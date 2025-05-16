package Patterns;
public class BinaryToDecimal {
    public static void BinToDce(int n){
        int d , sum =0;
        for (int i=0;n!=0;i++){
            d = n%10;
            
            sum= sum + (d* (int)Math.pow(2, i));
            n=n/10;
        }
        System.out.println("decimal no. is: "+sum);
    }
    public static void main(String[] args) {
        BinToDce(111);
    }
}
