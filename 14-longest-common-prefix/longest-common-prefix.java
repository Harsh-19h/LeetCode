class Solution {
    public String longestCommonPrefix(String[] strs) {

        int min = Integer.MAX_VALUE;
        int idx = 0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min = strs[i].length();
                idx = i;
            }
        }
        String base = strs[idx];

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<base.length();i++){

            char curr = strs[0].charAt(i);

            for(int j=0;j<strs.length;j++){
                if(curr!=strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(curr);
        }
        return sb.toString();
    }
}