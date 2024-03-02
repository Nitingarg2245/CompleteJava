package Arrays;
//reverse an array
public class Arrays_4_reverse_array {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,40,50,60,40,90,40};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
    public static void reverseArray(int[] arr)
    {
        int s=0,e= arr.length-1;
        while(s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;e--;
        }
    }


}
