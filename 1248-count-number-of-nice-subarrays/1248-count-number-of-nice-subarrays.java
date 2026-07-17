class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         return atmost(nums,k)-atmost(nums,k-1);
        
    }
    int atmost(int[] nums,int x ){
        if(x<0)return 0;
        int l =0 , r=0, c=0,preSum=0;

        int n = nums.length;
        while(r<n){
            preSum+=nums[r]%2;
            while(preSum>x){
                preSum-=nums[l] % 2;
                l++;
            }
            c+=(r-l+1);
            r++;
        }
        return c;

    }
        
    
}