class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
       k=k%n;
       ReveArray(nums,0,n-k-1);
       ReveArray(nums,n-k,n-1);
       ReveArray(nums,0,n-1);

       for(int i=0;i<n;i++){
        System.out.print(nums[i]+",");
       }
    }

    public void ReveArray(int[] nums,int i,int j){
          while(i<j){
         int temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;
            i++;
            j--;
          }

    }
    // public void Swap(int[] nums,int i,int j){
    //     int temp=nums[i];
    //     nums[i]=nums[j];
    //     nums[j]=temp;
    // }

}