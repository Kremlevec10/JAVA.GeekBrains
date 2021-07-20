/*
1. Написать метод, принимающий на вход два целых числа и проверяющий,
   что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
   положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
3. Написать метод, которому в качестве параметра передается целое число.
   Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
4. Написать метод, которому в качестве аргументов передается строка и число,
   метод должен отпечатать в консоль указанную строку, указанное количество раз;
5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
   не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
*/
package practic;

public class Main {

    public static void main(String[] args) {
/* Задача */
 /*Реш 1*/  boolean bool = metod1(5,6);
            System.out.println(bool);
 /*Реш 2*/  boolean bool3 = metod11(4,9);
            System.out.println(bool3);
/* Реш 3*/  boolean bool4 = metod12(13,9);
            System.out.println(bool4);

 /* Задача №2 */ metod2(-6);

 /* Задача №3 */ boolean bool2 = metod3(8);
                System.out.println("Значение " + bool2);

 /* Задача №4*/ metod4(9,"Hello");

 /* Задача №5*/ boolean years = metod5(600);
                System.out.println(years);
    }
// Зада №1

    static boolean metod1 (int a, int b) {
        int sum = a + b;
        boolean bool;
        if ( sum >= 10 && sum <=20) {
          return bool = true;
        }
        return bool = false;
        }
// Решение 2
        static boolean metod11 (int a, int b) {
        boolean bool;
        while ( a+b>=10 && a+b<=20) {
            return bool = true;
        }
        return bool = false;
        }
// Решение 3
        static boolean metod12 (int a, int b) {
        boolean bool2 = false;
        for (boolean bool;a+b>=10 && a+b<=20;) {
            return bool = true;
        }
        return bool2;
        }

// Задача №2

   static void metod2 (int a) {
        if ( a >= 0) {
            System.out.println( a + " положительное число");
            return;
        } else if (a < 0) {
            System.out.println(a + " отрицательное число");
            return;
        }
   }

// Задача №3

    static boolean metod3 (int a) {
        boolean bool;
        while (a >= 0) {
        return bool = false;
        }
        return bool = true;
    }

// Задача №4

    static void metod4 (int a, String string) {
        int b = 0;
        while ( b < a ) {
            System.out.println(string);
            b++;
        }

    }

// Задача №5

    static boolean metod5 (int a) {
        boolean bool;
        if ( a % 400 == 0 ) {
           return bool = true;
        } else if ( a % 100 == 0 ) {
           return bool = false;
        } else if ( a % 4 == 0 ) {
            return bool = true;
        } else {
            return bool = false;
        }

        }

        }







