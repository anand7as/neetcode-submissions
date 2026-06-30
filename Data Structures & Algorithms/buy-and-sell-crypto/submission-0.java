class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
        int profit=0;
        int bought= nums[0];
        for(int i=1; i<n; i++){
            if(nums[i]>bought)profit=Math.max(profit, (nums[i]-bought));
            else if(nums[i]<bought)bought= nums[i];
        }
        return profit;
    }
}
