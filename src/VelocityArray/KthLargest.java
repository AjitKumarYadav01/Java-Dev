package VelocityArray;
import java.util.Arrays;
public class KthLargest {
        public static int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length - k];
        }

        public static void main(String[] args) {
            int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
            int k = 3;
            int kthLargest = findKthLargest(nums, k);
            System.out.println("The " + k + "th largest element is: " + kthLargest);
        }

}
