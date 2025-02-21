class Solution {
    public int minimumChairs(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        int count=0;
        int maxChairs = 0;
        for(int i=0;i<n;i++){
             if(arr[i]=='E'){
                count++;
             }else{
                count--;
             }
             maxChairs=Math.max(maxChairs,count);
        }
        return maxChairs;
    }
}