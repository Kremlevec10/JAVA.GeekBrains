package ru.geekbrains;

import java.util.Arrays;
import java.util.Random;

/*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
то есть [0][0], [1][1], [2][2], …, [n][n];
5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
 каждая ячейка которого равна initialValue;
6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
если в массиве есть место, в котором сумма левой и правой части массива равны.
**Примеры:
checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
При каком n в какую сторону сдвиг можете выбирать сами.

 */
public class lesson3 {
    public static void main(String[] args) {

        array1();

        array2();

        array3();

        array4();

        System.out.println(Arrays.toString(array5(3, 34)));

        array6();

        int[] arr = {1, 2, 3, 4, 5 , 6 , 7};
        System.out.println(arr7(arr));

        shiftNumber(arr, -2);
    }

    public static void array1() {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void array2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void array3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void array4() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || (i + j) == arr.length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static int[] array5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }


    public static void array6() {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        int max = 0, min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.printf("Максимальное число %d\nМинимальное число %d\n", max, min);
    }

    public static boolean arr7(int[] arr) {
        int sum1 = 0, sum2 = 0;
        boolean bool = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0) {
                sum1 = arr[i];
            } else {
                sum1 = sum1 + arr[i];
            }
            for (int j = arr.length - 1; j > 0; j--) {
                if (j == (arr.length - 1)) {
                    sum2 = arr[j];
                } else {
                    sum2 = sum2 + arr[j];
                }

                if (sum1 == sum2) {
                    bool = true;
                } else {
                    bool = false;
                }
            }
        }
        return bool;
    }

    /*
8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
При каком n в какую сторону сдвиг можете выбирать сами.
     */
    public static void shiftNumber(int[] arr, int n) {
        System.out.println(Arrays.toString(arr));

        int variable = 0;
        if (n < 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i - n > arr.length - 1) {
                    n = -(arr.length - 1 - i);
                }
                variable = arr[i];
                arr[i] = arr[i - n];
                arr[i - n] = variable;

            }
        } else if (n > 0) {
            for (int i = arr.length - 1; i > 0; i--) {
                if (i >= n) {
                variable = arr[i];
                arr[i] = arr[i-n];
                arr[i-n] = variable;
                }
                if (i < n) {
                    variable = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = variable;
            }

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}