class Solution {
    public int findClosest(int x, int y, int z) {
        int distancex = Math.abs(z-x);
        int distancey = Math.abs(z-y);
        if(distancex<distancey) return 1;
        else if(distancex>distancey) return 2;
        else return 0;
    }
}