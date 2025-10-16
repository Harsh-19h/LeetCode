class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       String arr[] = s1.split(" ");
       String brr[] = s2.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<brr.length;i++){
            map2.put(brr[i],map2.getOrDefault(brr[i],0)+1);
        }
        ArrayList<String> ans = new ArrayList<>();
        for(String s: map.keySet()){
            if(map2.containsKey(s)) continue;
            else{
                int freq = map.get(s);
                if(freq==1) ans.add(s);
            }
        }
         for(String s: map2.keySet()){
            if(map.containsKey(s)) continue;
            else{
                int freq = map2.get(s);
                if(freq==1) ans.add(s);
            }
        }
        String res[] = ans.toArray(new String[0]);
        return res;
    }
}