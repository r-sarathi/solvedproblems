//34. Find First and Last Position of Element in Sorted Array
import java.util.Arrays;
public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums1, 8)));
        System.out.println(Arrays.toString(searchRange(nums1, 6)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        arr[0] = findIndex(nums, target, true);
        arr[1] = findIndex(nums, target, false);
        return arr;
    }
    public static int findIndex(int[] nums, int target, boolean flag) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                index = mid;
                if(flag) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return index;
    }
}
