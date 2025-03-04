import java.util.Scanner;
public class Matrix{
public static void main(String args[]){  
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
int n=3,m=3;
System.out.println("matrix A");
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
	a[i][j]=sc.nextInt();
}
}
System.out.println("matrix B");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)
{
	b[i][j]=sc.nextInt();
}}
System.out.println("SUM");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)
{
	c[i][j]=a[i][j]+b[i][j];
}}
System.out.println("Matrix-A");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("Matrix-B");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
System.out.println("SUM");
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}
}
