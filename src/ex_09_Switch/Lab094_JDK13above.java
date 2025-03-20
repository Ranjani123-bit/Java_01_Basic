package ex_09_Switch;

public class Lab094_JDK13above {
    public static void main(String[] args)
    {
        int itemcode=001;
        switch(itemcode)
        {
            case 001,002,003->System.out.println("All items are electric items");
            case 004,005,006->System.out.println("This is Mech");
           case 007,033,022->System.out.println("None");

        }
    }
}
/* out put
All items are electric items

 */