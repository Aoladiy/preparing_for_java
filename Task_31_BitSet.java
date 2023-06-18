import java.util.BitSet;

public class Task_31_BitSet {
    public static void main(String[] args) {
        BitSet bs1 = new BitSet(4);
        bs1.set(0, true);
        bs1.set(1, true);
        bs1.set(2, true);
        bs1.set(3, true);
        BitSet bs2 = new BitSet(4);
        bs2.set(0, true);
        bs2.set(1, false);
        bs2.set(2, false);
        bs2.set(3, false);
        System.out.println(bs1);
        bs1.and(bs2);
        System.out.println(bs1);

    }
}
