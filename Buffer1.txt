import java.util.*;
import java.lang.StringBuffer;
public class Buffer1
{
 public static void main(String a[])
{
String str;
int loc;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
str=sc.nextLine();
StringBuffer s=new StringBuffer(str);
System.out.println("enter the location to delete:");
loc=sc.nextInt();
s.deleteCharAt(loc);
System.out.println("new string after deletion is:"+s);
}
}
