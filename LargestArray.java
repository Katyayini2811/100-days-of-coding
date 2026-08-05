//program to find the largest number in the array
import java.util.Scanner;
class LargestArray{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
System.out.println("Enter the elements in the array");
int i,largest=0;
for(i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
largest=arr[0];
for(i=0;i<arr.length;i++)
{
if(arr[i]>largest)
{
largest=arr[i];
}
}
System.out.println(largest);
}
}
