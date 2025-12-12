// User function Template for Java
class Solution {
    // Function to calculate the sum of squares of first 'number' natural numbers
    public int sumOfSquares(int number) {
        // code here
        int sq,sum=0;
        for(int i=1;i<=number;i++){
            sq=i*i;
            sum=sum+sq;
        }
        return sum;
    }
}