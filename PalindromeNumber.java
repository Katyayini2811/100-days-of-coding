//program to check whether a number is a palindrome number or not
import java.util.Scanner;
class PalindromeNumber{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number:");
int num=sc.nextInt();
int original=num;
int rev=0;
while(num!=0)
{
int digit=num%10;
rev=rev*10+digit;
num=num/10;
}
if(rev==original){
System.out.println("It is a palindrome number");
}
else{
System.out.println("It is not a Palindrome number");
}
}
}