class Solution {

    public static StringBuilder rev(StringBuilder st, int start, int end){
        while(start<end){
            char temp = st.charAt(start);
            st.setCharAt(start,st.charAt(end));
            st.setCharAt(end,temp);
            start++;    end--;
        }
        return st;
    }

    public String getPermutation(int n, int k) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++) sb.append(i);

        for(int count=1;count<k;count++){
            int idx = -1;
            for(int i=sb.length()-2;i>=0;i--){

                if(sb.charAt(i)<sb.charAt(i+1)){
                    idx = i;
                    break;
                }
                else continue;
            }  
            if(idx == -1){
                sb.reverse();
            }else{
                for(int j=sb.length()-1;j>idx;j--){
                    if(sb.charAt(j)>sb.charAt(idx)){
                        char temp = sb.charAt(idx);
                        sb.setCharAt(idx,sb.charAt(j));
                        sb.setCharAt(j,temp);

                        break;
                    }
                }
                sb = rev(sb,idx+1,sb.length()-1);
            }
        }
        String ans =  sb.toString();
        return ans;
    }  
}