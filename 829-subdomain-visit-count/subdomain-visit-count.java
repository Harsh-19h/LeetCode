class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<cpdomains.length;i++){
            String curr = cpdomains[i];
            String s[] = curr.split(" ");
            map.put(s[1],map.getOrDefault(s[1],0)+ Integer.parseInt(s[0]));
            for(int j=0;j<s[1].length();j++){
                if(s[1].charAt(j)=='.'){
                    String sub = s[1].substring(j+1,s[1].length());
                    map.put(sub,map.getOrDefault(sub,0)+Integer.parseInt(s[0]));
                }
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for(String key: map.keySet()){
            String ans = map.get(key) +" " +key;
            list.add(ans);
        }
        return list;
    }
}