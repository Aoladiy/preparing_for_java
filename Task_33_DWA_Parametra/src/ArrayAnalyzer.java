// Файл com/example/analyzer/ArrayAnalyzer.java
package com.example.analyzer;

public class ArrayAnalyzer {
    private int[][] array; // Массив для анализа

    // Конструктор класса принимает массив для анализа
    public ArrayAnalyzer(int[][] array) {
        this.array = array;
    }

    public void analyze() {
        // Первоначально считаем, что минимум и максимум - это первый элемент массива
        int min = array[0][0];
        int max = array[0][0];
        int minRow = 0;
        int minCol = 0;
        int maxRow = 0;
        int maxCol = 0;

        // Проходим по всем элементам массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Если текущий элемент меньше минимума, обновляем минимум и его индексы
                if (array[i][j] < min) {
                    min = array[i][j];
                    minRow = i;
                    minCol = j;
                }

                // Если текущий элемент больше максимума, обновляем максимум и его индексы
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Выводим результаты
        System.out.println("Минимальное значение: " + min + " находится в ячейке [" + minRow + "][" + minCol + "]");
        System.out.println("Максимальное значение: " + max + " находится в ячейке [" + maxRow + "][" + maxCol + "]");
    }
}

