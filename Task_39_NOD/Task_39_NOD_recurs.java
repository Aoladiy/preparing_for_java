package Task_39_NOD;

public class Task_39_NOD_recurs {
    public static void main(String[] args) {
        int m = 20, n = 12;
        System.out.println(nod(m, n, Math.min(m, n)));
    }

    public static int nod(int m, int n, int nod) {
        if ((m % nod == 0) & (n % nod == 0)) return nod;
        return nod(m, n, nod - 1);
    }
}
