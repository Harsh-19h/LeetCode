class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<time.length;i++){
            int key = time[i]%60;
            map.put(key,map.getOrDefault(key,0)+1);
        }
        long count = 0;
        for(int key: map.keySet()){
            int diff = (60-key)%60;
            if(diff==0 || diff == key){
                long n = map.get(key);
                count += n * (n - 1) / 2;
            } 
            else if(map.containsKey(diff)){
                if(key<diff)
               count+= (long) map.get(diff) * map.get(key);
            }
        }
        return (int) count;
    }
}