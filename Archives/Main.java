import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um sua idade: ");
		int idade = scan.nextInt();
		scan.nextLine();

		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();

		System.out.println("Digite seu cpf: ");
		String cpf = scan.nextLine();

		scan.close();

		System.out.println("Idade" + idade);
		System.out.println("Nome:" + nome);
		System.out.println("Cpf:" + cpf);
			
	}
}