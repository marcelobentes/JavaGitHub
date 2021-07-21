
// Classe que representa uma apólice de seguro de automóvel.

public class AutoPolicy {
	
	
	private int accountNumber; // número da conta da apólice
	private String makeAndModel; // carro ao qual a apólice é aplicada
	private String state; // abreviatura do estado com duas letras
	
	// construtor
	public AutoPolicy(int accountNumber,String makeAndModel, String state)
	{
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}

	// retorna o accountNumber
	public int getAccountNumber() {
		return accountNumber;
	}
	
	// define o accountNumber
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// retorna o makeAndModel	
	public String getMakeAndModel() {
		return makeAndModel;
	}

	// configura o makeAndModel
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	// retorna o estado
	public String getState() {
		return state;
	}

	// define o estado
	public void setState(String state) {
		this.state = state;
	}
	
	// método predicado é retornado se o estado tem seguros “sem culpa”
	
	public boolean isNoFaultState() {
		boolean noFaultState;
		
		// determina se o estado tem seguros de automóvel “sem culpa”
		switch(getState()) {
		
		case "MA": case "PA": case "SP": case "RJ":
			noFaultState = true;
		break;
		default:
			noFaultState = false;
		break;	
			
		}
		
		return noFaultState;
	}
	

}// fim da classe AutoPolicy
