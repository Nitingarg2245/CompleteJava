package Collection;
import java.util.*;
//queue interface ko  implement kar rhi hai  linkedlist class
//offer =for addition in the queue
//poll=for deletion from the front and return the element
//peek=just to check which element is at the front of the queue
public class part3_Queue {

    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.offer(5);
        q.offer(15);
        q.offer(25);
        System.out.println(q);//[5, 15, 25]
        System.out.println(q.poll());
        System.out.println(q.peek());

        System.out.println("for each loop(enhanced for loop )");
        for(Integer i:q)//
        {
            System.out.println(i);
        }
        System.out.println("using iterator");
        Iterator<Integer>it=q.iterator();
        while(it.hasNext()) System.out.println(it.next());

        System.out.println("for each method in java8");
        q.forEach(x-> System.out.println(x));

        System.out.println("using a while loop");
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.poll();
        }

    }


}
