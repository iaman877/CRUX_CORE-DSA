class Vehicle 
{
    Vehicle()
    {
        System.out.println("From Vehicle");
    }
}
class Bike1 extends Vehicle 
{
    Bike1()
    {
        super();  // it wil invoke parent class constructor
        System.out.println("From Bike");
    }
    public static void main(String args[])
    {
        Bike1 b = new Bike1();
    }
}
