class Solution {
    public int balancedStringSplit(String s) {
        int n=s.length();
        int left=0;
        int right=0;
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='L'){
                left++;
            }else{
                right++;
            }
            if(left==right){
                count++;
            }
        }
        return count;
    }
}