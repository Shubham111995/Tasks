import java.io.*;
//Data Abstraction 
//Using Interface 
interface Student{
    void read();
    void write();
}
// Class representing a Boys    
class Boys implements Student
{
    public void read(){
    System.out.println("Boys reads");
}
 public void write()
 {
 System.out.println("Boys writes");
 }
}
//Class representing a Girls 
class Girls implements Student 
{
    public void read(){
        System.out.println("Girls reads");
    }
    public void write(){
        System.out.println("Girls writes");
    }

}

//Implementing Inheritance- 
//class Car inherited from Vehicle class
class Car extends Vehicle {
private int speed;
public int getSpeed()
{
    return speed;
}
public void setSpeed( int speed){
    this.speed = speed;
}
public void displaySpeed()
{
super.displaySpeed();
System.out.println(speed);
}
}

//Implementing Polymorphism-
//
abstract class Vehicle {
    public abstract void price();
}
class Truck extends Vehicle{
    public void price();
    System.out.println("Price of a Truck");
}


class Main1 
{
   public static void main(String[] args)
    {

// Inheritance 

    Student Boys = new Student();
    Student.setName("Leo");
    System.out.println();
   } 


// Polymorphism

 Vehicle Truck = new Vehicle();
 Truck.price();
 System.out.println();

 //Abstraction

 Student Boys = new Student();
 boys.read();
 girls.write();

 Student Girls = new Student();
 girls.read();
 girls.write();

 
}



