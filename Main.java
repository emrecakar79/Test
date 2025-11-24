

public class Main
{
    public static void main(String args[])
    {
        int summe = 0;
        int og = 10;
        
        for (int i = 1; i <= og ; ++i)
        {
            summe += i;
        }
        
        int mult = 1;
        for (int i = 1; i <= og ; ++i)
        {
            mult *= i;
        }
        
        System.out.println("Summe: " + summe + " Mult:" + mult);
    }
}
