package Simple_programs;

import java.util.Scanner;

public class Simple3_reverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        reverseInteger(number);

    }
    static void reverseInteger(int x){
        int rev=0;
        while(x>0){
            int last=x%10;
            rev=rev*10+last;
            x=x/10;
        }
        System.out.println("the reverse of numbr is: "+rev);
    }
}
