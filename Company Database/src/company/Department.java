package company;

/*3. Create a class called Department which will contain a list of employees. 
a) Department class will have a method which will return its employees ordered by age. 
b) The value of department can be only one of the following values:
		“Accounting”
		“Marketing”
		“Human Resources”
		“Information Systems”
*/



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Department {

		protected ArrayList<Employee> employees;
		protected String title;
		
		public Department()
		{
			employees= new ArrayList<Employee>();
			
		}
		public Department(String name)
		{
			setDepartment(name);
			employees= new ArrayList<Employee>();
		}
		
		void setDepartment(String name)
		{
			if(checkDepartment(name))
				title = name;
			else
				System.err.println("\ninvalid department\n");
		}
		
		int size()
		{
			return employees.size();
		}
		
		void add(Employee emp)
		{
			employees.add(emp);
			//orderEmployees();
		}
		
		String getTitle()
		{
			return title;
		}
		void orderEmployees()
		{
			if(employees.size() > 1)
			{
				Collections.sort(employees, new Comparator<Employee>(){
					@Override public int compare(Employee e1, Employee e2){
						return e1.getAge() - e2.getAge();}
					});
			}
		}
		
		ArrayList<Employee> getList()
		{
			return employees;
		}
		
		public boolean checkDepartment(String temp_dep)
		{
			switch(temp_dep.toLowerCase())
			{
				case "accounting": case "marketing": 
					case "human resources": case "information systems":
						return true;
				default:
					return false;
			}
				
		}
}
