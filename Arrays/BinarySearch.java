package Arrays;

public class BinarySearch {
    public static int Bsearch(int n){
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int start= 0;
        int end = arr.length-1;
        int mid;
        for(int i=0;i<=arr.length;i++){
            mid = (start+end)/2;
            if(arr[mid] == n){
                return mid;
            }
            else if(n < mid){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int d =Bsearch(5);
        if(d== -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("At index "+d);
        }
    }
}
