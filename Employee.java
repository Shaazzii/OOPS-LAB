import java.util.*;
public class Employee
{
    int eNo;
    double eSalary;
    String eName;
    Employee(int eNo,String eName, double eSalary)
    {
        this.eNo=eNo;
        this.eName=eName;
        this.eSalary=eSalary;
    }
    public void display()
    {
     System.out.println();
          System.out.println("*************Employee Details************");
                System.out.println("Employee name     "+eName);
                System.out.println("Employee No     : "+eNo);
                System.out.println("Employee Salary     : "+eSalary);                
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num,i,emp_no;
        double sal;
        String emp_nam;
        boolean flag=false;
        System.out.println("Enter the number of  employees : ");
        num=in.nextInt();
        Employee emp[]=new Employee[num];
        for (i=0;i<num;i++)
        {
            System.out.println("Enter Employee name      : ");
            emp_nam=in.next();
            System.out.println("Enter Employee Number     :");
            emp_no=in.nextInt();
            System.out.println("Enter Salary of employee   : ");
            sal=in.nextDouble();
            emp[i]=new Employee(emp_no,emp_nam,sal);
        }
        System.out.println("Enter emp_no to search : ");
        int emp_num_srch=in.nextInt();
        for(i=0;i<num;i++)
        {
            if((emp[i].eNo)==emp_num_srch)
            {
                flag=true;
                emp[i].display();              
            }
        }
        if(flag==false)
        {
            System.out.println("Employee not found");
        }        
    }
   
}
