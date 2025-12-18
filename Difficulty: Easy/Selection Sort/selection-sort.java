class Solution {
    void selectionSort(int[] arr) {
        // code here
        int min,i,j;
        for(i=0;i<arr.length-1;i++){
            min=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}