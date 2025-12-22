class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i=0;i<words.length-1;i++){
            String curr = words[i];
            HashSet<Character> set = new HashSet<>();
            for(char c: curr.toCharArray()) set.add(c);
            for(int j=i+1;j<words.length;j++){
                String temp = words[j];
                boolean same =false;
                for(char ch: temp.toCharArray()){
                    if(set.contains(ch)){
                        same =true;
                        break;
                    }
                }
                if(same) continue;
                else max = Math.max(max,words[i].length()*words[j].length());
            }
        }
        return max;
    }
}