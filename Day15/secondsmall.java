class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int n = arr.length;
        int small=arr[0];
       
        int second=Integer.MAX_VALUE;
        
        for(int i=1;i<n;i++){
            if(arr[i]<small){
                second=small;
                small=arr[i];
            }else if(arr[i]>small && arr[i]< second){
                second=arr[i];
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        if(second==Integer.MAX_VALUE){
            ans.add(-1);
            
        }else{
            ans.add(small);
            ans.add(second);
        }
        return ans;
    }
}
