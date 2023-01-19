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
		assertEquals(100.035F,supervisor.cs());
	}
	
	public void testDolarMesParManager() {
		assertEquals(100.07,manager.cs());

	}
	
	public void testDolarMesImparWorker() {
		assertEquals(164.33334F,worker.cs());
	}
	
	public void testDolarCalculateYearBonusWorker() {
		assertEquals(386F,worker.CalculateYearBonus());
	}
	
	public void testDolarCalculateYearBonusSupervisor() {
		assertEquals(293F,supervisor.CalculateYearBonus());
	}
	
	public void testDolarCalculateYearBonusManager() {
		assertEquals(486F,manager.CalculateYearBonus());
	}
}
