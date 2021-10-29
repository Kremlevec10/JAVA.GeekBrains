package org.example;

/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 */
public class Staff {
    private String name, post, email;
    private int age , salary;
    long phone;

    Staff() {

    }

    Staff(String name, String post, String email, long phone, int age, int salary) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        if (age > 0) {
        this.age = age;
        } else {
            System.out.println("Возраст не может быть меньше нуля");
        }
        this.salary = salary;
    }

    void conclusionInformationStaff() {
        System.out.printf("Сотрудник: %s занимаемая должность: %s Email: %s номер " +
                "телефона: 9%d возраст: %d зарплата: %d\n",name, post, email, phone, age, salary);
    }

    void setName(String name) {
        this.name = name;
    }





    String getName() {
        return name;
    }

    String getPost() {
        return post;
    }

    String getEmail() {
        return email;
    }

    long getPhone() {
        return phone;
    }

    int getAge() {
        return age;
    }

    int getSalary() {
        return salary;
    }
}
