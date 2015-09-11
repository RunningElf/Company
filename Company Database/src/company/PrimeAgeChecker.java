package company;

/*4. Create a static method in a separate class called PrimeAgeChecker 
 * to check if an employee’s age is prime number or not. This method should be 
 * able to accept an employee object as an argument to do the check.
 */


public class PrimeAgeChecker {
	static boolean isPrime(Employee employee)
	{
		for(int x = 2; x < employee.getAge(); x++)
			if(employee.getAge()% x == 0)
				return false;
		return true;
	}
}
