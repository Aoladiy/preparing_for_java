package Task_39_NOD;

public class Task_39_NOD_cikl {
    public static void main(String[] args) {
        int m = 20, n = 12;
        for(int i = Math.min(m, n); i > 0; i--){
            if ((m % i == 0) & (n % i == 0)){
                System.out.println(i);
                break;
            }

        }
    }
}
