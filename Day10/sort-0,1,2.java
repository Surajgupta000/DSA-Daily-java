
public class sort012 {
	static void sort012(int[] arr) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;
        int mid = 0, temp = 0;

        // Iterate till all the elements are sorted
        while (mid <= hi) {
            if (arr[mid] == 0) {
                swap(arr, mid, lo);
                lo++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                swap(arr, mid, hi);
                hi--;
            }
        }
    }
	
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = { 0, 1, 2, 0, 1, 2 };
	        sort012(arr);

	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i] + " ");
	}

}
