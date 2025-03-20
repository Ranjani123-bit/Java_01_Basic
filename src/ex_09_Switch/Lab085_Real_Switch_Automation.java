package ex_09_Switch;

import java.util.Scanner;

public class Lab085_Real_Switch_Automation {

    public static void main(String[] args)
    {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Browser");
        String Browser=scanner.next();
        switch(Browser){


            case  "Chrome":  System.out.println("Starting the chrome");
                             System.out.println("......");
                             System.out.println("TC1");
                             System.out.println("tc2");
break;
            case  "edge":  System.out.println("Starting the chrome");
                             System.out.println("......");
                             System.out.println("TC1");
                             System.out.println("tc2");
break;

        }
    }
}
/*
Enter the Browser
edge
Starting the chrome
......
TC1
tc2

 */