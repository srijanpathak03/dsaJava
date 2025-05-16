package Arrays;
// import java.util.*;
public class LargestNo {
    public static int Largest(){
        // int arr[]= new int[10];
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int largest = -999;
        for (int i =0;i< arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        System.out.println("Largest no. is: "+Largest());
    }
}
