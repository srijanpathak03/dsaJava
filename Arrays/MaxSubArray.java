package Arrays;
public class MaxSubArray {
    public static void MaxSarray(int arr[]){
        // for start
        int total = 0;
        int max= Integer.MIN_VALUE; //or -99999 
        for(int i =0;i<arr.length;i++){
            //for one ahead of start till the end
            for(int j =i; j<arr.length ; j++){
                int sum=0;
                //for printing all no. bw start to end ie. i to j
                for(int k = i; k<=j ;k++){
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                total++;
                if (sum>max){
                    max = sum;
                }
                System.out.println(); 
            }
            System.out.println();
        }
        System.out.println("total Sub arrays: "+total);
        System.out.println("Max sum of array is: "+max);
    }
    public static void main(String[] args) {
        int numbers[] ={1,2,3,4,5,6,7,8,9};
        MaxSarray(numbers);

    }

}
//this has time comp O(n3)