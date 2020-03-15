import java.util.ArrayList;
import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ArrayList<String> par = new ArrayList();
		ArrayList<String> impar = new ArrayList();
		int num;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Digite o " + i + "o número: ");
			num = ler.nextInt();
			if(num % 2 == 0) {
				// Par
			} else if (num % 2 != 0) {
				// Ímpar
			}
		}
		
	}

}
