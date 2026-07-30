public class FibonacciSeries {

    static void main() {

        int n=10;
        int i=0;
        int a=1;
        int b=2;
        System.out.print(a+" "+b+" ");
        while(i<n)
        {
            int sum=a+b;
            System.out.print(sum + " ");
            a=b;
            b=sum;
            i++;
        }
    }
}
