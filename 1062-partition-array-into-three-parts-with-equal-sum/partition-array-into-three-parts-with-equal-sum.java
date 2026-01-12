class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total =0;
        boolean allzero = true;
        for(int i=0;i<arr.length;i++){
            total+= arr[i];
            if(arr[i]!=0) allzero = false;
        }

        if(allzero) return true;
        if(total%3 != 0) return false;
        int parts = total/3;
        
        int currSum = 0;
        int idx = 0;
        int occurance = 0;

        while(idx<arr.length){
            currSum+=arr[idx++];

            if(currSum==parts){
                currSum =0;
                occurance++;
            }
        }
        if(occurance>=3) return true;
        return false;
    }
}