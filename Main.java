

public class Main
{
    public static void main(String args[])
    {
        int obereGrenze = 100;
        double mult = 1;
        
        for (int i = 1; i <= obereGrenze; ++i)
        {
            mult *= i;
        }
        
        System.out.println("Mult = " + mult);
    }
}
