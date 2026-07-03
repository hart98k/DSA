class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal)-atmost(nums,goal-1);
        
    }
    int atmost(int[] nums,int x ){
        if(x<0)return 0;
        int l =0 , r=0, c=0,preSum=0;

        int n = nums.length;
        while(r<n){
            preSum+=nums[r];
            while(preSum>x){
                preSum-=nums[l];
                l++;
            }
            c+=(r-l+1);
            r++;
        }
        return c;

    }
}