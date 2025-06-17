class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        int[] ans={-1};
        for(int i=0;i<n;i++){
            int partener=target-nums[i];
            if(mp.containsKey(partener)){
               ans= new int[]{mp.get(partener),i};
               return ans;
            }else{
                mp.put(nums[i],i);
            }
        }
        return ans;
        //Using O(n^2)
        //   for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[j] == target - nums[i]) {
        //             return new int[] { i, j };
        //         }
        //     }
        // }
      
        // return new int[] {};
    }
}