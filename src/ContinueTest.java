// Instru��o continue que termina uma itera��o de uma instru��o for.
public class ContinueTest {

	public static void main(String[] args)
	{
		
	for (int count =1; count <= 10; count ++) // faz o loop 10 vezes
	{
		
		if (count ==5) 
			continue; // pula o c�digo restante no corpo do loop se a contagem for 5
		
		System.out.println( count);
	}
	
	System.out.println("Used continue to skip printing 5");

	}

}
