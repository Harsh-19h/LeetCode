class Solution {
    public int compress(char[] chars) {
        int k=0;
        int count =1;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]!=chars[i+1]){
                chars[k++] = chars[i];
                if(count>1){
                    String s = String.valueOf(count);
                    for(char c: s.toCharArray()) chars[k++] = c;
                } 
                count=1;
            } else{
                count++;
            }
        }
        chars[k++]=chars[chars.length-1];
       if(count>1){
            String s = String.valueOf(count);
            for(char c: s.toCharArray()) chars[k++] = c;
        } 
        return k;
    }
}