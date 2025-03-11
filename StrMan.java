import java.util.Scanner;

public class StrMan
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter a string:");
        String str=sc.nextLine();
       
        System.out.println("Length of string:"+str.length());
        System.out.println("Uppercase:"+str.toUpperCase());
        System.out.println("Lowercase:"+str.toLowerCase());
        System.out.println("Substring:"+str.substring(2,5));
        System.out.println("After Trim:"+str.trim());
        System.out.println("String contains ll:"+str.contains("ll"));
        System.out.println("String ends with ll:"+str.endsWith("ll"));
        System.out.print("Enter another string:");
        String str2=sc.nextLine();
        System.out.println("String 1 equals to string 2:"+str.equals(str2));
        System.out.println("String replace:"+str.replace('l','p'));
       
    }
}
