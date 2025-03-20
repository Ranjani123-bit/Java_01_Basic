package ex_09_Switch;

import java.util.Scanner;

public class Lab086_Switch {



    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter day : number from 1 to 7");
        int day=scanner.nextInt();
        switch(day)
        {


        case 1: System.out.println("Monday");

        case 2: System.out.println("Tuesday");

        case 3:System.out.println("Wednesay");

        case 4: System.out.println("Thursday");

        case 5: System.out.println("Friday");

        case 6: System.out.println("Saturday");

        case 7: System.out.println("Sunday");


        default: System.out.println("Invalid:  day number");
        break;
        }
    }
}


/*
"C:\Program Files\OpenLogic\jdk-22.0.2.9-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4\lib\idea_rt.jar=52369" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\sagar\IdeaProjects\Java_01_Basic\out\production\Java_01_Basic ex_09_Switch.Lab086_Switch
enter day : number from 1 to 7
1
Monday
Tuesday
Wednesay
Thursday
Friday
Saturday
Sunday
Invalid:  day number

 */