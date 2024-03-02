package Arrays;
//no of occurences of element
public class Arrays_2_count_occurence {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,40,70,40};
        System.out.println("no of occurrence of desired  element: "+ countOccurrence(arr,40));
    }

     static int countOccurrence(int[] arr,int ele) {
        int count=0;
        for (int x : arr) {
            if(x==ele)count++;
        }
        return  count;
    }
}
