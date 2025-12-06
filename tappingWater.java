package Array;

public class tappingWater {
    public static int rainwater(int []hight) {

        int n = hight.length;

        // leftmax boundary
        int []leftmax = new int[n];
        leftmax[0] = hight[0];
        for (int i = 1; i <n ; i++) {
            leftmax[i] = Math.max(hight[i],leftmax[i-1]);
        }

        // rightmax boundary
        int [] rightmax = new int[n];
        rightmax[n-1] = hight[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightmax[i] = Math.max(hight[i],rightmax[i+1]);
        }

        int trappedwater = 0;
        // final waterlevel
        for (int i = 0; i <n ; i++) {
            int waterlevel = Math.min(leftmax[i],rightmax[i]);

            trappedwater += waterlevel-hight[i];
        }

        return trappedwater;

    }

    public static void main(String[] args) {
        int [] hight = {4, 2, 0, 3, 2, 5};
        System.out.println(rainwater(hight));
    }

}



// leetcode

//class Solution {
//    public int trap(int[] height) {
//        int n = height.length;
//        if (n == 0) return 0;
//
//        int[] leftMax = new int[n];
//        leftMax[0] = height[0];
//        for (int i = 1; i < n; i++) {
//            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//        }
//
//        int[] rightMax = new int[n];
//        rightMax[n - 1] = height[n - 1];
//        for (int i = n - 2; i >= 0; i--) {
//            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//        }
//
//        int trappedWater = 0;
//        for (int i = 0; i < n; i++) {
//            int waterLevel = Math.min(leftMax[i], rightMax[i]);
//            trappedWater += waterLevel - height[i];
//        }
//
//        return trappedWater;
//    }
//}
