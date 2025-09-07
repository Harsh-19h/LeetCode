class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean remaining []= new boolean[fruits.length];
        for(int i = 0;i<remaining.length;i++){
            remaining[i]=true;
        }
        int  count = 0;
        for(int i=0;i<fruits.length;i++){
            boolean check =true;
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]>=fruits[i] && remaining[j]==true){
                    remaining[j]= false;
                    check=true;
                    break;
                } else check = false;
            }
            if(check==false) count++;
        }
        return count;
    }
}