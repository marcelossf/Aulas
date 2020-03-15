import java.util.Scanner;

public class calculoIMC {

	public static void main(String[] args) {
		Scanner lerF = new Scanner(System.in);
		Scanner lerI = new Scanner(System.in);
		int peso;
		float altura, imc;
		
		System.out.print("Digite seu peso: ");
		peso = lerF.nextInt();
		
		System.out.print("Digite sua altura: ");
		altura = lerI.nextFloat();
		
		imc = peso/(altura * altura);
		
		if(imc < 20) {
			System.out.println("IMC = " + imc + ". Abaixo do peso.");
	
		} else if (imc >= 20 && imc < 25) {
			System.out.println("IMC = " + imc + ". Peso normal.");

		} else if (imc >= 25 && imc < 30) {
			System.out.println("IMC = " + imc + ". Sobrepeso.");
			
		} else if (imc >= 30 && imc < 40) {
			System.out.println("IMC = " + imc + ". Obeso.");
			
		} else if (imc >= 40) {
			System.out.println("IMC = " + imc + ". Obeso mórbido.");
			
		}
	}

}
