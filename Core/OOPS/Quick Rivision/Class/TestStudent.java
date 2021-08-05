class Student
{
    int roll;
    String name;
    double marks;
    public void setData(int r, String s, double m)  //mutator
    {
        roll = r;
        name = s;
        marks = m;
    }
    public void getData()    //accessor
    {
        System.out.println("Roll number of Student: "+ roll);
        System.out.println("Roll number of Student: "+ name);
        System.out.println("Roll number of Student: "+ marks);
    }
}
class TestStudent 
{
    public static void main(String args[])
    {
      Student s1 = new Student();
      s1.setData(49,"Rahul",840.65);
      s1.getData(); 
    }
}