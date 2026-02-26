class Solution {
    public int countDigits(int n) {
        // code here
        int c=0;
        while(n>0){
            int rem=n%10;
            c++;
            n=n/10;
        }
        return c;
    }
    
}
