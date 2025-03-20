package ex_10_for_Loop;

public class Lab114_For_Loop_Continue_Odd
{
    public static void main(String[] args)
    {
        for(int i=0;i<50;i++)
        {
            if(i%2==0)
            {continue;//Using Continue this code will execute, down code ll not execute for condition
                 }
            System.out.println("Odd ->"  +i);
        }
    }
}

/* Out Put
Odd ->1
Odd ->3
Odd ->5
Odd ->7
Odd ->9
Odd ->11
Odd ->13
Odd ->15
Odd ->17
Odd ->19
Odd ->21
Odd ->23
Odd ->25
Odd ->27
Odd ->29
Odd ->31
Odd ->33
Odd ->35
Odd ->37
Odd ->39
Odd ->41
Odd ->43
Odd ->45
Odd ->47
Odd ->49

 */