package ru.geekbrains;

/*
 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
 в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
если число отрицательное, и вернуть false если положительное.
4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
указанную строку, указанное количество раз;
5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class HomeWork {
    public static void main(String[] args) {
        System.out.println(chekSumNumber(9, 5));

        positiveOrNegative(-4);

        System.out.println(chekNumberPositive(8));

        printLine(3, "Hello World!!!");

        System.out.println("Year to the leap year ? - " + chekLeapYear(2100));
    }

    public static boolean chekSumNumber(int a, int b) {
        boolean chek = (a + b >= 10) && (a + b <= 20);
        return chek;

    }

    public static void positiveOrNegative(int a) {

        if (a >= 0) {
            System.out.println("Number positive");
        } else {
            System.out.println("Number negative");
        }
    }

    public static boolean chekNumberPositive(int number) {
        boolean positiveOrNegative = number < 0;
        return positiveOrNegative;
    }

    public static void printLine(int a, String line) {

        for (int i = 0; i < a; i++) {

            System.out.println(line);

        }
    }

    public static boolean chekLeapYear(int year) {
        boolean chekLeap = (year % 4 == 0) && (year % 400 == 0 || year % 100 != 0) ;
        return chekLeap;
    }
}
