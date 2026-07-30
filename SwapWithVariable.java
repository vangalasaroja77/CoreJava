public class SwapWithVariable {


    static void main() {
        int a=2;
        int b=3;
        System.out.println("before swap : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
