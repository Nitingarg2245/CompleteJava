//Q1--why we need to go for collection framework?
/*
_________Approach1___________variables
in java to store something we are using variables
like int a=5; which are used to store a single value with type of data primitive or referenced type
but what if we need to store thousands of data items here comes the problem now we have to create 1000s of variables
to overcome this problem we have the concept of arrays
 */
package Collection;
import   java.util.ArrayList;
import   java.util.List;

import java.sql.Array;
import java.util.ArrayList;

public class part1_basics {
    //_________Approach2___________Arrays
    public static void main(String[] args) {
        int[] arr= new int[10];//we can declare it like a single variable with a size to hold  items of similar data type
        arr[0]=1;
        arr[1]=2;
//      arr[2]="string";//invalid type we are trying to store
//      arr[10];//array index out of bound as it has fixed size and can't change its size dynamically
    /*
    Student[] st=new Student[10];//this can hold only 10  student object
    st[0]=new Student("raja",101);//valid
    st[1]=new Student("rani",102);//valid
    st[10]//invalid
    st[2]=new Employee("ram",456);//invalid object

    limitation:
    1)it has fixed size.
    2)we can store only homogeneous values (same type of data)


    _________Approach3___________Object Arrays--object is the super class of all the classes
    Object[] ob=new Object[10];
    ob[0]=new Student("Nitin garg",27);
    ob[1]=new Employee("Nitin garg",27);
    ob[1]=new Faculty("Nitin garg",27);
    everything above is valid as all the classes are by default child of Object class

    this approach solves the problem of storing heterogeneous items

    limitation:
    1)still it's size is fixed
    2)we can not perform operations like insert,update,delete,retrieve,sort etc directly we have to write some
    manual functions for that work  for ex-sort all the objects based on their salaries we have no predefined function
     to do that
    finally  we have  collections framework in java that solves all the issues

    Q2--what is collection framework
    _________Approach4___________collections:
    1)collections are containers used to store group of  homogeneous as well as  heterogeneous values
    2)collections are growable in nature (means size can be increased or decreased based on data)
    3)collection is called framework because it provides predefined classes,interfaces and  methods like insert,update,
    delete,retrieve,sort etc. to perform  operations on data.

    collection framework hierarchy in the image given below
    https://static.javatpoint.com/images/java-collection-hierarchy.png

    when to use which collection --https://scaler.com/topics/images/when-to-use-which-collection-framework.webp
    list(I)-used to store group of objects(duplicates  are allowed )
                -Arraylist
                -LinkedList
                -Vector
                -Stack
    Set(I)-used to store group of objects(duplicates not allowed)
                -Hashset
                -LinkedHashSet
                -TreeSet
    queue(I)-used to store group of objects(FIFO order)
                -PriorityQueue
    Map(I)-used to store group of objects(key-value pair)
                -HashMap
                -LinkedHashMap
                -HashTable
                -TreeMap
                -IdentityHashMap
                -WeakHashMap

    ***********--
    cursors --they are used to iterate the collections
    **********--
    1)Iterator
    2)ListIterator
    3)Enumeration

    All the collection framework related classes and interfaces are part of java.util package

    Collection::
    1)it is root interface of the collection framework .
    2)set,queue and list interfaces extends from this root interface
    */

    }


}
