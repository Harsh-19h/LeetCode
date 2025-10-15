class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String words[] = paragraph.toLowerCase().replaceAll("[^a-zA-Z]"," ").split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<String> ban = new HashSet<>();
        for(int i=0;i<banned.length;i++){
            ban.add(banned[i]);
        }
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()- a.getValue());
        for(int i=0;i<list.size();i++){
            if(ban.contains(list.get(i).getKey())){
                continue;
            }
            else return list.get(i).getKey().toLowerCase();
        }
        return "";
    }
}