class Solution {
    public int totalFruit(int[] fruits) {
     int max =Integer.MIN_VALUE;
     HashMap<Integer,Integer> map = new HashMap<>();
     int low =0;
     int high = 0;
     while(high<fruits.length){
        if(map.containsKey(fruits[high])){
            int freq = map.get(fruits[high]);
            map.put(fruits[high],freq+1);
        }else map.put(fruits[high],1);
        high++;
        while(map.size()>2){
          int f = map.get(fruits[low]);
            map.put(fruits[low], f - 1);
            if (map.get(fruits[low]) == 0) {
            map.remove(fruits[low]);
            }
            low++;
        }
        int curr = high-low;
        max = Math.max(curr,max);
     }  
     return max;
    }
}