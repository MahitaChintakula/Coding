// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int s=0;
        while(n>0){
            int rem=n%10;
            s=s+rem;
            n=n/10;
        }
        int sum=s;
        int rev=0;
        while(s>0){
            int r=s%10;
            rev=rev*10+r;
            s=s/10;
        }
        return (sum==rev);
    }
}