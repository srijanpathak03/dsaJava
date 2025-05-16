package Arrays;

public class ReverseArray {
    public static void Rarray(int arr[]){
        int start =0;
        int end= arr.length-1;
        int temp;
        while(start<end){
            temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start ++;
            end --;
        }
    }
    public static void main(String[] args) {
        int numbers[] ={1,2,3,4,5,6,7,8,9};
        Rarray(numbers);

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
// time O(n)
//space O(1)