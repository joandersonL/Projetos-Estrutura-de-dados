import javax.lang.model.util.ElementScanner6;

public class FenwickTree {

    int value;
    int leftSize;
    FenwickTree left;
    FenwickTree right;

    FenwickTree(int value) {
        this.value = value;
        this.leftSize = 0;
        this.left = null;
        this.right = null;
    }

    FenwickTree(int leftSize, FenwickTree left, FenwickTree right) {
        this.value = left.value + right.value;
        this.leftSize = leftSize;
        this.left = left;
        this.right = right;
    }

    FenwickTree(int value, int leftSize, FenwickTree left, FenwickTree right) {
        this.value = value;
        this.leftSize = leftSize;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        if (left == null && right == null)
            return "[" + Integer.toString(value) + ", " + Integer.toString(leftSize) + "]";
        else if (left == null)
            return "[" + Integer.toString(value) +  ","+ Integer.toString(leftSize)+  ","+ right.toString() + "]";
        else if (right == null)
            return "[" + Integer.toString(value)  + "," + Integer.toString(leftSize) + ","+ left.toString() + "]";

        else
            return "[" + Integer.toString(value)  + "," + Integer.toString(leftSize)+ "," + left.toString() + ","+ right.toString() + "]";
    }

    static FenwickTree allZeros(int n) {
        if (n == 0)
            return null;
        if (n == 1)
            return new FenwickTree(0);
        int m = n / 2;
        return new FenwickTree(0, n - m, allZeros(n - m), allZeros(m));
    }

    public int size() { // retorna num de folhas
        return 0;
    }

    public int prefixSum(int upto) { // soma dos valores das folhas, 0 ≤ upto < n
        return 0;
    }

    public int between(int lo, int hi) { // soma dos valores das folhas, 0 ≤ lo ≤ hi ≤ n, 
        return 0;
    }

    public void increment(int i, int delta) {
        value += delta;
        if (leftSize > i) {
            left.increment(i, delta);
        } else
            right.increment(i - leftSize, delta);
    }

    /*
     * public static void main(String[] args) {
     * System.out.println("Construcao de FenwickTree(3) : " + new FenwickTree(3));
     * System.out.println("Construcao da arvore da figura : " + new FenwickTree(3,
     * new FenwickTree(1, new FenwickTree(4), new FenwickTree(1, new FenwickTree(2),
     * new FenwickTree(5))), new FenwickTree(1, new FenwickTree(3), new
     * FenwickTree(1, new FenwickTree(6), new FenwickTree(1))))); }
     */
    public static void main(String[] args) {
        System.out.println("Construcao de allZeros(3) :" + FenwickTree.allZeros(3));
        System.out.println("Construcao de allZeros(4):" + FenwickTree.allZeros(4));
        System.out.println("Construcao de allZeros(5):" + FenwickTree.allZeros(5));
        System.out.println("Construcao de allZeros(6):" + FenwickTree.allZeros(6));
    }
}