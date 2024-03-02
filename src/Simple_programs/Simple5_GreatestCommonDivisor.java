package Simple_programs;
//GCD
import java.util.Scanner;

public class Simple5_GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       int greatestCommonDivisor=gcd(a,b);
        System.out.println("the gcd of 2 number  is :"+greatestCommonDivisor);
    }
    static int  gcd(int a,int b) {
        while(a>0 && b>0)
        {
            if(a>b) a=a-b;
            else b=b-a;
        }
        if(a==0) return b;
        else return a;
    }
}
