class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer> list = new ArrayList<>();
       while(num>0){
        int lastdigit =num%10;
        list.add(lastdigit);
        num/=10;
       } 
       Collections.reverse(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==6){
              list.set(i,9);
            break;
            }
        }
        int ans=0;
        for(int i=0;i<list.size();i++){
            ans = ans*10 +list.get(i);
        }
        return ans;
    }
}