class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int k=0;
        int cnt=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=val){
                cnt++;
                nums[k]=nums[i];
                k++;
            }
        }
        return cnt;
    }
}