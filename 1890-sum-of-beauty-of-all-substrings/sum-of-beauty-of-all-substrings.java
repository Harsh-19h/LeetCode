class Solution {
    public int beautySum(String s) {
        int sum =0;
        for(int i=0;i<s.length();i++){
               HashMap<Character,Integer> map = new HashMap<>();
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                    if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                } else map.put(ch,1);

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for(char key: map.keySet()){
                    if(map.get(key)<min) min = map.get(key);
                    if(map.get(key)>max) max = map.get(key);
                }
                 int diff = max-min;
                 sum+=diff;
            }   
        }
     return sum;   
    }
}