public class RevNum {

    static void main() {

        int num=143;
        System.out.println("before reversal : "+num);
        int rev=0;
        while(num>0)
        {
            rev=rev*10+(num%10);
            num=num/10;
        }
        System.out.println("after reversal : "+rev);
    }
}
