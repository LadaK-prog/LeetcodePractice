class Solution {
    public int commonFactors(int a, int b) {
        int x = 0;

        int smaller = Math.min(a,b);

        for (int i = 1; i <= smaller; i++) {
            if (a % i == 0 && b % i == 0) {
                x++;
            }
        }
        return x;
    }
}