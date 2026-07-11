class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(i==0){
                ans.append(arr[i]);
                break;
            }
            ans.append(arr[i]);
            ans.append(" ");
        }
        return ans.toString();
    }
}