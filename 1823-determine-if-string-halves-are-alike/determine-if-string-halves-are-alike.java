class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0;
        int count2=0;
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(i<=(s.length()/2)-1){
           if("aeiouAEIOU".indexOf(ch)!=-1) count1++;
        }
        else{
            if("aeiouAEIOU".indexOf(ch)!=-1) count2++;
        }
      } 
      return(count1==count2);   
    }
}