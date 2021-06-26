import java.util.*;
class Person
{
String name;
String gender;
int age;
String qualification;
String experience;
int sal;
void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name");
name=sc.next();
System.out.println("Enter age");
age=sc.nextInt();
System.out.println("Enter gender");
gender=sc.next();
System.out.println("Qualification");
qualification=sc.next();
System.out.println("Experience");
experience=sc.next();
System.out.println("salary");
sal=sc.nextInt();
}
void display()
{
System.out.println("Name of the person: "+name);
System.out.println("Age of the person  :"+age);
System.out.println("Gender of the person :"+gender);
System.out.println("qualification of the person :"+qualification);
System.out.println("experience of the person :"+experience);
System.out.println("salary of the person :"+sal);
}
}
class Sample12
{
public static void main(String args[])
{
Person p=new Person();
p.get();
p.display();
}
}
