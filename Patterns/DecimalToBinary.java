package Patterns;
public class DecimalToBinary {
    public static void DecToBin(int n){
        int d ,bin=0;
        for(int i = 0;n!=0 ; i++){
            d=n%2;
            bin = bin+ (d* (int)Math.pow(10, i));
            n=n/2;
        }
        
        System.out.println("Binary no. is: "+ bin);
    }
    public static void main(String[] args) {
        DecToBin(5);
    }
}
