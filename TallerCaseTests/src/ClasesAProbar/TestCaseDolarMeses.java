package ClasesAProbar;
import junit.framework.TestCase;

public class TestCaseDolarMeses extends TestCase{
	
	Employee worker = new Employee(100.0F,"USD",(float)0.10,EmployeeType.Worker);
	Employee supervisor = new Employee(100.0F,"USD",(float)0.10,EmployeeType.Supervisor);
	Employee manager = new Employee(100.0F,"USD",(float)0.10,EmployeeType.Manager);

	
	public void testDolarMesParWorker() {
		assertEquals(100F,worker.cs());
		
	}
	public void testDolarMesParSupervisor(){
		assertEquals(100F,supervisor.cs());
	}
	
	public void testDolarMesParManager() {
		assertEquals(100,manager.cs());

	}
	
	public void testDolarMesImparWorker() {
		assertEquals(164.33334F,worker.cs());
	}
}
