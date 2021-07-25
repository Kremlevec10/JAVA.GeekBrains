package practic;

public class Main {

    public static void main(String[] args) {
        Employee Mihail = new Employee(
                "Putin Mihail Andreevich", "Menegr" , "java@gmail.com" ,
                9276851920l, 32, 42.500 );
        /*System.out.println(
                String.format("%s",Mihail.getFCS())
          );*/
        Mihail.Information();

        Employee[] PersonArr = new Employee[5];
        PersonArr[0] = new Employee(
                "Lukin Andrei Andreevich", "Booster" , "gk@gmail.com" ,
                9276567920l, 28, 234.500 );
        PersonArr[1] = new Employee(
                "Sarapyi Anton Vladimirovich", "Development" , "Anton@gmail.com" ,
                9276851310l, 32, 678.5900 );
        PersonArr[2] = new Employee(
                "Usmonov Usmon Usmonovich", "Menegr" , "java8@gmail.com" ,
                9276868745l, 55, 56.500 );
        PersonArr[3] = new Employee(
                "Teplakov Vladimir Vladimirovich", "OficcMan" , "Teplakov@gmail.com" ,
                9196858928l, 67, 78.500 );
        PersonArr[4] = new Employee(
                "Blohin Hasan Hasanovich", "OficcPlacton" , "Hasan@gmail.com" ,
                9256851920l, 99, 1.500 );

        for (int i = 0; i< PersonArr.length; i++) {
            PersonArr[i].Information();
        }
    }
}
