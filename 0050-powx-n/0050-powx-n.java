class Solution {
    public double myPow(double x, int n) {
        double ans = pow(x,n);
        if(n<0) return 1/ans;
        return ans;
        
    }
    double pow(double x , int n ){
        if(n==0)return 1;
        if(n%2==0){
            double half = pow(x,n/2);
            return half * half;
        }
        else {
            double half = pow(x,n/2);
            return half * half *x ;
        }
        
    }
}