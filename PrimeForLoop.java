public class PrimeForLoop {

    static void main() {
        int n=25;
        boolean primeornot=false;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                primeornot=true;
            }
        }
        if(primeornot)
        {
            System.out.println(n + " is not a prime number.");
        }
        else
        {
            System.out.println(n + " is a prime number.");
        }
    }
}
