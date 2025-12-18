class Solution {
    ArrayList<String> ans = new ArrayList<>();
    public static boolean isValid(String temp){
        if(temp.charAt(0)=='0' && temp.length()>1) return false;
        int val = Integer.parseInt(temp);
        if(val>=0 && val<=255) return true;
        else return false;
    }
    public void helper(String s, int idx, int parts, String curr,int n){

        if(idx==n && parts==4){
            ans.add(curr.substring(0,curr.length()-1));
            return;
        } 

        if(parts>4 || idx>n) return ;

        if(idx+1<=n){
            helper(s,idx+1,parts+1,curr+s.substring(idx,idx+1)+".",n);
        }

        if(idx+2<=n && isValid(s.substring(idx,idx+2))){
            helper(s,idx+2,parts+1,curr+s.substring(idx,idx+2)+".",n);
        }

        if(idx+3<=n && isValid(s.substring(idx,idx+3))){
            helper(s,idx+3,parts+1,curr+s.substring(idx,idx+3)+".",n);
        }

    }
    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        if(n>12) return ans;
        int parts =0;
        String curr ="";
        helper(s,0,parts,curr,n);
        return ans;
    }
}