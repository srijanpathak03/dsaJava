

public class ithBit {
    public static void getithBit(int n , int i){
        if((n & (1<<i))== 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    public static int setithBit(int n, int i ){ // set ith bit 1
        int d = n | (1<<i);
        return d;
    }
    public static int clearithBit(int n , int i){  //set ith bit 0
        int d = n & (~(1<<i));
        return d;
    }
    public static int updateithBit(int n , int i , int newBit){
        if(newBit == 0){
            return clearithBit(n, i);
        }else {
            return setithBit(n, i);
        }
        
    }
    public static int clearLastithBit(int n , int i){
        return n & (~0 << i);
    }
    public static int clearRangeOfBits(int n ,int i ,int j){
        int a= (~0 << (j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static boolean isPowerOfTwo(int n ){
        if((n& (n-1))==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int countSetBits(int n){
        int count = 0;
        while(n!=0){
            if((n & 1) == 1){ //to check lsb
                count++;
                n=n>>1;
            }else{
                n=n>>1;
            }
        }
        return count;
    }
   
    public static void main(String[] args) {
        // getithBit(15, 2);
        // setithBit(5, 2);
        // clearithBit(8, 2);
        // System.out.println(countSetBits(15));
        
    }
}
