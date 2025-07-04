// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int temp=arr[0];
        
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        
        for(int num : arr){
            System.out.print(num+" ");
        }
        
        System.out.println();
        
    }
}