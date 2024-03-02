package Simple_programs;
//GCD
import java.util.Scanner;

public class Simple7_factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       factorial(num);
    }
    static void  factorial(int num) {
        int fact=1;
        for (int i = 1; i <= num; i++) fact=fact*i;
        System.out.println(fact);
    }
}
