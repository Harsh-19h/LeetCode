class Solution {
    public int compress(char[] s) {
        int k =0;
        int count =1;
        for(int i=0;i<s.length-1;i++){
            if(s[i]==s[i+1]){
                count++;
            } else{
                s[k++] = s[i];
                if(count>=10){
                    String temp = String.valueOf(count);
                    for(char c: temp.toCharArray()){
                        s[k++] = c;
                    }
                }
                else if (count>1 && count<10){
                    s[k++] = (char) (count +'0');
                }
                count=1;
            }
        }
        s[k++] = s[s.length-1];
        if(count>1 && count<10)  s[k++] = (char) (count +'0');
        if(count>=10){
            String temp = String.valueOf(count);
            for(char c: temp.toCharArray()){
                s[k++] = c;
            }
        }
        return k;
    }
}