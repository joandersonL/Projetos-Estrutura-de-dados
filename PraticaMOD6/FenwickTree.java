public class FenwickTree {
    
    int value;
    int leftsize;
    FenwickTree left;
    FenwickTree right;

    FenwickTree(int value) {

    }

    FenwickTree(int leftSize, FenwickTree left, FenwickTree right) {

    }

    public String toString() {
        return;
    }

    static FenwickTree allZeros(int n) {
        if (n == 0)
            return null;
        if (n == 1)
            return new FenwickTree(0);
        int m = n / 2;
        return new FenwickTree(0, n - m, allZeros(n - m), allZeros(m));
    }

    public int size() {

    }

    //void increment(int i, int delta, FenwickTree t)
    public void increment(int i, int delta) {
        value += delta;
        if (leftsize > i) {
            left.increment(i, delta);
        } else
            right.increment(i - leftsize, delta);
    }

    public int prefixSum(int upto) {

    }
    public int between(int lo, int hi){

    }
}