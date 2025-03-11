import java.util.*;
class Sort
{
public static void main(String[] args)
{
String str[]=new String[10];

Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array : ");
int size=sc.nextInt();


System.out.println("Enter the string : ");
for(int i=0;i<size;i++)
{
str[i]=sc.next();
}
for(int i=0;i<size;i++)
{
for(int j=i+1;j<size;j++)
{
if(str[i].compareTo(str[j])>0)
{
String temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.print("String is : ");
for(int i=0;i<size;i++)
{
System.out.println(str[i]);
}


}
}

