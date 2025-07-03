// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        
        // Handle cases where d > n
        d = d % n;

        // Step 1: Reverse first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse remaining n - d elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Utility to reverse elements in array from index 'start' to 'end'
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
