class Solution {
    public static List<String> ans;

    public static boolean isValid(StringBuilder temp){
        int Count = 0;
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)=='(') Count++;
            else Count--;

            if(Count<0) return false;
        }
        return (Count==0);
        
    }
    public static void solve(StringBuilder curr, int n){
        if(curr.length()==2*n){
            boolean check = isValid(curr);
            if(check) ans.add(curr.toString());
            return;
        }
        curr.append('(');
        solve(curr,n);

        curr.deleteCharAt(curr.length()-1);

        curr.append(')');
        solve(curr,n);

        curr.deleteCharAt(curr.length()-1);

        return;
    }
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        solve(curr,n);
        return ans;
        
    }
}