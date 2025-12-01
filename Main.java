import java.math.*;

public class Main
{
    public static void main(String args[])
    {
        int summe = 0;
        int limit = 80;
        
        for (int i = 1; i <= limit ; ++i)
        {
            summe += i;
        }
        
        BigInteger mult = new BigInteger("1");
        for (int i = 1; i <= limit ; ++i)
        {
            mult = mult.multiply(new BigInteger(String.valueOf(i)));
        }
        
        System.out.println("Summe: " + summe + " Mult:" + mult);

        //Rebase Update 1
        //Rebase Update 2
    }
}
