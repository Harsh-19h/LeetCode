class Solution {
    public String countAndSay(int n) {
       if(n==1) return "1";

      String say =  countAndSay(n-1); 
      StringBuilder s = new StringBuilder();
      int count=1;
      for(int i=1;i<say.length();i++){
        if(say.charAt(i) == say.charAt(i-1)) count++;
        else{
             s.append(count);
            s.append(say.charAt(i-1));
            count=1;
        }
      }
      s.append(count);
      s.append(say.charAt(say.length()-1));
      
      return s.toString();
    }
}