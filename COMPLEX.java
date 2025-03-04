import java.util.Scanner;
public class Complex
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the real part of 1st num:");
int real1=sc.nextInt();
System.out.println("enter the imaginary part of 1st num:");
int img1=sc.nextInt();
System.out.println("the first complex number is "+real1+"+"+img1+"i");
System.out.println("enter the real part of 2nd num:");
int real2=sc.nextInt();
System.out.println("enter the real part of 2nd num:");
int img2=sc.nextInt();
int realsum=real1+real2;
int imgsum=img1+img2;
System.out.println("The complex numbers are:");
System.out.println(real1 +"+"+img1+"i");
System.out.println(real2 +"+"+img2+"i");
System.out.println("sum=" +realsum+"+"+imgsum+"i");
System.out.println();
}
}
