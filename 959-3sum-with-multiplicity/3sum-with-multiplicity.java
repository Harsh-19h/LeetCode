class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long count = 0;
        long freq[] = new long[101];
        for(int val: arr) {
            freq[val]++;
        }
        for(int i=0;i<=100;i++){
            if(freq[i]==0) continue;
            for(int j=i;j<=100;j++){
                if(freq[j]==0) continue;
                int k= target-i-j;
                if(k<0 || k>100 || k<j || freq[k]==0) continue;

                if(i==j && j==k){
                    count += freq[i] * (freq[i]-1) * (freq[i]-2) /6;
                }
                else if(i==j && j!=k){
                    count+= freq[i]* (freq[i]-1)/2 * freq[k];
                }
                else if(i<j && j==k){
                    count+= freq[i] * freq[j] * (freq[j]-1) /2;
                } 
                else if(i<j && j<k) {
                    count+= freq[i] *freq[j] * freq[k];
                }
            }
        }
        return (int) (count%1000000007);
    }
}