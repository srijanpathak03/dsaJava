

public class OddEven {
    public static void checkOddEven(int n){
        if( (n & 1) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        checkOddEven(3);
    }
}
