class Solution {
    public static void reverse(char arr[], int i, int j){
            while(i<j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }
    }
    public boolean rotateString(String s, String goal) {

        char start = goal.charAt(0);
        boolean ans = false;
        char arr[] = s.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==start){
                char copy[] = arr.clone();
                reverse(copy,0,i-1);
                reverse(copy,i,s.length()-1);
                reverse(copy,0,s.length()-1);

                String temp = new String(copy);
                if(temp.equals(goal)) ans = true;
            }
        }
        return ans;
    }
}