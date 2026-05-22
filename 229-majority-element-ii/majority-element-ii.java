class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int a = 0, b = 0;
        int freq_a = 0, freq_b = 0;

        for(int num : nums) {

            if(num == a) {
                freq_a++;
            }

            else if(num == b) {
                freq_b++;
            }

            else if(freq_a == 0) {
                a = num;
                freq_a = 1;
            }

            else if(freq_b == 0) {
                b = num;
                freq_b = 1;
            }

            else {
                freq_a--;
                freq_b--;
            }
        }

        freq_a = 0;
        freq_b = 0;

        for(int num : nums) {
            if(num == a) freq_a++;
            else if(num == b) freq_b++;
        }

        if(freq_a > nums.length / 3) ans.add(a);
        if(freq_b > nums.length / 3) ans.add(b);

        return ans;
    }
}