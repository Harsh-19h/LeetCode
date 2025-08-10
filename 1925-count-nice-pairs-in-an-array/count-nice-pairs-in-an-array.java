class Solution {
    public int rev(int n){
        int ans = 0;
        while(n>0){
            int lastdigit =n%10;
            ans = ans*10+lastdigit;
            n= n/10;
        }
        return ans;
    }
    public int countNicePairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
     for(int i=0;i<nums.length;i++){
        int input =nums[i]-rev(nums[i]);
        if(map.containsKey(input)){
            int freq = map.get(input);
            count +=freq;
            count%=1000000007;
            map.put(input,freq+1);

        } else  map.put(input,1);
     }
     return count;   
    }
}