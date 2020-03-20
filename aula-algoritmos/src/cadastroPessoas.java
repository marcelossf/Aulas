import java.util.Scanner;

// Ler idade e sexo de várias pessoas
// Continuar o cadastro até o usuário não querer continuar
/* Mostrar no final -> Quantas pessoas tem mais de 18 anos
					-> Quantos homens cadastrados
					-> Quantas mulheres tem menos de 20 anos
 */
public class cadastroPessoas {

	public static void main(String[] args) {
		Scanner lerIdade = new Scanner(System.in);
		Scanner lerSexo = new Scanner(System.in);
		Scanner lerCond = new Scanner(System.in);
		int idade;
		String sexo;
		String respCond;
		
		int contIdade = 0;
		int contHomem = 0;
		int contMulher20 = 0;
		
		do {
			System.out.print("Digite a idade: ");
			idade = lerIdade.nextInt();
			
			System.out.print("Digite o sexo: ");
			sexo = lerSexo.nextLine();
			
			if(idade >= 18) {
				contIdade++;
			}
			
			if(sexo.toLowerCase().equals("masculino")) {
				contHomem++;
			}
			
			if(sexo.toLowerCase().equals("feminino") && idade < 20) {
				contMulher20++;
			}
			
			System.out.println("Deseja continuar o cadastro? ");
			respCond = lerCond.nextLine();
			
	} while (respCond.toLowerCase().equals("sim"));
		
		System.out.println("Número de maiores de idade: " + contIdade);
		System.out.println("Número de homens: " + contHomem);
		System.out.println("Número de mulheres com menos de 20 anos: " + contMulher20);
	}

}
