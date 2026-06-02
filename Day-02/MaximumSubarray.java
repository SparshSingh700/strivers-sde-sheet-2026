class Solution {
    public int maxSubArray(int[] nums) {
        //Start curSum from 0 because a negative running sum only hurts future subarrays. 
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;

        //If current sum becomes negative, we discard it and start fresh again
        for(int i=0; i<nums.length; i++){
            curSum+=nums[i];
            maxSum= maxSum < curSum ? curSum : maxSum;
            curSum= curSum < 0 ? 0 : curSum;
        }
        return maxSum;
    }
}