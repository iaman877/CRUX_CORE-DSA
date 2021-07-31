class Vehicle
{
    void run()
    {
        System.out.println("Vehicle");
    }
}
class Bike extends Vehicle
{
    void run()
    {
        System.out.println("Bike");
    }
    public static void main(String args[])
    {
        Bike obj = new Bike();
        obj.run();
    }
}