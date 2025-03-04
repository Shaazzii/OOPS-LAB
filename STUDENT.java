import java.util.Scanner;
public class Student1 {
 
   String name;
   int rollNo;
   String section;

   
   Student1(String name, int rollNo, String section){
      this.name= name;
      this.rollNo = rollNo;
      this.section = section;
   }
     
   public void printDetails() {
      System.out.print("Student Details: ");
      System.out.println(this.name+ ", " + this.rollNo + ", " + this.section);
   }

   public static void main(String[] args) {
       
     
      Student1 student[]= new Student1[3];
      for(int i=0;i<3;i++)
      {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the name of  student:");
      String n=sc.nextLine();
     
      System.out.println("enter the section of  student:");
      String s=sc.nextLine();
      System.out.println("enter the rollno of  student:");
      int r=sc.nextInt();
      student[i]=new Student1(n,r,s);
      }
      for(int i=0;i<3;i++)
      {
      student[i].printDetails();
      }
     
   }
}
