class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int pos=0;
        int neg=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                continue;
            }else if(nums[i]<0){
                neg++;
            }else{
                pos++;
            }
        }
        max=Math.max(pos,neg);
        return max;
    }
}