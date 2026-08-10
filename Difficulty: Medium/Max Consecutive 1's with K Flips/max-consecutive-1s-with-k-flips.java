class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int l=0,zeros=0,maxlen=0,len;
        for(int r=0;r<arr.length;r++){
            if(arr[r] == 0) zeros++;
            if(zeros>k) {
              if(arr[l]==0){
                zeros--;
              }
              l++;
            }
            len=r-l+1;
            maxlen=Math.max(maxlen,len);
        }
        return maxlen;
    }
}