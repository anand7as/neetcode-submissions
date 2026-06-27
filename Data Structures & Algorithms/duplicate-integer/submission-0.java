class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer> m= new HashMap<>();
        for(int i: nums){
            if(m.containsKey(i))return true;
            m.put(i, m.getOrDefault(i,0)+1);
        }
        return false;

    }
}