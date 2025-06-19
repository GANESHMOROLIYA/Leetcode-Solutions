class Solution {
    // public void helper(int[] nums,List<Integer> ds,boolean[] isValid,List<List<Integer>> ans){
    //     int n=nums.length;
    //     if(ds.size()==n){
    //         List<Integer> list=new ArrayList<>();
    //         for(int i=0;i<ds.size();i++){
    //             list.add(ds.get(i));
    //         }
    //         ans.add(list);
    //         return;
    //     }
    //     for(int i=0;i<n;i++){
    //         if(isValid[i]==false){
    //             ds.add(nums[i]);
    //             isValid[i]=true;
    //             helper(nums,ds,isValid,ans);
    //             isValid[i]=false;
    //             ds.remove(ds.size()-1);
    //         }
    //     }
    // }
    // public List<List<Integer>> permute(int[] nums) {
    //     List<List<Integer>> ans=new ArrayList<>();
    //     List<Integer> ds=new ArrayList<>();
    //     boolean[] isValid=new boolean[nums.length];
    //     helper(nums,ds,isValid,ans);
    //     return ans;

    // }
     public void helper(int[] nums,int idx,List<List<Integer>> ans){
        int n=nums.length;
        if(idx==n-1){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(nums[i]);
            }
            ans.add(list);
            return;
        }
        for(int i=idx;i<n;i++){
           swap(i,idx,nums);
           helper(nums,idx+1,ans);
           swap(i,idx,nums);
        }
    }
    public void swap(int a,int b,int[] c){
        int temp=c[a];
        c[a]=c[b];
        c[b]=temp;

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,0,ans);
        return ans;

    }
}