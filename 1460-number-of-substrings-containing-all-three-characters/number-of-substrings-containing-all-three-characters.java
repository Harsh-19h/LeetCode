class Solution {
    public int numberOfSubstrings(String s) {
        int arr[] = new int[3];
        int n = s.length();

        int count = 0;
        int i = 0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='a') arr[0]++;
            else if(s.charAt(j)=='b') arr[1]++;
            else  arr[2]++;

            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                count += n-j;

                if(s.charAt(i)=='a') arr[0]--;
                else if(s.charAt(i)=='b') arr[1]--;
                else arr[2]--;

                i++;
            }
        }
        return count;
    }
}