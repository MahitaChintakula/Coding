// User function Template for Java

class Solution {
    public int distance(int x1, int y1, int x2, int y2) {
        // Code here
        int d1=x2-x1;
        int d2=y2-y1;
        double dis=Math.sqrt(d1*d1+d2*d2);
        int res=(int)Math.round(dis);
        return res;
        
    }
}