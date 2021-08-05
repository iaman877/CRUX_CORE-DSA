class MOverload
{
    public void m1()
    {
        System.out.println("no argument vala method");
    }
    public void m1(int i)
    {
        System.out.println("int argument vala method");
    }
    public void m1(double d)
    {
        System.out.println("double argument vala method");
    }
    public static void main(String args[])
    {
        MOverload m = new MOverload();
        m.m1();
        m.m1(5);
        m.m1(5.12);
    }
}
