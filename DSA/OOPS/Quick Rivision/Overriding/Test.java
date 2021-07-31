class Bank
{
    int getRateInterest()
    {
        return 0;
    }
}
class SBI extends Bank
{
    int getRateInterest()
    {
        return 8;
    }
}
class ICICI extends Bank
{
    int getRateInterest()
    {
        return 7;
    }
}
class AXIS extends Bank
{
    int getRateInterest()
    {
        return 9;
    }
}
class Test 
{
    public static void main(String args[])
    {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println(s.getRateInterest());
        System.out.println(i.getRateInterest());
        System.out.println(a.getRateInterest());
    }
}