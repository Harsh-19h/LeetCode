class Solution {
    public boolean isPalindrome(String s) {
      String lower =  s.toLowerCase();
      String pal = lower.replaceAll("[^a-zA-Z0-9]","");
      int i=0;
      int j = pal.length()-1;
      while(i<j){
        if(pal.charAt(i)!=pal.charAt(j)) return false;
        i++;j--;
      }
      return true;
    }
}