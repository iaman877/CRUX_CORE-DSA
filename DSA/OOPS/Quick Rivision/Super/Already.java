class Vehicle 
{
    Vehicle()
    {
        System.out.println("Vehicle is created");
    }
}
class Already extends Vehicle
{
    Already()
    {
        System.out.println("Bike is Created ");
        // super();
    }
    public static void main(String args[])
    {
        Bike b = new Bike();
    }
}