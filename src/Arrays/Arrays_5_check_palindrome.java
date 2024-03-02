package Arrays;
public class Arrays_5_check_palindrome {
    public static void main(String[] args) {
        int[] arr={10,20,30,20,100};
       if(isPalindrome(arr)) System.out.println("the array is palindrome");
       else System.out.println("not a palindrome");
    }
    public static boolean isPalindrome(int[] arr)
    {
        int s=0,e= arr.length-1;
        while(s<e)
        {
            if(arr[s]!=arr[e])return false;
            s++;e--;
        }
        return true;
    }


}
