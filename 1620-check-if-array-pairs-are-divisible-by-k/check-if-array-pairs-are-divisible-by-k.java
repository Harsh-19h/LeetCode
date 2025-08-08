class Solution {
    public boolean canArrange(int[] arr, int k) {
       for(int i=0;i<arr.length;i++){
        arr[i] = arr[i]%k;
        if(arr[i]<0) arr[i]+=k;
       } 

       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            int freq = map.get(arr[i]);
            map.put(arr[i],freq+1);
        }else{
            map.put(arr[i],1);
        }
       }

        if (map.containsKey(0)) {
        if (map.get(0) % 2 != 0) return false;
        map.remove(0);
        }

        if (k % 2 == 0 && map.containsKey(k / 2)) {
            if (map.get(k / 2) % 2 != 0) return false;
            map.remove(k / 2);
        }

       for(int Key : map.keySet()){
        int diff = k-Key;
        if(map.containsKey(diff)){
            if(map.get(Key).equals(map.get(diff))) continue;
            else return false;
        }
        else return false;
       }

       return true;
    }
}