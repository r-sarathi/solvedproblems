public class BinarySearchGreater {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 13, 19};
        int target = 13;
        System.out.println(GreaterNumber(arr, target));
        System.out.println(GreaterNumber(arr, 19));
    }
    public static int GreaterNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(arr.length < 1) {
            return 0;
        }
        while(start <= end) {
            int mid = (start + end) / 2;
            if(target < arr[mid]){
                end = mid - 1;

            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                if(mid < arr.length-1) {
                    return arr[mid+1];
                }
                return arr[0];
            }
        }
        return arr[0];
    }
}
