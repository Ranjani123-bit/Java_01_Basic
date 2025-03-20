package Tasks;
//Take user input----Name ,Age, Salary print them in th end.

import java.util.Scanner;

public class Task005_Scanner_Ops {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name=scanner.nextLine();

        System.out.println("enter age ");
        int age=scanner.nextInt();

        System.out.println("Enter salary");
        Double salary=scanner.nextDouble();



        System.out.println("name: " +name+ "  age:" +age+   "  salary:"  +salary);
        scanner.close();
    }
}
/*out put
Enter name
Ranjani
enter age
32
Enter salary
2323.22
name: Ranjani  age:32  salary:2323.22
 */