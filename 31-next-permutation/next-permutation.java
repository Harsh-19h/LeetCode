class Solution {
    public static void reverse(int arr[], int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int idx = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx = i;
                break;
            }
        }
        if(idx ==-1){
            reverse(arr,0,n-1);
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(arr[i]>arr[idx]){
                    int temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                    break;
                }
            }
            reverse(arr,idx+1,n-1);
        }
    return ;
    }
}