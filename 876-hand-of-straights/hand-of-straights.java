class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n<groupSize) return false;
        if(n%groupSize!=0) return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0;i<hand.length;i++){
            if(map.containsKey(hand[i])){
                int freq = map.get(hand[i]);
                map.put(hand[i],freq+1);
            } else map.put(hand[i],1);
        }
        while(map.size()!=0){
            int first = map.firstKey();
            for(int i=0;i<groupSize;i++){
                int curr = first+i;
                if(!map.containsKey(curr)) return false;
                int freq = map.get(curr);
                if(freq==1) map.remove(curr);
                else map.put(curr,freq-1);
            }
        }
       return true;
    }
}