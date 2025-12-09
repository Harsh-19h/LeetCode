class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            s1.append(word1[i]);
        }
        StringBuilder s2 = new StringBuilder();
        for(int i=0;i<word2.length;i++){
            s2.append(word2[i]);
        }
        String w1 =s1.toString();
        String w2 = s2.toString();
        return w1.equals(w2);
    }
}