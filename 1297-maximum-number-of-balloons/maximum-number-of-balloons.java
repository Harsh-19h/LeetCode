class Solution {
    public int maxNumberOfBalloons(String text) {
      int arr[] = new int[5];
      for(int i=0;i<text.length();i++){
        char ch = text.charAt(i);
        if(ch=='b') arr[0]++;
        else if(ch=='a') arr[1]++;
        else if(ch=='l')arr[2]++;
        else if(ch=='o') arr[3]++;
        else if(ch=='n') arr[4]++;
        else continue;
      } 
      arr[2] /=2;
      arr[3] /=2;
      int min = Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]<min) min = arr[i];
      }
      return min;
    }
}