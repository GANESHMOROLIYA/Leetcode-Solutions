class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenList.add(nums[i]);
            } else {
                oddList.add(nums[i]);  
            }
        }
        Collections.sort(evenList);
        Collections.sort(oddList, Collections.reverseOrder());

        int evenIndex = 0, oddIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = evenList.get(evenIndex++);
            } else {
                nums[i] = oddList.get(oddIndex++);
            }
        }

        return nums;
    }
}
