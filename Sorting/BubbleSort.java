package Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for (int i =0; i<arr.length-1;i++){
            for(int j = 0 ;j<arr.length-1-i; j++){
                //swap
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr [] ={2,5,9,21,6,66,2,3,5,2,1};
        bubbleSort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
