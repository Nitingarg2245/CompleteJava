package Arrays;
//check if given array is sorted (sorting can be increasing or decreasing order )
public class Arrays_7_is_sorted {
    public static void main(String[] args) {
        int[] arr={40,30,30,10,5,5};

        if(increasingOrder(arr) || decreasingOrder(arr)) System.out.println("array is sorted");
        else System.out.println("array is not sorted");
    }
    public static boolean increasingOrder(int[] arr)
    {
        boolean isSorted=true;
        for(int i=0;i<=arr.length-2;i++) {
            if(arr[i]>arr[i+1])
            {
                isSorted=false;break;
            }
        }
        return isSorted;
    }
    public static boolean decreasingOrder(int[] arr)
    {
        boolean isSorted=true;
        for(int i=0;i<=arr.length-2;i++) {
            if(arr[i]<arr[i+1])
            {
                isSorted=false;break;
            }
        }
        return isSorted;
    }
}
