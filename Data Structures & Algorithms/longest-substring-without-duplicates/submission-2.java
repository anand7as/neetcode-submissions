class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int i=0;
        int j=0;
        int ans=0;
        if(n==1)return 1;
        Set<Character> set= new HashSet<>();
        while(j<n){
            if(set.contains(s.charAt(j))){
                ans=Math.max(ans, j-i);
                while(i<j &&set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
            }
            set.add(s.charAt(j));
            j++;
        }
        ans= Math.max(ans, j-i);
        return ans;
    }
}
