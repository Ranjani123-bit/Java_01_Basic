package ex_04_Operators;

public class Lab037_Operators_Arithmetic_Operators {

    public static void main(String[] args) {
        // Arithmetic Operators
        //        + (Addition)
        //       - (Subtraction)
        //       * (Multiplication)
        //       / (Division)
        //       % (Modulus) | Modulus - Remainder

        int a = 20;
        int b = 3;
        float c = 3.0f;
        System.out.println("Addition " + a + b);
        System.out.println("sub=" + (a - b));
        System.out.println("mul= " + a * b);
        System.out.println("div=" + a / b);
        System.out.println("div=" + a / c); // 6.666665
        System.out.println("a+b");
        System.out.println(a + b);
    }
}

/*
OUT PUT
Addition 203
sub=17
mul= 60
div=6
div=6.6666665
a+b
23
 */