public class ConsOverload
{
    int id;
    String name;
    int age;
    
    ConsOverload(int i, String n)
    {
        id = i;
        name = n;
    }
    ConsOverload(int i, String n, int a)
    {
        id = i;
        name = n;
        age = a;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String args[])
    {
        ConsOverload s1 = new ConsOverload(111,"Saurabh");
        ConsOverload s2 = new ConsOverload(111,"Aman",25);
        s1.display();
        s2.display();
    }
}