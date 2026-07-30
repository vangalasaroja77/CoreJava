public class PrimeWhileLoop {
    static void main() {

        int n=11;
        boolean primeornot=false;
        int i=2;
        while(i<n/2)
        {
            if(n%i==0)
            {
                primeornot=true;
            }
            i++;
        }
        if(primeornot)
        {
            System.out.println(n+" is not a prime number");
        }
        else
        {
            System.out.println(n+" is a prime number");
        }
    }
}
