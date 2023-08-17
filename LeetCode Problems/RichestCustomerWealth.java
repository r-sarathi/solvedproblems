//        A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

//        Example 1:
//        Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.

//        Example 2:
//        Input: accounts = [[1,5],[7,3],[3,5]]
//        Output: 10
//        Explanation:
//        1st customer has wealth = 6
//        2nd customer has wealth = 10
//        3rd customer has wealth = 8
//        The 2nd customer is the richest with a wealth of 10.

//        Example 3:
//        Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
//        Output: 17

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { {1, 5}, {7, 3}, {3, 5} };
        System.out.println(calculateRichestCustomer(accounts));
    }
    // Function to calculate the richest customer's wealth
    public static int calculateRichestCustomer(int[][] accounts) {
        int maxWealth = 0;  // Initialize the maximum wealth to 0
        // Loop through each customer's account
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;  // Initialize the sum of wealth for the current customer
            // Loop through each account of the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];  // Add the wealth in the current account to the sum
            }
            // Update the maximum wealth if the sum for the current customer is greater
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;  // Return the richest customer's wealth
    }
}

// Time Complexity - O(n)
// Space Complexity - O(1)
// Output - 10