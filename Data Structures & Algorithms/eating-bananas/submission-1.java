class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left = 1;
        int right = 0;
        for (int i = 0; i < piles.length; i++) {
            right = Math.max(right, piles[i]);
        }
        int res = -1;
        while (left <= right) {
            long count = 0;
            int k = (left + right) / 2;
            for (int i = 0; i < piles.length; i++) {
                count += (piles[i] + k - 1)/k;
            }
            if (count <= h) {
                res = k;
                right = k - 1;
            }
            else if (count > h) {
                left = k + 1;
            }

        }
        return res;
    }
}
