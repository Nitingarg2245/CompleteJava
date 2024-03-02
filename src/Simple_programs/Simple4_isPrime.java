package Simple_programs;

import java.util.Scanner;

public class Simple4_isPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(isPrime(number)) System.out.println("the no is prime");
        else System.out.println("not prime");

    }
    static boolean isPrime(int x){
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0) return false;
        }
        return true;
    }
}
