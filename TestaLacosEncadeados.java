import java.util.Scanner;
public class TestaLacosEncadeados {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.print("Informe o n�mero para tabuada: ");
		numero = ler.nextInt();
		System.out.printf("\nA tabuada de %d �: \n", numero);
		
		
		for (int i = 0; i <= 10; i++ ) {
			System.out.print(numero * i);
			System.out.print(" | ");
		}


		System.out.println();

	}

}
