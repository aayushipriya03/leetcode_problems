class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
      
      int arr[] =new int[2];
      int j=0;
        for(int num: nums){
        if(map.containsKey(target-num)){
              arr[0] = j;
              arr[1] = map.get(target-num);
            }

        map.put(num,j);
           j++; 
        }

        return arr;
    }
}