class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int j=1;
       
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(nums[i]%2!=0){
                    while (nums[j] % 2 != 0) {
                        j += 2; 
                    }
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j+=2;
                }
            }
        }
        
        return nums;
    }
}