import java.util.*;
class Rectangle
{
    int l,b,area;
    public void insertData()
    {
        Scanner scn = new Scanner(System.in);
        l = scn.nextInt();
        b = scn.nextInt();
    }
    public void PrintArea()
    {
        area = l*b;
        System.out.println("Area is "+area);
    }
}
class TestRectangle
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.insertData();
        r.PrintArea();
    }
}