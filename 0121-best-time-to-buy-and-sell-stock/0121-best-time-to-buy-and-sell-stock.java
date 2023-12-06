class Solution {
    public int maxProfit(int[] prices) {
        int min_left=prices[0];
        int n=prices.length;
        int res=0;
        for(int i=1;i<n;i++){
            res=Math.max(res,prices[i]-min_left);
            min_left=Math.min(prices[i],min_left);
        }
        
        return res;
    }
}