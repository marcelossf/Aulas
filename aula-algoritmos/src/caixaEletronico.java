import java.util.Scanner;

// Simular um caixa eletrônico
// Pergunta ao cliente qual o valor a ser sacado
// Programa informará quantas cédulas de cada valor serão entregues
// O caixa só tem cédulas de 50, 20 e 10

public class caixaEletronico {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor;
		int nota50 = 0;
		int nota20 = 0;
		int nota10 = 0;
		int cedulasMax;
		
		System.out.print("Qual o valor a ser sacado? R$");
		valor = ler.nextInt();
		cedulasMax = valor/10;
		
		while(cedulasMax > 0) {
			
			if(cedulasMax >= 5) {
				nota50 ++;
				cedulasMax -= 5;
				
			} else if(cedulasMax >= 2) {
				nota20 ++;
				cedulasMax -= 2;
				
			} else if(cedulasMax >=1) {
				nota10 ++;
				cedulasMax -= 1;
			}
		}
		
		System.out.println("Receberá o valor de R$" + valor + " dividido em:");
		System.out.println(nota50 + " notas de R$50");
		System.out.println(nota20 + " notas de RS20");
		System.out.println(nota10 + " notas de R$10");
	}

}


