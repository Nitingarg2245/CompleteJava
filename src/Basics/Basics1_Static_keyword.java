/*
In Java, if we want to access class members, we must first create an instance of the class. But there will be situations where we want to access class
members without creating any class object. In those situations, we can use the static keyword in Java. If we want to access class members without
creating an  instance of the class, we need to declare the class members static. it is mandatory to create an object for accessing the non-static members
of the class The Math class in Java has almost all of its members static. So, we can access its members without creating instances of the Math class.
new  */
package Basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Basics1_Static_keyword {
    public static void main(String[] args) {
        System.out.println(Math.PI);//here we directly accessed  the math class members
        System.out.println(Math.min(2,3));//here we directly accessed  the math class members
        System.out.println(Math.max(4,10));//here we directly accessed  the math class members
        System.out.println(Math.sqrt(25));//here we directly accessed  the math class members
        try {
            Connection connection = DriverManager.getConnection("invalid_url", "username", "password");
        } catch (SQLException e) {
            System.out.println("SQLException occurred: " + e.getMessage());
        } 
    }
}
/*
we can have static variables, static methods,static blocks and static nested class also these all are fully belongs to the class only and when an object
of the class is created these static members are not loaded into that object all the static members can access each other directly inside the class
 */
class Student {
    int rollNo;
    String name;
    //static variable (which can be directly initialized or a static block is used for it)
    static String collegeName;

//static block is used to initialize the static variables and are executed even before the main fn A class can have multiple static blocks
// and each static block is executed in the same sequence in which they have been written in a program.
    static {
        collegeName = "NIT";
        System.out.println("hi i am static block");
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    String getInfo() {
        return name + " " + rollNo + " " + collegeName;
    }

    static void hi() {
        System.out.println("hi from the static method of the class ");
    }

    /*
static members inside the class can be accessed directly without using the class.static_member syntax but outside we need class.static_member syntax
     */
    public static void main(String[] args) {
        System.out.println(collegeName);//static members inside the class can be accessed directly
        hi();//static members inside the class can be accessed directly
        Student student = new Student(101, "Nitin Garg");
        System.out.println(student.rollNo);
        System.out.println(student.name);
//        System.out.println(student.collegeName); will throw warning/error as collegeName belongs to class only
        System.out.println(student.getInfo());
    }
}
/*
Q-why main method is made static--In every Java program, we have declared the main method static.It is because to run the program the JVM should be able
to invoke the main method during the initial phase where no objects exist in the memory. jvm doesn't have to create an object of the class to run the
main method the objects gets created at the runtime only and if we declare the main method as non-static then we need
 an object to access it now  a program can never run in this stage
 */
/*
Note: Static variables are rarely used in Java. Instead, the static constants are used.These static constants are defined by "static final" keyword
and represented in uppercase.This is why some people prefer to use uppercase for static variables as well.(for reference please see the Math class )
*/

/*
at what time your class loads into the memory? --the class is loaded if either the object of the class is requested in code or the static members are
requested in code. The static variable can be used to refer to the common property of all objects (which is not unique for each object),
for example, the company name of employees, college name of students, etc.
The static variable gets memory only once in the class area at the time of class loading and is shared among all the class instances.
Advantages of static variable It makes your program memory efficient (i.e., it saves memory).
 */


//nested static class is static class defined inside a class
class Vehicle {
    static class Car {
        int engineCapacity;
        int noOfTyres;

        void info() {
            System.out.println("you are inside a static nested class ");
        }

        public Car(int engineCapacity, int noOfTyres) {
            this.engineCapacity = engineCapacity;
            this.noOfTyres = noOfTyres;
        }
    }

    public static void main(String[] args) {
        //all static members can access each other directly inside a class
        Car car = new Car(450, 4);
        System.out.println(car.engineCapacity);
    }
}
class Test {

    public static void main(String[] args) {
        //as car is a static member now so we use it with the help of outer class
       Vehicle.Car car = new Vehicle.Car(5070, 6);
        System.out.println(car.engineCapacity);
    }
}


