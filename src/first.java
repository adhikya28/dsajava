import java.util.Scanner;
public class first {
    static void fun(int n){
        if (n>0){
            System.out.println(n+" ");
            fun(n-1);
        }
    }
    public static void main(String[] args)throws Exception{
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter n:");
        int x=scanner.nextInt();
        fun(x);
        scanner.close();
    }
}
