class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);

        int ans = 0;
        int i=0,j=1;

        if(s.length()==1){
            ans+= map.get(s.substring(0));
            return ans;
        }
        while(j<s.length()){
            String curr = s.substring(i,j+1);
            if(map.containsKey(curr)){
                ans+=map.get(curr);
                i=i+2; j= j+2;
            }
            else {
                ans += map.get(s.substring(i,j));
                i++;j++;
            }
        }
        if(!map.containsKey(s.substring(s.length()-2))){
            ans+= map.get(s.substring(s.length()-1));
        }
        return ans;
    }
}