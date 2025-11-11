class Solution {
    public String destCity(List<List<String>> paths) {
       HashMap<String,Boolean> map = new HashMap<>();
       for(int i=0;i<paths.size();i++){
        String a = paths.get(i).get(0);
        String b = paths.get(i).get(1);
        map.put(a,false);
        map.put(b,false);
       }
       for(int i=0;i<paths.size();i++){
        String from = paths.get(i).get(0);
        if(map.containsKey(from)){
            map.put(from,true);
        }
       }
        for(String key: map.keySet()){
            if(!map.get(key)) return key;
        }
        return "";
    }
}