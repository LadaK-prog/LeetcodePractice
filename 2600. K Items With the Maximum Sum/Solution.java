class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes  >= k) {
            return k;
        }
        if((numOnes + numZeros) < k) {
            k -= (numOnes + numZeros);
            return numOnes - k;
        }
        if(numOnes < k) {
            return numOnes;
        }
        return k;
    }
}