package Collection;
//deque==doubly ended queue matlab front and back of queue mai operation ho skte hai
//deque interface is implemented by arrayDeque class
import java.util.*;

public class part4_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer>adq=new ArrayDeque<>();
        //queue wale 3 function yha bhi hai offer,poll,peak+additional
//        adq.offer(1);
//        adq.offer(2);
//        adq.offer(3);
//        System.out.println(adq);//[1, 2, 3]
//        System.out.println(adq.poll());//1
//        System.out.println(adq.peek());//2

        //but hmm yha easy rkhne ke liye offerFirst,offerLast,pollFirst,pollLast,peekFirst,peekLast use krenge

        adq.offerFirst(10);
        adq.offerFirst(20);
        adq.offerLast(30);
        adq.offerLast(40);
        System.out.println(adq);

        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

        System.out.println(adq);

        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        /*
        traversal similar  to queue
        Using a for-each loop (Enhanced for loop).
        Using an Iterator.
        Using a forEach method (Java 8 and later).
        Using a while loop.
         */

    }
}
