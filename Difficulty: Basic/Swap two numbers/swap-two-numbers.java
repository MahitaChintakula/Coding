class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        
        int temp=a;
        a=b;
        b=temp;
        return List.of(a,b);
    }
}