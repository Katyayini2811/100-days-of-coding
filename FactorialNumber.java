//Check factorial of a number
import java.util.Scanner;
class FactorialNumber{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int i,n;
long fact=1L;
n=sc.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}