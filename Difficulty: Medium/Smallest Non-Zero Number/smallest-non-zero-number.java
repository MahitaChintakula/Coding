// class Solution {
//     public int find(int[] arr) {
//         // code here
//         int t=0;
//         for(int i=0; ;i++){
//              t=i;
//             for(int j=0;j<arr.length;j++){
//                  t=(2*t)-arr[j];
//                 if(t<0){
//                     break;
//                 }
//             }
//             if(t>=0){
//                 return i;
//             }
//         }
//     }
// }
class Solution {
    public int find(int[] arr) {
        long ans = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            ans = (ans + arr[i] + 1) / 2;
        }

        return (int) ans;
    }
}