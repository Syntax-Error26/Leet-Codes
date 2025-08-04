import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        int sum = 0;

        // Step 2: Take every alternate element (even index)
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; // min of each pair after sorting
        }

        return sum;
    }

    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 4, 3, 2};
        System.out.println(sol.arrayPairSum(nums1)); // Output: 4

        int[] nums2 = {6, 2, 6, 5, 1, 2};
        System.out.println(sol.arrayPairSum(nums2)); // Output: 9
    }
}
