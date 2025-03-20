package ex_10_for_Loop;

public class Lab113_For_Loop_Continue_Even_Numbers
{
    public static void main(String[] args)
    {
        for(int i=0;i<10;i++)
        {
        if(i%2==0)
                {
    System.out.println("Even ->" +i);
    continue;//Using Continue this code will execute, down code ll not execute for condition

                }
        System.out.println("Odd ->"  +i);
        }
    }
}


/* Out Put
Even ->0
Odd ->1
Even ->2
Odd ->3
Even ->4
Odd ->5
Even ->6
Odd ->7
Even ->8
Odd ->9



 */