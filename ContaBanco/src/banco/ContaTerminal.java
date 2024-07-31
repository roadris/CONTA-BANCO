package banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da agência");
		int agencia = scanner.nextInt();
		System.out.println("Por favor, digite o número da conta");
		int numConta = scanner.nextInt();
		System.out.println("Por favor, digite seu nome");
		String nome = scanner.next();
		System.out.println("Por favor, digite seu saldo");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá, "+nome+" obrigado por criar uma conta em nosso banco, o númro da sua agência é "+ agencia +", o número da sua conta é "+ numConta +" e seu saldo é R$: "+saldo+" já está disponível para saque.\"");
		
		scanner.close();

	}

}
