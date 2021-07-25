package practic;

/*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
  2. Конструктор класса должен заполнять эти поля при создании объекта.
  3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
  4. Создать массив из 5 сотрудников.
  Пример:
  Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
  persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
  "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
  persArray[1] = new Person(...);
  ...
  persArray[4] = new Person(...);

  5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
public class Employee {
    private String FCS;
    private String post;
    private String email;
    private long number;
    private int age;
    private double salary;

    public Employee(String FCS, String post, String email, long number, int age, double salary) {
        this.FCS = FCS;
        this.post = post;
        this.email = email;
        this.number =  number;
        this.age = age;
        this.salary = salary;
    }
    public String getFCS(){
        return FCS;
    }
    public void setFCS(String FCS){
        this.FCS = FCS;
    }


    public void Information() {
       System.out.println(
               String.format("\tLast name,First name, Patronymic : %s \n \tProfession : %s \n \tEmail : %s \n " +
                               "\tPhone number : %s \n \tAge people : %s \n \treceives money : %s thousands \n"
                       ,FCS,post,email,number,age,salary)
       );
    }
}
