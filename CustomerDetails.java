import java.util.*;
class CustomerDetails
{
Scanner sc=new Scanner(System.in);
String name,type;
int accno;
double balance;
public void get_details()
{
System.out.println("Enter account number: ");
accno=sc.nextInt();
System.out.println("Enter name of the account holder: ");
name=sc.next();
System.out.println("Enter account type:");
type=sc.next();
System.out.println("Enter initial balance:");
balance=sc.nextDouble();
}
public void display()
{
System.out.println("Account number: "+accno+"\n"+"Account holder: "+name+"\n");
System.out.println("Account type: "+type+"\n"+"Initial balance: "+balance+"\n");
}
}
class TransactionDetails extends CustomerDetails
{
Scanner sc=new Scanner(System.in);
public void withdraw()
{
System.out.println("Enter acc to withdraw\n");
double amount=sc.nextInt();
if((balance-amount)<500)
System.out.println("You must maintain minimum balance\n");
else
{
balance -=amount;
System.out.println("Available Balance:"+balance);
}
}
public void deposit()
{
System.out.println("Enter amount to deposit: \n");
double amount=sc.nextInt();
balance+=amount;
System.out.println("Available balance: "+balance);
}
}
class BankTransaction extends TransactionDetails
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
BankTransactionbt=new BankTransaction();
bt.get_details();
bt.display();
System.out.println("Enter your choice(0(withdraw)/1(deposit)");
int choice=sc.nextInt();
if(choice==0)
bt.withdraw();
else if(choice==1)
bt.deposit();
else
System.out.println("Insert choice");
}
}
