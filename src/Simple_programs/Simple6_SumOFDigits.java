package Simple_programs;
//GCD
import java.util.Scanner;

public class Simple6_SumOFDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       sumOfDigits(num);
    }
    static void  sumOfDigits(int num) {
        int sum=0;
        while(num>0){
            int last=num%10;
            sum=sum+last;
            num=num/10;
        }
        System.out.println(sum);
    }
}
