class Solution {
    public boolean isPerfectSquare(int num) {
        long st = 0;
        long end = num;
        long ans = -1;
        while (st <= end) {
            long mid = st + (end - st) / 2;
            long val = mid * mid;
            if (val == num) {
                return true;
            } else if (val < num) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}