class Solution {
    public int characterReplacement(String s, int k) {
        int l =0,r=0,maxfreq=0 , maxlen=0;
        int n = s.length();
        HashMap<Character,Integer> map =new HashMap<>();
        while(r<n){
            char x= s.charAt(r);
            map.put(x,map.getOrDefault(x,0)+1);
            maxfreq=Math.max(maxfreq, map.get(x));
            while((r-l+1)-maxfreq>k){
                char y =s.charAt(l);
                map.put(y,map.get(y)-1);
                l++;
            }
            maxlen= Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
        
    }
}