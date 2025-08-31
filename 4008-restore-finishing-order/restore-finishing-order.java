class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int ans[] = new int[friends.length];
        int idx=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<friends.length;i++){
            set.add(friends[i]);
        }
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                ans[idx++]=order[i];
            }
        }
        return ans;
    }
}