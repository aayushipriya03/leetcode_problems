class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
                int i=nums[low];
                nums[low]=nums[mid];
                nums[mid]=i;
                low++;
                mid++;
            }
            
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid] == 2){
                int i=nums[mid];
                nums[mid]=nums[high];
                nums[high]=i;
                high--;
            }
        }
    }
}