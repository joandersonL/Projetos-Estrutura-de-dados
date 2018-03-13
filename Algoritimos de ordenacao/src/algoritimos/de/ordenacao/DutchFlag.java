package algoritimos.de.ordenacao;

public class DutchFlag {

    static void swap(int[] a, int i, int j) {
        int x = a[i];
        a[i] = a[j];
        a[j] = x;
    }

    static void dutch_flag(int[] v) {
        int b = 0, i = 0, r = v.length - 1, n = v.length;
        while (b < n && v[b] == 0 ) {
            b++;
            i++;
        }
        while (i < n && v[i] == 1 ) {
            i++;
        }
        while (r >= 0 && v[r] == 2) {
            r--;
        }
        while (i <= r) {
            switch (v[i]) {
                case 0:
                    swap(v, i, b);
                    b++;
                    i++;
                    break;
                case 2:
                    swap(v, i, r);
                    r--;
                    break;
                default:
                    i++;
                    break;
            }
        }
    }
}
