class Person
{
    void message()
    {
        System.out.println("Welcome to person class ");
    }
}
class Student extends Person
{
    void message()
    {
        System.out.println("Welcome to student class");
    }
    void display()
    {
        message();
        super.message();
    }
    public static void main(String args[])
    {
        Student s = new Student();
        s.display();
    }
}
