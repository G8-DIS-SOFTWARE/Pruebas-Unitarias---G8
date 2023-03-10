package ClasesAProbar;

import junit.framework.TestCase;

public class TestCaseNoDolar extends TestCase {

	Employee worker = new Employee((float)100.0,"EUR",(float)0.10,EmployeeType.Worker);
	Employee supervisor = new Employee((float)100.0,"JPY",(float)0.10,EmployeeType.Supervisor);
	Employee manager = new Employee((float)100.0,"GBP",(float)0.10,EmployeeType.Manager);
	
	
	public void testEuroMesParWorker() {
		assertEquals(95F,worker.cs());
	}
	
	public void testYenesMesParSupervisor(){
		assertEquals(95.035F,supervisor.cs());
	}
	
	public void testLibraEsterlinaMesParManager() {
		assertEquals(95.105F,manager.cs());

	}
	
	public void testEuroCalculateYearBonusWorker() {
		assertEquals(386F,worker.CalculateYearBonus());
	}
}
