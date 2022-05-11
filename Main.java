
import static java.lang.Math.*;

public  class Main
{
    /*
     * Mein neuer Kommentar
     */
    public static void main(String args[])
    {
        System.out.println ("Hallo Welt!");
        
        int sum = 0;
        for (int i = 1; i <= 50 ; ++i)
        {
            sum += i;
        }
        System.out.println(sum);
        
        int mul = 1;
        for (int i = 1; i <= 50 ; ++i)
        {
            mul *= i;
        }
        System.out.println(mul);
        
        //1 + 1/2^2 + 1/3^2 + 1/4^2 + ...
        double reihe = 0;
        for (int i = 1 ; i <= 10 ; ++i)
        {
            reihe += 1/pow(i, 2);//So sieht's besser aus!
        }
        System.out.println(reihe);
        

        //Master update 1
        //Master update 2

        //Feature update 1
        //Feature update 2

    }
}
