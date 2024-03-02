package Arrays;

public class Arrays_1_sum_average {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int sum=0,avg=0;
        for (int j : arr) {
            sum = sum + j;
        }
        avg=sum/(arr.length);
        System.out.println("sum of array elements is: "+sum);
        System.out.println("average of array elements is: "+avg);

    }
}
