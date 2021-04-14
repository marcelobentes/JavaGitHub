import java.util.Scanner;

public class KmCombustivel {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		int km_dirigido, litro_gasolina, viagem =0;
		int kmtotal = 0, litrototal = 0;
		double media;
		while (viagem < 3)
		{
			System.out.println("Informe a quilometragem percorrida e quantidade de litro de gasolina consumido: ");
			km_dirigido = entrada.nextInt();
			litro_gasolina = entrada.nextInt();
			media = (double)km_dirigido / litro_gasolina;
			kmtotal += km_dirigido;
			litrototal += litro_gasolina;
			
			System.out.println("Consumo de quilometro/litro na viagem: "+media);
			System.out.println("KM total: "+ kmtotal);
			System.out.println("Total de litro: "+ litrototal);
			
			viagem ++;
			
		}

	}

}
