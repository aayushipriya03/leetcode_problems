class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int n = nums.length;
        int res = sum;
        for(int i=1;i<n;i++){
            sum=Math.max(nums[i],(sum+nums[i]));
            res = Math.max(res,sum);
        }
        return res;
    }
}