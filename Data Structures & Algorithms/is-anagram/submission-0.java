class Solution {
    public boolean isAnagram(String s, String t) {
      int [] x=new int[26];
      int [] y= new int[26];
      int n=s.length();
      int m= t.length();
     if(n!=m)return false;
      for(int i=0; i<n; i++){
        x[s.charAt(i)-'a']++;
        y[t.charAt(i)-'a']++;
      }
      for(int i=0; i<26; i++){
        if(x[i]!=y[i])return false;
      }
      return true;
    }
}
