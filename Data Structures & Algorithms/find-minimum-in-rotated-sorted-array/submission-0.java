class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left+right)/2;
            if (nums[left] < nums[right]) {
                return nums[left];
            }
            else if (nums[mid] < nums[left]) {
                right = mid;
            }
            else if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            
        }
        return nums[left];
    }
}
