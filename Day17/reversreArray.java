// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int n= a.length;
        int l=0;
        int h=n-1;   
        int temp =0;

        while(l<h){
            temp=a[l];
            a[l]=a[h];
            a[h]=temp;
            l++;
            h--;
        }
        for(int num : a){
            System.out.println(num);
        }
    }
}