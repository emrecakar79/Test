

public class Main
{
    public static void main(String args[])
    {
        int summe = 0;
        int obereGrenze = 10;
        
        for (int i = 1; i <= obereGrenze ; ++i)
        {
            summe += i;
        }
        
        int mult = 1;
        for (int i = 1; i <= obereGrenze ; ++i)
        {
            mult *= i;
        }
        
        System.out.println("Summe: " + summe + " Mult:" + mult);
    }
}
