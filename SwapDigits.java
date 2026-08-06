//program to swap 2 numbers without using a third variable
import java.util.Scanner;
class SwapDigits{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter 2 numbers:");
int a=sc.nextInt();
int b=sc.nextInt();

a=a+b;
b=a-b;
a=a-b;

System.out.print("Here are the swaped elements:");
System.out.print(a+" "+b);
}
}

