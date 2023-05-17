package src.main.java.org.task;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        String str = "I have 3 cats, 4 dogs, and 1 turtle";
        char[] chars = str.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for (char cha : chars) {
            if (Character.isDigit(cha)) {
                list.add(Integer.parseInt(String.valueOf(cha)));
            }
        }
        System.out.println(list);
    }
}
