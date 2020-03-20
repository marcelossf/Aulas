import java.util.Scanner;

// Receber um valor inteiro e realizar a soma dos números pares inferiores a ele
// Ex: 9 -> 2 + 4 + 6 + 8 = 20

public class somaNumerosInferiores {
	
	public static void main(String[] args) {
		Scanner lerResp = new Scanner(System.in);
		int resp;
		int soma = 0;
		
		System.out.print("Digite um valor: ");
		resp = lerResp.nextInt();
		
		for(int i = 0; i <= resp; i++) {
			if(i%2 == 0) {
			soma += i;
			}
		}
		
		System.out.println("Soma total dos números pares até " + resp + ": " + soma);
	}
}
