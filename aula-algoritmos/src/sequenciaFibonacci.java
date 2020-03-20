import java.util.Scanner;

public class sequenciaFibonacci {

	public static void main(String[] args) {
		Scanner lerCont = new Scanner(System.in);
		int cont;
		int atual = 0;
		int primeiro = 0;
		int segundo = 1;

		System.out.print("Digite quantos números da sequência de Fibonacci devem ser mostrados: ");
		cont = lerCont.nextInt();
		
		for(int i = 0; i < cont; i++) {
			System.out.print(atual + "; ");
			atual = primeiro + segundo;
			segundo = primeiro;
			primeiro = atual; 
			
		}
	}

}
