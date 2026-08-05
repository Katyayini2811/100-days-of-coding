//Program to find the sum of array elements
import java.util.Scanner;
class ArraySum{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
int sum=0,i;
for(i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
sum=sum+arr[i];
}
System.out.println(sum);
}
}