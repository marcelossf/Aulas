/* Região Norte: Ida R$500 / Ida e Volta R$900
   Região Nordeste: Ida R$350 / Ida e Volta R$650
   Região Centro-Oeste: Ida R$ 350 / Ida e Volta R$600
   Região Sul> Ida R$300 / Ida e Volta R$ 550 */

import java.util.Scanner;

public class viagemDestino {

	public static void main(String[] args) {
		Scanner lerCaminho = new Scanner(System.in);
		Scanner lerDestino = new Scanner(System.in);
		int caminho;
		String destino;
		
		
		System.out.println("Selecione o caminho desejado");
		System.out.println("1 - Apenas ida");
		System.out.println("2 - Ida e volta");
		caminho = lerCaminho.nextInt();
		
		switch(caminho) {
		
		case 1: 
			System.out.print("Selecione a região do destino final: ");
			destino = lerDestino.nextLine();
			
			if(destino.toLowerCase().equals("norte")) {
				System.out.println("Valor total: R$ 550,00");
			} else if(destino.toLowerCase().equals("nordeste")) {
				System.out.println("Valor total: R$ 350,00");
			} else if(destino.toLowerCase().equals("centro-oeste") || (destino.toLowerCase().equals("centro oeste"))) {
				System.out.println("Valor total: R$ 350,00");
			}else if(destino.toLowerCase().equals("sul")) {
				System.out.println("Valor total: R$ 300,00");
			} else {
				System.out.println("Opção inválida");
			}
			break;
		
		case 2:
			System.out.print("Selecione a região do destino final: ");
			destino = lerDestino.nextLine();
			
			if(destino.toLowerCase().equals("norte")) {
				System.out.println("Valor total: R$ 900,00");
			} else if(destino.toLowerCase().equals("nordeste")) {
				System.out.println("Valor total: R$ 650,00");
			} else if(destino.toLowerCase().equals("centro-oeste") || (destino.toLowerCase().equals("centro oeste"))) {
				System.out.println("Valor total: R$ 600,00");
			}else if(destino.toLowerCase().equals("sul")) {
				System.out.println("Valor total: R$ 550,00");
			} else {
				System.out.println("Opção inválida");
			}
			break;
			
		default:
			System.out.println("Digite apenas 1 ou 2");
			break;
		}
		
	}

}
