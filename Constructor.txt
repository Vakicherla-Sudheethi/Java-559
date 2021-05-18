import java.util.*;
class Box
{
double l,h,b;
Box()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter length");
l =sc.nextDouble();
System.out.println("Enter breadth");
b=sc.nextDouble();
System.out.println("Enter height");
h=sc.nextDouble();
}
void volume()
{
System.out.println(l*b*h);
}
}
class Demo
{
public static void main(String args[])
{
Box b=new Box();
b.volume();
}
}
