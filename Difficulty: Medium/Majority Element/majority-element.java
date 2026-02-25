class Solution {
    int majorityElement(int arr[]) {
        // code here
        int max=0;
        int res=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            // if(map.containsKey(nums[i])){
            //     map.put(arr[i],map.get(arr[i])+1);
            // }else{
            //     map.put(arr[i],1);
            // }
            int count = map.getOrDefault(arr[i], 0) + 1;
            map.put(arr[i],count);
            if(count>max){
                max=count;
                res=arr[i];
            }
        }
        if(max > arr.length / 2)
            return res;
        else
            return -1;
    }
}