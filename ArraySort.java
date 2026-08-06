//program to sort array in ascending order
import java.util.Scanner;
class ArraySort{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[6];
System.out.println("Enter elements in the array:");
int i,temp=0,j;
for(i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<arr.length;i++)
{
for(j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.print("The sorted array is:");
for(i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
}
}
