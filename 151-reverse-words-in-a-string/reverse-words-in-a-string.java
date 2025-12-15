class Solution {
    public String reverseWords(String s) {
       String arr[] = s.trim().split("\\s+");
       String ans ="";
       for(int i=arr.length-1;i>=0;i--){
        ans+=arr[i];
        ans+=" ";
       }
        ans = ans.trim();
        return ans;
    }
}