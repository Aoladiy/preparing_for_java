package src.main.java.org.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputSplit = input.split(" ");
        String numberOne = inputSplit[0];
        String operation = inputSplit[1];
        String numberTwo = inputSplit[2];

        int result;
        switch (operation) {
            case "плюс" -> result = wordToNumber(numberOne) + wordToNumber(numberTwo);
            case "минус" -> result = wordToNumber(numberOne) - wordToNumber(numberTwo);
            case "умножить" -> result = wordToNumber(numberOne) * wordToNumber(numberTwo);
            default -> {
                System.out.println("Некорректная операция");
                return;
            }
        }
        String resultText = numberToWord(result);
        System.out.println("Результат: " + resultText);
    }
    public static int wordToNumber(String word) {
        Map<String, Integer> wordToNumberMap = new HashMap<>();
        wordToNumberMap.put("ноль", 0);
        wordToNumberMap.put("один", 1);
        wordToNumberMap.put("два", 2);
        wordToNumberMap.put("три", 3);
        wordToNumberMap.put("четыре", 4);
        wordToNumberMap.put("пять", 5);
        wordToNumberMap.put("шесть", 6);
        wordToNumberMap.put("семь", 7);
        wordToNumberMap.put("восемь", 8);
        wordToNumberMap.put("девять", 9);

        return wordToNumberMap.getOrDefault(word, -1);
    }

    public static String numberToWord(int number) {
        Map<Integer, String> numberToWordMap = new HashMap<>();
        numberToWordMap.put(0, "ноль");
        numberToWordMap.put(1, "один");
        numberToWordMap.put(2, "два");
        numberToWordMap.put(3, "три");
        numberToWordMap.put(4, "четыре");
        numberToWordMap.put(5, "пять");
        numberToWordMap.put(6, "шесть");
        numberToWordMap.put(7, "семь");
        numberToWordMap.put(8, "восемь");
        numberToWordMap.put(9, "девять");
        numberToWordMap.put(10, "десять");
        numberToWordMap.put(11, "одинадцать");
        numberToWordMap.put(12, "двенадцать");
        numberToWordMap.put(13, "тринадцать");
        numberToWordMap.put(14, "четырнадцать");
        numberToWordMap.put(15, "пятнадцать");
        numberToWordMap.put(16, "шестнадцать");
        numberToWordMap.put(17, "семнадцать");
        numberToWordMap.put(18, "восемнадцать");
        numberToWordMap.put(19, "девятнадцать");

        return numberToWordMap.getOrDefault(number, "");
    }
}
