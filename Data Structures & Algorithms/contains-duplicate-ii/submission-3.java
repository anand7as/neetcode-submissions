class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        if(n==0 || n==1||k==0)return false;
        
        Set<Integer> map= new HashSet<>();
        for(int i=0; i<n; i++){
            if(i>k){
                map.remove(nums[i-k-1]);
            }
            if(map.contains(nums[i]))return true;
            map.add(nums[i]);
        }
        return false;
    }
}