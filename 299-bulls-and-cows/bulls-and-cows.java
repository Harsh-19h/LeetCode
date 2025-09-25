class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)) bulls++;
            else {
                char ch = secret.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                } else map.put(ch,1);
            }
        }

        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)!= guess.charAt(i) && map.containsKey(guess.charAt(i))){
                cows++;
                char ch = guess.charAt(i);
                if(map.get(ch)==1) map.remove(ch);
                else map.put(ch,map.get(ch)-1);
            }
        }
        return bulls +"A" +cows +"B";
    }
}