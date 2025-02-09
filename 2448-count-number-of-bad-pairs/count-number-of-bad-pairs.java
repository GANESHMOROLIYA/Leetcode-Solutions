

class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long totalPairs = (long) n * (n - 1) / 2;
        HashMap<Integer, Integer> freq = new HashMap<>();
        long goodPairs = 0;

        for (int i = 0; i < n; i++) {
            int diff = nums[i] - i;
            goodPairs += freq.getOrDefault(diff, 0);
            freq.put(diff, freq.getOrDefault(diff, 0) + 1);
        }

        return totalPairs - goodPairs;
    }
}
