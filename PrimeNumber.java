//check whether a number is a prime or not
import java.util.Scanner;
class PrimeNumber{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n,i,count=0;
n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
count++;
}
if(count==2)
{
System.out.println(n+" is a prime number");
}
else{
System.out.println(n+" is a  not prime number");
}
}
}
