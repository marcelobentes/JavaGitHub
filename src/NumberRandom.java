import java.security.SecureRandom; // o programa usa a classe SecureRandom

public class NumberRandom {

	public static void main(String[] args) {
		// o objeto randomNumbers produzir� n�meros aleat�rios seguros
		SecureRandom numberRandom = new SecureRandom();
		
		
		
		for( int i = 1; i < 10; i++)
		{
			int randomValue = 1 + numberRandom.nextInt(6);
			System.out.printf("%d ", randomValue);
			
			randomValue = 2 + 3 * numberRandom.nextInt(6);
			System.out.printf("%d ", randomValue);
		
		}

	}

}
