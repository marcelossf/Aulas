import java.util.ArrayList;
import java.util.Scanner;

public class numeroExtenso {

	public static void main(String[] args) {
		ArrayList<String> listaNum = new ArrayList();
		Scanner ler = new Scanner(System.in);
		int num;

		listaNum.add(0, "Zero");
		listaNum.add(1, "Um");
		listaNum.add(2, "Dois");
		listaNum.add(3, "Três");
		listaNum.add(4, "Quatro");
		listaNum.add(5, "Cinco");
		listaNum.add(6, "Seis");
		listaNum.add(7, "Sete");
		listaNum.add(8, "Oito");
		listaNum.add(9, "Nove");
		listaNum.add(10, "Dez");

		System.out.print("Digite um número inteiro positivo: ");
		num = ler.nextInt();

		if (num > 10 || num <= 0) {
			System.out.println("Número inválido. Digite um número entre 1 e 10");
		} else {
			System.out.println("O número " + num + " escrito por extenso é: " + listaNum.get(num));
		}

//		if(num <= 0 || num > 10) {
//			System.out.println("Erro! Digite um número entre 1 e 10");
//		} else if (num == 1) {
//			System.out.println("Um");
//		} else if (num == 2) {
//			System.out.println("Dois");
//		} else if (num == 3) {
//			System.out.println("Três");
//		} else if (num == 4) {
//			System.out.println("Quatro");
//		} else if (num == 5) {
//			System.out.println("Cinco");
//		} else if (num == 6) {
//			System.out.println("Seis");
//		} else if (num == 7) {
//			System.out.println("Sete");
//		} else if (num == 8) {
//			System.out.println("Oito");
//		} else if (num == 9) {
//			System.out.println("Nove");
//		} else if (num == 10) {
//			System.out.println("Dez");
//		}

	}

}
