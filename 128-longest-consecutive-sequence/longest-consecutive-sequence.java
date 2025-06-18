class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        int maxSteek=0;
        for(int num:st){
            if(!st.contains(num-1)){
                int currNum=num;
                int currStreek=1;
                while(st.contains(currNum+1)){
                    currNum++;
                    currStreek++;
                }
                maxSteek=Math.max(maxSteek,currStreek);
            } 
        }
        return maxSteek;
    }
}