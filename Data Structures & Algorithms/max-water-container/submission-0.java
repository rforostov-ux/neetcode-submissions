class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxx = 0;
        while (left < right) {
            int mm = Math.min(heights[left], heights[right]) * (right - left);
            maxx = Math.max(maxx, mm);
            if (heights[left] < heights[right]) {
                left++;
            }
            else if (heights[right] < heights[left]) {
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        return maxx;
    }
}
