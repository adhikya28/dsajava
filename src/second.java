import java.util.Scanner;
public class second {
    static void fun(int n){
        if (n>0){
            fun(n-1);
            System.out.println(n+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        fun(x);
        sc.close();
    }
}
