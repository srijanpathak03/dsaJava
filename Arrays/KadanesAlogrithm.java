/*this algo finds the max subarray on O(n) time*/
/*in this approach we calculate the current sum and max sum and if the the current sum is in negative we take it 0 ie. cs =0
and we initialize maxSum = currSum if curr>Max sum
   */

package Arrays;
public class KadanesAlogrithm {
   public static void Kadanes(int arr[]){
    int MaxSum = Integer.MIN_VALUE;
    int crrSum=0;
    for (int i = 0;i<arr.length;i++){
        crrSum = crrSum + arr[i];
        if(crrSum < 0 ){
            crrSum = 0;
        }
        MaxSum = Math.max(MaxSum, crrSum);
    }
    System.out.println("Max subarray sum is: "+ MaxSum);
   }
   public static void main(String[] args) {
    int arr []={-2 ,-3,4,-1,-2,1,5,-3};
    Kadanes(arr);
   }

}
