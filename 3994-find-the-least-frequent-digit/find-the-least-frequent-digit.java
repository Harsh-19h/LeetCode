class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n>0){
            int lastdigit = n%10;
            if(map.containsKey(lastdigit)){
                int freq = map.get(lastdigit);
                map.put(lastdigit,freq+1);
            }else  map.put(lastdigit,1);
            n/=10;
        }
        int ans =Integer.MAX_VALUE;
        int digit = Integer.MAX_VALUE;
        for(int key: map.keySet()){
           int freq= map.get(key);
           if (freq==ans){
            digit= Math.min(digit,key);
           }
           if(freq<ans){
            ans = freq;
            digit = key;
           }
        }
        return digit;
    }
}