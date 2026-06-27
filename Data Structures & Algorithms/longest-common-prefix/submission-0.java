class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        String matcher = strs[0];
        int n= strs.length;
        for(int i=1; i<n; i++){
           int j=0;
            while(j<Math.min(matcher.length(), strs[i].length())&&matcher.charAt(j)==strs[i].charAt(j)){
                ans =ans+strs[i].charAt(j);
                j++;
            }
            matcher=ans;
            ans="";
        }
        return matcher;
    }
}