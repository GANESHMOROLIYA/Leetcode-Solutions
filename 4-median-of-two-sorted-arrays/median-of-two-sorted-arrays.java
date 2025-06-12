class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans[]=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            ans[k++]=nums1[i];
        }
         for(int j=0;j<m;j++){
            ans[k++]=nums2[j];
        }
        Arrays.sort(ans);
        int total=ans.length;
        if(total%2==1){
            return (double) ans[total/2];
        }else{
            int middle1 =ans[total / 2 - 1];
            int middle2 = ans[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;

        }

    }
}