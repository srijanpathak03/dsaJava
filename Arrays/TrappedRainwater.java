package Arrays;

public class TrappedRainwater {
    public static int trappedRainwater(int height[]){
        //left max array
        int leftMax [] = new int[height.length];
        leftMax[0] = height[0];
        for (int i=1; i<height.length;i++){
            leftMax[i]= Math.max(height[i],leftMax[i-1]);
        }
        //for rightMAx array
        int rightMax []= new int [height.length];
        rightMax[height.length- 1] = height[height.length-1];  //bcoz we hhave to fill the array from right
        for(int i = height.length-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //loop
        //waterLevel = min(leftMax, rightMax)
        //trappedWater = waterLevel - height[i]
        int trappedWater = 0;
        for(int i = 0;i < height.length ;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height [] = {4,2,0,6,3,2,5};
        int result = trappedRainwater(height);
        System.out.println("The trapped water is: "+ result);

    }
}
//time complexity O(n)