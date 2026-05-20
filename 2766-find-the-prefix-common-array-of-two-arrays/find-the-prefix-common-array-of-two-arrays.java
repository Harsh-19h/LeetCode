class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int ans[] = new int[n];
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> st = new HashSet<>();
        int count = 0;
        for(int i=0;i<n;i++){
            set.add(A[i]);
            st.add(B[i]);
            if(A[i]==B[i]) count++;
            else{
                if(set.contains(B[i])) count++;
                if(st.contains(A[i])) count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}