class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int k=0;
        for(int i=n-1; i>=0; i--){
            if(nums[i]==val){
                int j=i;
                k++;
                while(j<n-1 && nums[j+1]!=val){
                   int temp= nums[j];
                   nums[j]=nums[j+1];
                   nums[j+1]=nums[j];
                    j++;
                }
            }
        }
        return n-k;
    }
}