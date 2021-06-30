import java.io.*;
class Square
{
   public void numSquare(int num)
    {
        return num*num;
    }
    public static void main(String a[])
    {
       Square obj=new Square();
        System.out.println(obj.numSquare(11));
    }
}