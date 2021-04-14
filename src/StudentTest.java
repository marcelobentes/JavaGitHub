/*Para demonstrar as instruções if…else aninhadas no método getLetterGrade da classe Student, o método main da classe
StudentTest (Figura 4.5) cria dois objetos Student (linhas 7 e 8). Então, as linhas 10 a 13 exibem o nome e a letra da nota de cada
Student chamando os métodos getName e getLetterGrade dos objetos, respectivamente.*/

// Cria e testa objetos Student.
public class StudentTest {

	public static void main(String[] args) {
		
		Student account1 = new Student("Marcelo Bentes", 95.5); //criado objeto da classe
		Student account2 = new Student ("Marcelo Samuel", 78.8); //criado objeto da classe
		 
		
		
		System.out.printf("%s letter grade is: %s%n", account1.getName(), account1.getLetterGrade()); //imprimir letra da media
		System.out.println(account2.getName()+" letter grade is: "+ account2.getLetterGrade()); //imprimir letra da media
		
		
		account2.setName("Marcela Mabel"); //alterando o nome do objeto
		account1.setName("Thatiane Bentes"); //alterando o nome do objeto
		account2.setAverage(98.7); //alterando a media do objeto
		
		System.out.println("Alterando os nomes.");
		
		System.out.printf("%s letter grade is: %s%n", account1.getName(), account1.getLetterGrade()); //imprimir letra da media
		System.out.println(account2.getName()+" letter grade is: "+ account2.getLetterGrade()); //imprimir letra da media
		System.out.println(account2.getAverage());
	}

}
