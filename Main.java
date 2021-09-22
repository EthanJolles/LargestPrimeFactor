public class Main
{

    public static void main(String[] args)
    {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int x)
    {
        if(x<2)
        {
            return -1;
        }

        for(int i = x; i>0; i--)
        {
            if(x%i==0 && isPrime(i))
            {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrime(int n)
    {
        if(n==1)
        {
            return false;
        }
        for(int i=2; i <= n/2; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
