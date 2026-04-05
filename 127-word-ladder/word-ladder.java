class Solution {
    class pair{
        String word;
        int lvl ;
        pair(String word, int lvl){
            this.word = word;
            this.lvl = lvl;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            set.add(wordList.get(i));
        }
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(beginWord,1));
        while(!q.isEmpty()){
            pair curr = q.remove();
            String w = curr.word;
            int level = curr.lvl;
            if(w.equals(endWord)==true) return level;
            for(int i=0;i<w.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char replaceArray[] = w.toCharArray();
                    replaceArray[i] = ch;
                    String newWord = new String(replaceArray);
                    if(set.contains(newWord)){
                        set.remove(newWord);
                        q.add(new pair(newWord,level+1));
                    }
                }
            }
        }
        return 0;   
    }
}