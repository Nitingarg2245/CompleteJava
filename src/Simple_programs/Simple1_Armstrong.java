package Simple_programs;

import java.util.Scanner;

public class Simple1_Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        isArmstrongNumber(number);
    }
    static void isArmstrongNumber(int n){
        int temp=n,count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        int sum=0;
        temp=n;
        while(temp>0)
        {
            int last=temp%10;
            sum=sum+(int)Math.pow(last,count);
            temp=temp/10;
        }
        if(sum==n) System.out.println("it is an armstrong");
        else System.out.println("not an armstrong");
    }
}
