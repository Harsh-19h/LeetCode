class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            int curr = arr1[i];
            while(curr>0){
                set.add(curr);
                curr /= 10;
            }
        }
        int ans = 0;
        for(int i=0;i<arr2.length;i++){
            int curr = arr2[i];
            while(curr>0){
                if(set.contains(curr)){
                    String s = String.valueOf(curr);
                    ans = Math.max(ans,s.length());
                }
                curr/=10;
            }
        }
        return ans;
    }
}