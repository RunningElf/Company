package company;

/*Nikkita Hirayama
 * 100 Garden District Drive
 * Apt 2216
 * Simpsonville, Sc 29681
 * 
 * 
 * 
 * 5. Create a class called Company which will contain a list of departments. Create a main method in 
 * this class to load the following departments and corresponding employee information into the company:

Department	Name	Age
Accounting	Counting Guru	55
Accounting	Counting Pro	45
Accounting	Counting Savvy	40
Accounting	Counting Novice	25
Marketing	Sales Guru	50
Marketing	Sales Pro	48
Marketing	Sales Savvy	38
Human Resources	Hiring Guru	58
Human Resources	Hiring Pro	47
Information Systems	Hacking Pro	46
Information Systems	Hacking Guru	51
Information Systems	Hacking Savvy	38
Information Systems	Hacking Novice	23

Print out departments, employee names, ages and if age is prime number for each employee in the company 
using the method in PrimeAgeChecker class. When you print out Accounting and Information Systems departments, 
make sure they are printed in ascending order by employee age using the method you created in step 2a.

 */


import java.util.ArrayList;
import java.util.Scanner;



public class Company {

	private static Scanner read;
	
	private static Department[] departments;
	
	
	public static void main(String[] args) {
		
		
		read = new Scanner(System.in);
		departments = new Department[]{
				new Department("Accounting"), 
				new Department("Marketing"), 
				new Department("Human Resources"), 
				new Department("Information Systems")};
		
		System.out.println("Enter new Employee Information");
		addEmployee();
		printEmployees();
		read.close();
	
	}
	
	public static void addEmployee()
	{
		String newname, depname, tocontinue;
		int newage;
		
		do{
			System.out.print("Employee name: ");
			newname = read.nextLine();
			
			System.out.print("Employee age: ");
			newage = read.nextInt();
			read.nextLine();
			
			do{
				System.out.print("Employee Department: ");
				depname = read.nextLine();
			
			}while(!new Department().checkDepartment(depname));
			
			for(int x = 0; x < departments.length; x++)
			{
				if(depname.toLowerCase().equals(departments[x].getTitle().toLowerCase()))
				{
					departments[x].add(new Employee(newname, newage, departments[x]));
					break;
				}
			}
			
			System.out.print("Do you wish to add another employee? [yes/no] ");
			tocontinue = read.nextLine();
			
		}while(tocontinue.equals("yes"));
			
	}

	public static void printEmployees()
	{
		ArrayList<Employee> list;
		System.out.println();
		
		System.out.format("%-20s %-20s %-10s\n", "Department", "Name", "Age");
	
		for(int z = 0; z < departments.length; z++)
		{
		
			if(departments[z].getTitle().toLowerCase().equals("accounting")
					||departments[z].getTitle().toLowerCase().equals("information systems"))
						departments[z].orderEmployees();
				
			
			list = departments[z].getList();
				
				for(int x = 0; x < list.size() ; x++)
				{
					
					if(PrimeAgeChecker.isPrime(list.get(x)))
							System.out.format("%-20s %-20s %-10s %-5s\n", departments[z].getTitle(), list.get(x).getName(), list.get(x).getAge(), "Prime");
					else
						System.out.format("%-20s %-20s %-10s\n", departments[z].getTitle(), list.get(x).getName(), list.get(x).getAge());
				}
		}
	}
}
