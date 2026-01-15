class Solution {
    public int minimumDeletions(String word, int k) {
       int arr[] = new int[26];
       for(char c: word.toCharArray()){
        arr[c-'a']++;
       } 
       int minDel = Integer.MAX_VALUE;
       for(int i=0;i<26;i++){
        int currdel = 0;
        for(int j=0;j<26;j++){
            if(arr[j] < arr[i]) currdel += arr[j];
            else {
                if(arr[j] > arr[i]+k){
                    currdel += arr[j]-(arr[i]+k);
                }
            }
        }
        minDel = Math.min(currdel,minDel);
       } 
       return minDel;
    }
}