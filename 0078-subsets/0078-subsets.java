class Solution {
   
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        fun(nums,0,ans,r);
        return r;
    }

    void fun(int[] nums , int i ,List<Integer> ans ,List<List<Integer>> r){
        if(i==nums.length){
            r.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        fun(nums,i+1,ans,r);
        ans.remove(ans.size()-1);
        fun(nums,i+1,ans,r);
    }
}