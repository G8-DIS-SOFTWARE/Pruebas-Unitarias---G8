package ClasesAProbar;
import junit.framework.TestCase;

public class TestEmployee extends TestCase{
	
	Employee employee = new Employee((float)100.0,"USD",(float)0.10,EmployeeType.Worker);
	
	public void testPrueba() {
		assertEquals(100,employee.cs());
	}

}
