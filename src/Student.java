// Classe Student que armazena o nome e a m�dia de um aluno.
public class Student {
	
	private String name; //nome do aluno, variavel de instancia.
	private double average; //media do aluno, variavel de instancia.
	
	// construtor inicializa vari�veis de inst�ncia
	public Student(String name, double average)
	{
		this.name = name;
		
		// valida que a m�dia � > 0.0 e <= 100.0; caso contr�rio,
		// armazena o valor padr�o da m�dia da vari�vel de inst�ncia (0.0)
		if (average > 0.0)
			if (average <= 100.00)
				this.average = average; // atribui � vari�vel de inst�ncia
	}
	
	// define o nome de Student
	public void setName(String name)
	{
		this.name = name;
	}
	
	// recupera o nome de Student
	
	public String getName()
	{
		return name;
	}
	
	// define a m�dia de Student
	public void setAverage(double studentAverage)
	{
		// valida que a m�dia � > 0.0 e <= 100.0; caso contr�rio,
		 // armazena o valor atual da m�dia da vari�vel de inst�ncia
		if (studentAverage > 0.0)
			if (studentAverage <= 100.0)
				this.average = studentAverage; // atribui � vari�vel de inst�ncia
	}
	// recupera a m�dia de Student
	public double getAverage()
	{
		return average;
	}
	
	// determina e retorna a letra da nota de Student
	public String getLetterGrade()
	{
		String letterGrade = "";
		if(average >=90.0)
			letterGrade  = "A";
		else if(average >=80.0)
			letterGrade  = "B";
		else if(average >=70.0)
			letterGrade  = "C";
		else if(average >=60.0)
			letterGrade  = "D";
		else 
			letterGrade = "F";
		
		return letterGrade;
			
	}
	
}// finaliza a classe Student
