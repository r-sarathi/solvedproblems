//        1295. Find Numbers with Even Number of Digits.
//        Given an array nums of integers, return how many of them contain an even number of digits.
//        Example 1:
//        Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore, only 12 and 7896 contain an even number of digits.
//
//        Example 2:
//        Input: nums = [555,901,482,1771]
//        Output: 1
//        Explanation:
//        Only 1771 contains an even number of digits.

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    // Function to count the number of elements with even number of digits
    public static int findNumbers(int[] nums) {
        int count = 0;  // Initialize a count variable to keep track of even-digit numbers
        if (nums.length < 1) {
            return -1;  // If the array is empty, return -1 indicating an error
        }
        for (int i = 0; i < nums.length; i++) {
            // Call the function to check if the number of digits is even, and if so, increment the count
            if (countDigits(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;  // Return the count of numbers with even number of digits
    }

    // Function to count the number of digits in a number
    public static int countDigits(int num) {
        int count = 0;  // Initialize a count variable
        // Count the digits in the number using a loop
        while (num > 0) {
            count++;       // Increment count for each digit
            num = num / 10;  // Remove the last digit by dividing the number by 10
        }

        return count;  // Return the count of digits in the number
    }
}

// Time Complexity - O(n * log10(maximum element value))
// Space Complexity - O(1)
// Output - 2


