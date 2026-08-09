class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        int i=0;
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<s.length();j++){
            sb.append(s.charAt(j));

            while(sb.length()>10){
                sb.deleteCharAt(0);
                i++;
            }

            if(sb.length()==10){
                String curr = sb.toString();
                map.put(curr, map.getOrDefault(curr,0)+1);
            }
        }

        for(String key: map.keySet()){
            if(map.get(key)>1) ans.add(key);
        }

        return ans;
    }
}