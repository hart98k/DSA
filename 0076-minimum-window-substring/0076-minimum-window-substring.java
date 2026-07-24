class Solution {
    public String minWindow(String s, String t) {
        int l =0 , r = 0 , count = 0 ; 
        int si =-1;
        int n = s.length();
        int m = t.length();
        int minlen = Integer.MAX_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i<m ;i++){
            char x = t.charAt(i);
            map.put(x,map.getOrDefault(x,0)+1);
        }

        while(r<n){
            char y =s.charAt(r);
           if (map.containsKey(y)) {

                if (map.get(y) > 0) {
                    count++;
                }

                map.put(y, map.get(y) - 1);
            }
            while(count==m){
                if(r-l+1<minlen){
                    minlen= r-l+1;
                    si=l;
                }
                char z = s.charAt(l);
                if (map.containsKey(z)) {

                    map.put(z, map.get(z) + 1);

                    if (map.get(z) > 0) {
                        count--;
                    }
                }
                l++;
            }
            r++;
        }
        return si==-1?"":s.substring(si,si+minlen);
    
        
    }
}