import java.util.*;
class Bikers
{
public static void main(String args[])
{
double b1,b2,b3,b4,b5,average;
Scanner sc=new Scanner (System.in);
System.out.println("Enter first biker speed");
b1=sc.nextDouble();
System.out.println("Enter second biker sped");
b2=sc.nextDouble();
System.out.println("Enter third biker speed");
b3=sc.nextDouble();
System.out.println("Enter fourth biker speed");
b4=sc.nextDouble();
System.out.println("Enter fifth biker speed");
b5=sc.nextDouble();
average=(b1+b2+b3+b4+b5)/5;
if(b1>average)
System.out.println("First biker is qualified with: "+b1+"speed");
if(b2>average)
System.out.println("Second biker is qualified with :"+b2+"speed");
if(b3>average)
System.out.println("Third biker is qualified with :"+b3+"speed");
if(b4>average)
System.out.println("Fourth biker is qualified with :"+b4+"speed");
if(b5>average)
System.out.println("Fifth biker is qualified with :"+b5+"speed");
}
}
