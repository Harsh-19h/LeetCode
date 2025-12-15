class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String curr = strs[i];
            char c[] = curr.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            if(map.containsKey(temp)){
                map.get(temp).add(curr);
            } else{
                List<String> list = new ArrayList<>();
                map.put(temp,list);
                map.get(temp).add(curr);
            }
        }
        List<List<String>> ans = new ArrayList<>(map.values());
        return ans;
    }
}