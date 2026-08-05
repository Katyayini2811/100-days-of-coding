//program to search an element in the array
import java.util.Scanner;
class SearchElement{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
System.out.println("Enter the elements in the Array");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.print("Enter the elements to be searched:");
int search=sc.nextInt();
boolean found=false;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==search){
found=true;
break;
}
}
if(found)
{
System.out.println("Element found");
}
else
{
System.out.println("Element not found");
}
}
}



