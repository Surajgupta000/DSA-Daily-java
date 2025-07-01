class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int larg=arr[0];
        int seclar=-1;
        
        for(int i=1;i<n;i++){
            if(arr[i]>larg && arr[i]!=larg){
               
                seclar=larg;
                 larg=arr[i];
            }else if(arr[i]<larg && arr[i]>seclar){
                seclar=arr[i];
            }
        }
        return seclar;
    }
}