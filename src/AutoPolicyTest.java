
// Demonstrando Strings em um switch.
public class AutoPolicyTest {

	public static void main(String[] args) {
		
		// cria dois objetos AutoPolicy
		AutoPolicy policy = new AutoPolicy (11111111, "GOL GT", "PA");
		AutoPolicy policy2 = new AutoPolicy (2222222, "CIVIC NEW", "MG");
		
		// exibe se cada ap�lice est� em um estado �sem culpa�
		
		policyisNoFaultState(policy);
		policyisNoFaultState(policy2);
	
	}
	// m�todo que mostra se um AutoPolicy
	// est� em um estado com seguro de autom�vel �sem culpa�

	private static void policyisNoFaultState(AutoPolicy policy)
	{
		System.out.println("The auto policy: ");
		System.out.printf("Account #: %d; Car: %s ; State %s %s a no-fault state%n%n", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
				policy.isNoFaultState() ? "is" : "is not"); //estado sem falha
		
	}
	

}// fim da classe AutoPolicyTest
