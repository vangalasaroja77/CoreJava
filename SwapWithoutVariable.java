public class SwapWithoutVariable {

    static void main() {

        int a =2;
        int b=3;
        System.out.println("before swap");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
