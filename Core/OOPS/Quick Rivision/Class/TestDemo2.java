class Demo2
{
    int roll;
    String name;
    double marks;
}
class TestDemo2
{
    public static void main(String args[])
    {
        Demo2 d1 = new Demo2();
        d1.roll = 20;
        d1.name = "Aman";
        d1.marks = 5110.36;
        System.out.println(d1.roll);
        System.out.println(d1.name);
        System.out.println(d1.marks);
    }
}