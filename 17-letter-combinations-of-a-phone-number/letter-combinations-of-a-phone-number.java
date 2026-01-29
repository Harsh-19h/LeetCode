class Solution {

    public void solve(int idx,String digit,StringBuilder temp,List<String> ans,HashMap<Character,String> map){
        if(idx>=digit.length()){
            ans.add(temp.toString());
            return ;
        }
            char ch = digit.charAt(idx);
            String curr = map.get(ch);
            for(int i=0;i<curr.length();i++){
                temp.append(curr.charAt(i));
                solve(idx+1,digit,temp,ans,map);
                temp.deleteCharAt(temp.length()-1);
            }

    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        StringBuilder temp = new StringBuilder();

        if(digits.length()==0){
            ans.add("");
            return ans;
        }

        solve(0,digits,temp,ans,map);
        return ans;
    }
}