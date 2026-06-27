class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
          String curr = strs[i];
          char[] arr= curr.toCharArray();
          Arrays.sort(arr);
          String sorted = new String(arr);
          if(!map.containsKey(sorted)){
            map.put(sorted, new ArrayList<>());
          }
          map.get(sorted).add(curr);        
    }
    for (Map.Entry<String, List<String>> entry: map.entrySet()){
        ans.add(entry.getValue());
    }
    return ans;
}
}