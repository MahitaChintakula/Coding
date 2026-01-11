class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rev=0;
        int original=n;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        double re=Math.pow(original,rev);
        return (int)re;
    }
}
