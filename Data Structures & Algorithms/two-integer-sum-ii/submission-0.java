class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n = nums.length;
        int [][] temp= new int[n][2];
        for(int i=0; i<n; i++){
            temp[i][0]=nums[i];
            temp[i][1]= i;
        }
        Arrays.sort(temp, (a,b)->Integer.compare(a[0],b[0]));
        int i=0, j=n-1;
        while(i<j){
            int sum=temp[i][0]+temp[j][0];
            if(sum==target)return new int[]{i+1, j+1};
            else if(sum<target)i++;
            else j--;
        }
        return new int[0];
    }
}
