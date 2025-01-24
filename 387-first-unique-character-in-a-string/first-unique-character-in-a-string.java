class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        char[] arr=s.toCharArray();
        for(int i=0;i<n;i++){
            boolean isUnique = true;
            for(int j=0;j<n;j++){
                if(i!=j&&arr[i]==arr[j]){
                    isUnique = false;
                    break;
                }
            }
             if (isUnique) {
                return i;
            }
        }
        return -1;
    }
}