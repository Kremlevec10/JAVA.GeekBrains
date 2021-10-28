import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToc {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        int horizontal = choiceDifficulty(), vertical = horizontal;
        char[][] field = new char[vertical][horizontal];

        greatField(field);

        drawField(field);
        while (true) {
            movePlayer(field);

            drawField(field);

            moveComputer(field);

            drawField(field);

            checkHorizontal(field);
            checkVertical(field);
            checkLeftDiaganal(field);
            checkRighttDiaganal(field);
            checkDraw(field);

        }
    }


    // Написать проверку
    public static void checkDraw(char[][] field) {
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != '-') {
                    count++;
                }
            }
        }
        if (count == field.length * field.length) {
            System.out.println("Ничья");
            System.exit(0);
        }
    }

    public static void checkRighttDiaganal(char[][] field) {
        int j = 0;
        int count = 0;
        while (j < field.length) {

            for (int i = 0; i < field[j].length; i++) {
                if (field[j][i] == 'X' && i + j == field[j].length - 1) {
                    count++;
                } else if (field[j][i] == 'O' && i + j == field[j].length - 1) {
                    count--;
                }
                if (count == field.length) {
                    System.out.println("Вы вsйграли");
                    System.exit(0);
                } else if (count == -(field.length)) {
                    System.out.println("Вы проиграли");
                    System.exit(0);
                }
            }
            j++;
        }
    }

    public static void checkLeftDiaganal(char[][] field) {
        int j = 0;
        int count = 0;
        while (j < field.length) {

            for (int i = 0; i < field[j].length; i++) {
                if (field[j][i] == 'X' && i == j) {
                    count++;
                } else if (field[j][i] == 'O' && i == j) {
                    count--;
                }
                if (count == field.length) {
                    System.out.println("Вы вsйграли");
                    System.exit(0);
                } else if (count == -(field.length)) {
                    System.out.println("Вы проиграли");
                    System.exit(0);
                }
            }
            j++;
        }
    }

    public static void checkHorizontal(char[][] field) {
        int j = 0;
        while (j < field.length) {
            int count = 0;
            for (int i = 0; i < field[j].length; i++) {
                if (field[j][i] == 'X') {
                    count++;
                } else if (field[j][i] == 'O') {
                    count--;
                }
                if (count == field.length) {
                    System.out.println("Вы вsйграли");
                    System.exit(0);
                } else if (count == -(field.length)) {
                    System.out.println("Вы проиграли");
                    System.exit(0);
                }
            }
            j++;
        }
    }

    public static void checkVertical(char[][] field) {
        int j = 0;
        while (j < field.length) {
            int count = 0;
            for (int i = 0; i < field[j].length; i++) {
                if (field[i][j] == 'X') {
                    count++;
                } else if (field[i][j] == 'O') {
                    count--;
                }
                if (count == field.length) {
                    System.out.println("Вы выйграли");
                    System.exit(0);
                } else if (count == -(field.length)) {
                    System.out.println("Вы проиграли");
                    System.exit(0);
                }
            }
            j++;
        }
    }


    public static void moveComputer(char[][] field) {
        int horizontal, vertical;
        Random rand = new Random();
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != '-') {
                    count++;
                }
            }
        }
        if (count == field.length * field.length) {
            System.out.println("");
            return;
        }
        vertical = rand.nextInt(field.length);
        horizontal = rand.nextInt(field.length);
        if (field[vertical][horizontal] != '-') {
            moveComputer(field);
        } else {
            field[vertical][horizontal] = 'O';
            System.out.println("");
        }
    }

    public static void movePlayer(char[][] field) {
        int horizontal, vertical;
        do {
            System.out.printf("Введите число 1-%d по горизонтале \n", field.length);
            horizontal = scan.nextInt() - 1;
            System.out.printf("Введите число 1-%d по вертикале\n", field.length);
            vertical = scan.nextInt() - 1;
        } while (horizontal < 0 || horizontal > field.length || vertical < 0 || vertical > field.length);
        if (field[horizontal][vertical] != '-') {
            System.out.println("Ячейка уже занята");
            movePlayer(field);
        } else {
            field[horizontal][vertical] = 'X';
            System.out.println("");
        }

    }

    public static int choiceDifficulty() {
        int difficult;
        do {
            System.out.print("Выберите сложность\n 1. Поле 3*3 - введите цифру 1\n " +
                    "2. Поле 4*4 - введите цифру 2\n " +
                    "3. Поле 5*5 - введите цифру 3\n");
            difficult = scan.nextInt();
        } while (difficult < 1 || difficult > 3);

        switch (difficult) {
            case 1: {
                difficult = 3;
                break;
            }
            case 2: {
                difficult = 4;
                break;
            }
            case 3: {
                difficult = 5;
                break;
            }

        }

        return difficult;
    }

    public static void greatField(char field[][]) {
        Arrays.stream(field).forEach(chars -> Arrays.fill(chars, '-'));
    }


    public static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
