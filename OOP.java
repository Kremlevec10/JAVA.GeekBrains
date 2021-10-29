package org.example;


import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        Staff staff1 = new Staff("Петров Николай Петроыич", "Програмист", "Email@gmail.com", 276853467, 43, 34000);
        staff1.conclusionInformationStaff();

        Staff[] staffArr = new Staff[5];
        staffArr[0] = new Staff("Петров Николай Петроыич", "Програмист", "Email@gmail.com", 276853467, 19, 34000);
        staffArr[1] = new Staff("Иванов Николай Петроыич", "Юрист", "Email@gmail.com", 276853467, 28, 34000);
        staffArr[2] = new Staff("Гатауллин Николай Петроыич", "Пианист", "Email@gmail.com", 276853467, 43, 34000);
        staffArr[3] = new Staff("Измайлов Николай Петроыич", "Футболист", "Email@gmail.com", 276853467, 87, 34000);
        staffArr[4] = new Staff("Шмидт Николай Петроыич", "Акробат", "Email@gmail.com", 276853467, -19, 34000);

        for (int i = 0; i < staffArr.length; i++) {
            if (staffArr[i].getAge() > 40) {
                staffArr[i].conclusionInformationStaff();
            }
        }


    }


}
