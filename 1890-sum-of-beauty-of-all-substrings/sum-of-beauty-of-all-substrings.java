class Solution {
    public int beautySum(String s) {

        int sum = 0;

        for(int i=0;i<s.length();i++){

            int freq[] = new int[26];

            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;

                int max = 1;
                int min = Integer.MAX_VALUE;
                for(int k=0;k<freq.length;k++){
                    if(freq[k]>=max) max = freq[k];
                    if(freq[k]<=min && freq[k]!=0) min = freq[k];
                }
                sum += (max-min);
            }
        }
        return sum;
    }
}