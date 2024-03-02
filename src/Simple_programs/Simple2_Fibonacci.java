package Simple_programs;

import java.util.Scanner;
//print fibonacci series upto this number
public class Simple2_Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        fibonacci(number);
    }
    static void fibonacci(int num){
        if(num<0) return;
        if(num==0){
            System.out.println("0 ");
            return;
        }
        if(num==1){
            System.out.println("0 1 ");
            return;
        }
        System.out.print("0 1 ");
        int first=0,sec=1;
        while(first+sec<=num){
            int third=first+sec;
            System.out.print(third+" ");
            first=sec;
            sec=third;
        }
    }
}
