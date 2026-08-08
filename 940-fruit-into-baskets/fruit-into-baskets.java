class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i =0;
        int ans = 0;
        for(int j=0;j<fruits.length;j++){
           map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);

           if(map.size()>2){
            while(map.size()>2){
                int freq = map.get(fruits[i]);
                map.put(fruits[i],freq-1);

                if(map.get(fruits[i])==0){
                    map.remove(fruits[i]);
                }

                i++;
            }
           }

           ans = Math.max(ans, (j-i+1));
        }
        return ans;
    }
}