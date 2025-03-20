package ex_10_for_Loop;

public class Lab112_For_Lopp_Continue {
    public static void main(String[] args) {
        for (int i = 0; i<=10; i++) {
            if (i == 5) {
                continue;//Skit below code and move to top
            }
            System.out.println(i);

        }

    }
}

/*
Out Put
0
1
2
3
4
6
7
8
9
10
 */