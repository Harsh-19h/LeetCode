class Solution {
    public boolean detectCapitalUse(String word) {
        int count =0;
        boolean first =false;
        if(word.charAt(0)<'a') first = true;
        for(char ch: word.toCharArray()){
            if(ch<'a') count++;
        }
        if(count==word.length() || count==0) return true;
        else if(count==1 && first==true) return true;
        else return false;
    }
}