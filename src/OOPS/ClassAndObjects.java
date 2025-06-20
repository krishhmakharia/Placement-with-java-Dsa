package OOPS;

public class ClassAndObjects {
    //Class- Blueprint / group of properties and Methods
    //Objects- Real world entities / instance of class
    public static void main(String [] args){
        Pen p1 = new Pen(); // created a object in Heap memory
        p1.setColor("Blue");
        System.out.println(p1.color);
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
