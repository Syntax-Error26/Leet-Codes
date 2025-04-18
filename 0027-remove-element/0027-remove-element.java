public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // Pointer to place the next kept element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Keep the element
                k++;
            }
        }

        return k; // First k elements in nums are the result
    }
}
