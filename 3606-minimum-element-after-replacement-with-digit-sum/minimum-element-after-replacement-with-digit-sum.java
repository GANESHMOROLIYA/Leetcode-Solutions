class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            while(nums[i]>0){
                int digit=nums[i]%10;
                sum+=digit;
                nums[i]/=10;
                
            }
            nums[i]=sum;
            min=Math.min(min,nums[i]);
        }
       return min;
        
    }
}