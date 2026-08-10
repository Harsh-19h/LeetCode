class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int i=0;
        int count = 0;

        for(int j=0;j<s.length();j++){
            if("aeiou".indexOf(s.charAt(j))>=0) count++;

            while(j-i+1>k){
                if("aeiou".indexOf(s.charAt(i))>=0) count--;
                i++;
            }
            
            if(j-i+1==k) ans = Math.max(ans,count);
        }
        return ans;
    }
}