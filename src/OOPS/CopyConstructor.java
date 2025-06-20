package OOPS;

public class CopyConstructor {
    /* Constructor is special method of class which automatically invoked while creating an Object.
    ~no return type, name same as class name, only called once, memory Allocation take place.
     Constructor are 3 types :
    * 1.Default Constructor
    * 2.Parameterized Constructor
    * 3.Copy Constructor

    ~Shallow Copy-References | changes reflect
    ~Deep Copy - new Structure created | changes don't reflect

    Destructor is automatically done by garbage collector in java
     */
    public static void main(String [] args){
        Student s1 = new Student();
        s1.name="Adi";
        s1.roll=1;
        Student s2 = new Student(s1);//passing reference of s1 in Copy constructor
        System.out.println(s2.name+" "+s2.roll);
    }
}
class Student{
    String name;
    int roll;
    Student(){

    }
    //Copy constructor
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }
}
