class Msignature 
{
    public void meth1(int i)
    {
        System.out.println("Method 1");
    }
    public void meth2(String s)
    {
        System.out.println("Method 2");
    }
    public static void main(String args[])
    {
        Msignature m = new Msignature();
        m.meth1(4);
        m.meth2("aman");
    }
}