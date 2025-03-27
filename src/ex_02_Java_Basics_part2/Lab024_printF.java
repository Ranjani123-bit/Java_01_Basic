package ex_02_Java_Basics_part2;

public class Lab024_printF {

    public static void main(String[] args) {

        int a = 10;
        System.out.printf("You variable is %d",a);
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
        int b = 20;
        System.out.println( " --- ");
        System.out.printf("%d + %d",a , b);
    }
}

/* OUT PUT
You variable is 10 ---
10 + 20

 */