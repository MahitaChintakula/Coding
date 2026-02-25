class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k){
                ans=mid;
                r=mid-1;
            }
            else if(k>arr[mid]){
                l=mid+1;
            }
            else if(k<arr[mid]){
                r=mid-1;
            }
        }
        return ans;
    }
}