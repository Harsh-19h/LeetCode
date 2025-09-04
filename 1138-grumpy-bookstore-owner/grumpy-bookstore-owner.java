class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0) satisfied+=customers[i];
        }
        int extra=0;
        int maxextra = 0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==1) extra+=customers[i];
            if(i>=minutes){
                if(grumpy[i-minutes]==1){
                    extra-=customers[i-minutes];
                }
            }
            maxextra = Math.max(maxextra,extra);
        }
        return satisfied+maxextra;
    }
}