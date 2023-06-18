import java.util.Scanner;

import static java.lang.Math.pow;

public class Task_3_digits_from_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
    }

    public static void reverse(int n){
        if (n < 9){
            System.out.print(n + " ");
        }
        else{
            reverse(n / 10);
            System.out.print(n % 10 + " ");
        }

    }
}
