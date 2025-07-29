class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count =0;
        for(int i=0;i<words.length;i++){
            String str = words[i];
            String reverse = new StringBuilder(str).reverse().toString();
            if(set.contains(reverse)){
                count++;
            }else{
                set.add(str);
            }
        }
        return count;
    }
}