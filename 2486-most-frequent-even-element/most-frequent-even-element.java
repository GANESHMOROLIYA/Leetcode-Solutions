class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if (nums[i] % 2 == 0) {
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            }
        }
        
        int maxfreq=0;
        int ansKey=-1;

        for(var entry:mp.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > maxfreq || (value == maxfreq && key < ansKey)) {
                maxfreq = value;
                ansKey = key;
            }
            
        }
        return ansKey;
    }
}