public class PrimeBwTwoNums {

    static void main() {

        int a=2;
        int b=10;
        System.out.println("prime numbers between "+a+" , "+b);
        while(a<=b)
        {
            boolean isprime=true;
            for(int i=2;i<=a/2;i++)
            {
                if(a%i==0)
                {
                    isprime=false;
                }
            }
            if(isprime)
            {
                System.out.print(a+" ");

            }
            a++;
        }
    }
}
