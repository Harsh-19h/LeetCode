class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i =0;i<nums1.length;i++){
        if(map.containsKey(nums1[i])){
            int freq= map.get(nums1[i]);
            map.put(nums1[i],freq+1);
        } else map.put(nums1[i],1);
     }  
        ArrayList<Integer> ans = new ArrayList<>();
    for(int i=0;i<nums2.length;i++){
        if(map.containsKey(nums2[i])){
            int val = map.get(nums2[i]);
            if(val==1) map.remove(nums2[i]);
            else map.put(nums2[i],val-1);
            ans.add(nums2[i]);
        }
    }
    int arr[] = new int[ans.size()];
    for(int i = 0;i<arr.length;i++){
        arr[i] = ans.get(i);
    }
    return arr;
    }
}