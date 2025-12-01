

public class Main
{
    public static void main(String args[])
    {
        int summe = 0;
        int limit = 50;
        
        for (int i = 1; i <= limit ; ++i)
        {
            summe += i;
        }
        
        int mult = 1;
        for (int i = 1; i <= limit ; ++i)
        {
            mult *= i;
        }
        
        System.out.println("Summe: " + summe + " Mult:" + mult);
    }
}
