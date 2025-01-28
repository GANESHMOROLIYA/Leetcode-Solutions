class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int[] target=new int[n];
        for(int i=0;i<n;i++){
            int m = index[i];
            if (target[m] != 0 || m < i) {
                for (int j = n - 1; j > m; j--) {
                    target[j] = target[j - 1];
                }
            }
            target[m] = nums[i];
        }
        return target;
    }
}