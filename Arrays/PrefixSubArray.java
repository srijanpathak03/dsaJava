package Arrays;

public class PrefixSubArray {
    public static void PSarr(int arr[]){
         // for start
         int total = 0;
         int max= Integer.MIN_VALUE; //or -99999 
        int prefix [] = new int [arr.length];
        int currSum;

        prefix[0]=arr[0];  //we first store 0th index value in prefix arr bcoz we start with 1 and need 1-1 ie 0
        for(int i =1;i<arr.length ;i++){
            prefix[i]=prefix[i-1] + arr[i];  //this calculates the prefix array ie. current element +sum of all it previous elements
        }

         for(int i =0;i<arr.length;i++){
             //for one ahead of start till the end
             for(int j =i; j<arr.length ; j++){
                //this calculate the sum of the current sub array 
                currSum= i==0 ? prefix[j] :prefix[j]-prefix[i-1]; //if i == 0 then crrSum = prefix[end] else crrSum= prefix[end] - prefix[start-1]

                if (max<currSum){
                    max=currSum;
                }
                 
             }
             System.out.println();
         }
         System.out.println("total Sub arrays: "+total);
         System.out.println("Max sum of array is: "+max);
     }
     public static void main(String[] args) {
         int numbers[] ={1,2,3,4,5,6,7,8,9};
         PSarr(numbers);
 
     }
}
//this approach has time comp O(n2)
/*the formula preix[end] - prefix[start-1] is to calculate the sum of the current subarray so we dont need 
another loop to calculate the the sum */
