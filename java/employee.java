import java.util.*;;
import java.util.Scanner;
public class employee
{
	String name=new String();
	int Emp_id;
	int age;
	String m_status=new String();
	int salary;
	
	employee(){
		name="";
		Emp_id=0;
		age=0;
		m_status="";
		salary=0;
	}
	
	
	Scanner s=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter your name:");
		name=s.next();
		System.out.println("Enter Employee-id");
		Emp_id=s.nextInt();
		System.out.println("Enter the age");
		age=s.nextInt();
		System.out.println("Enter marital status");
		m_status=s.next();
		System.out.println("Enter salary");
		salary=s.nextInt();
		
	}
	
	void put()
	{
		System.out.println("Name:\t"+name);
		System.out.println("Employee-id:\t"+Emp_id);
		System.out.println("Age:\t"+age);
		System.out.println("Marital status:\t"+m_status);
		System.out.println("Salary:\t"+salary);
		System.out.println("\n");
		
	}
		

public static void main(String[] args) 
 {
 	employee[] e = new employee[3];
 	for(int i=0;i<3;i++)
 	{
 	e[i]=new employee();
 	e[i].get();
 	}
 	for(int i=0;i<3;i++)
 	{
 	e[i].put();
 	}
 	
 	
   //employee[] e = new employee[3];*/
   
   
}
}
