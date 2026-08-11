class Solution {
    public static boolean helper(String curr){
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<curr.length();i++){
            if(set.contains(curr.charAt(i))) return false;
            else set.add(curr.charAt(i));
        }
        return true;
    }
    public int countGoodSubstrings(String s) {
        int ans = 0;
        int i  = 0;
        for(int j=0;j<s.length();j++){
           
            while(j-i+1>3){
                i++;
            }

            if(j-i+1 == 3){
                String curr = s.substring(i,j+1);
                
                if(helper(curr)) ans++;
            }
        }

        return ans;
    }
}