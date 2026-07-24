class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       
        return fun(nums,k)-fun(nums,k-1);
    }
    int fun(int[] nums , int k){
        int l =0 , r=0, count =0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            int freq=map.size();
            while(freq>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    
                    map.remove(nums[l]);
                    freq--;
                }
                l++;
            
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}