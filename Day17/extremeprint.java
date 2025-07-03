// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,1};
       int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            if (arr[start] == arr[end]) {
                // Only print once when both are equal
                System.out.print(arr[start] + " ");
            } else {
                System.out.print(arr[start] + " " + arr[end] + " ");
            }
            start++;
            end--;
        }
    }
        
        
    
}
