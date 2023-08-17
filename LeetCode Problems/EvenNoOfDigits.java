public class EvenNoOfDigits {

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(finNumbers(arr));
    }
    public static int finNumbers(int[] nums) {
        int count = 0;
        if(nums.length < 1) {
            return -1;
        }
        for(int i=0; i<nums.length; i++) {
            if(isEvenDigits(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int isEvenDigits(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}


