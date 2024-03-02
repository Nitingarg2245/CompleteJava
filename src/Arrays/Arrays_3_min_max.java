package Arrays;
//max and min element in array
public class Arrays_3_min_max {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,40,70,40,-1,90};
        //we can also use the arr[0] for max and min value
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for (int x : arr) {
            if(x<min)min=x;
            if(x>max)max=x;
        }
        System.out.println("max value is: "+max+"\n"+"min value is :"+min);
    }
}
