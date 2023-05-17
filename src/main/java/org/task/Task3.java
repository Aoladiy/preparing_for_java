package src.main.java.org.task;

public class Task3 {
    public static void main(String[] args) {
        int number = 2359;
        char[] chars = String.valueOf(number).toCharArray();
        for (char cha : chars) {
            System.out.print(cha + " ");
        }
    }
}
