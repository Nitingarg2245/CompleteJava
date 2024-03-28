package Collection;
import java.util.*;
/*
Java collection framework was non-generic before JDK 1.5. Since 1.5, it is generic.
Java new generic collection allows you to have only one type of object in a collection. Now it is type-safe,
in a generic collection, we specify the type in angular braces. Now ArrayList is forced to have the only specified
type of object in it. If you try to add another type of object, it gives a compile-time error.
 */
public class part2_ArrayList {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();//without type safety we can add any object to it
        List<Integer>al2=new ArrayList<>();
        //This statement declares a variable al2 of type List<Integer>,
        // which means al2 can refer to any object of the class  that implements the List interface
        // and holds elements of type Integer
        ArrayList<Integer> al3=new ArrayList<>();//simple implementation most preferred
        Collection<Integer>al4=new ArrayList<>();//this will also work
        al1.add(2);// this 2 here is an object here autoboxing is done primitive is changed into wrapper class object
        al1.add("hello");
        al2.add(3);
        al2.add(4);
        al3.add(5);
        al3.add(6);
        System.out.println("al1:"+al1);
        System.out.println("al2:"+al2);
        System.out.println("al3:"+al3);

        //all the 4 methods of declaring an arraylist works but we should prefer type safety with generics and more
        // specificity while declaration
        //this is the  best one ArrayList<Integer> al3=new ArrayList();

        al3.add(7);//boolean add(E e)
        System.out.println("al3:"+al3);
        al3.add(1,1);//void add(int index, E element)
        System.out.println("al3:"+al3);
        al3.addAll(al2);//boolean addAll(Collection<? extends E> c)
        System.out.println("al3:"+al3);//[5, 1, 6, 7, 3, 4]
        System.out.println(al3.get(0));//5
        System.out.println(al3.get(2));//6
        System.out.println(al3.getFirst());//5
        System.out.println(al3.getLast());//4
        System.out.println(al3.isEmpty());//false
        al3.add(6);
        System.out.println(al3);//[5, 1, 6, 7, 3, 4, 6]
        System.out.println(al3.indexOf(6));//index of 6 when it first appears
        System.out.println(al3.lastIndexOf(6));//index of 6 when it last appears
        System.out.println(al3.contains(7));//true

        System.out.println(al3.remove(3));//remove(int index)--removes the element at index and return it
        System.out.println(al3);
        System.out.println(al3.remove(Integer.valueOf(4)));//boolean remove(Object o)
        //Since remove() method takes an Object as an argument, we use Integer.valueOf(4)
        // to get the Integer object corresponding to the integer 4
        System.out.println(al3);//[5, 1, 6, 3, 6]
        System.out.println(al3.removeAll(al2));//true  al2 ke jo bhi elements mile wo sab hta diye isne al2 mai se
        System.out.println(al3);//[5, 1, 6, 6]

        al3.set(0,10);
        System.out.println(al3);//[10, 1, 6, 6]
    }

}
/*  c++ ke vector ka push_back and pop_back implement aisi hoga java mai
 Simulate push_back()
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(6);

        // Simulate pop_back()
        if (!arrayList.isEmpty()) {
            int poppedElement = arrayList.remove(arrayList.size() - 1);
            System.out.println("Popped element: " + poppedElement);
        }
 */
