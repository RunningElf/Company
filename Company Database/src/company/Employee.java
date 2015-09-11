package company;

/*
2. Create an Employee class with following attributes / variables:
	name
	age
	department
*/


public class Employee {

	protected String name;
	protected int age;
	protected Department department;
	
	Employee()
	{
		
	}
	
	Employee(String temp_name, int temp_age, Department dep)
	{
		name = temp_name;
		age = temp_age;
		department = dep;
	}
	public void setName(String temp_name)
	{
		name = temp_name;
	}
	
	public void setAge(int temp_age)
	{
		age = temp_age;
	}
	
	public void setDepartment(Department temp_dep)
	{
		department = temp_dep;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public Department getDepartment()
	{
		return department;
	}
	
}
