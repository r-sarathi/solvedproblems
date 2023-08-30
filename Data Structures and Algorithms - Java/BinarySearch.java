public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 13, 34, 66, 99};
        int target = 3;
        System.out.println(BinarySearchArr(arr, target));
    }
    public static int BinarySearchArr(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(arr.length < 1) {
            return 0;
        }
        while(start <= end) {
            int mid = (start + end) / 2;
            if(target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}