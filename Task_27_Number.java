import java.util.Scanner;

public class Task_27_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long digit = sc.nextInt();
        int syst = sc.nextInt();
        if (syst == 2){
            System.out.println(Long.toBinaryString(digit));
        }
        if (syst == 8){
            System.out.println(Long.toOctalString(digit));
        }
        if (syst == 16){
            System.out.println(Long.toHexString(digit));
        }

    }
}
