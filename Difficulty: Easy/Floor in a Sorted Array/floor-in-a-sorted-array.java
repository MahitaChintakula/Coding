class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int l=0,r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]<=x){
                l=mid+1;
                ans=mid;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
}
