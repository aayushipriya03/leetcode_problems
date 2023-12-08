class Solution {
    
   
    public int[][] merge(int[][] intervals) {
       List<List<Integer>> result =new ArrayList<>();
        
        java.util.Arrays.sort(intervals, new java.util.Comparator<int[]>() {
    public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }});
        int r=intervals.length;
       int curr_mx=intervals[0][1];
        int curr_mn=intervals[0][0];
        for(int i=1;i<r;i++){
            
            if(curr_mx<intervals[i][0]){
                List<Integer>list=new ArrayList<>();
                list.add(curr_mn);
                list.add(curr_mx);
                result.add(list);
                curr_mn=intervals[i][0];
                curr_mx=intervals[i][1];
            }
            
            else{
                curr_mx=Math.max(intervals[i][1],curr_mx);
            }
            
        }
        
         List<Integer>list=new ArrayList<>();
                list.add(curr_mn);
                list.add(curr_mx);
                result.add(list);
        
        int n= result.size();
        
        int[][] ans =new int[n][2];
        for(int i=0;i<n;i++){
            ans[i][0]=result.get(i).get(0);
            ans[i][1]=result.get(i).get(1);
        }
        return ans;
        
    }
}