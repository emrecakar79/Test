

public class Main
{
    public static void main(String args[])
    {
        int obereGrenze = 100;
        int mult = 1;
        
        for (int i = 1; i <= obereGrenze; ++i)
        {
            mult *= i;
        }
        
        System.out.println("Mult = " + mult);
    }
}
