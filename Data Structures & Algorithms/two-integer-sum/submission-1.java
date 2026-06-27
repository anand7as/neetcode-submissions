class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            int temp= target- nums[i];
            if(map.containsKey(temp)){
                int val= map.get(temp);
                if(val==i)continue;
                if(val<i)return new int []{val, i};
                else return new int [] {i, val};
            }
        }
        return new int[]{};
    }
}
