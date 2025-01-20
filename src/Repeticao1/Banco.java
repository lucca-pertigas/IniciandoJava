package Repeticao1;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		double saldo, operacao;
		int cont = 0, op;
		System.out.println("Digite o nome do dono da conta: ");
		nome = sc.nextLine();
		System.out.println("Digite o seu saldo inicial: ");
		saldo = sc.nextDouble();
		do {
			System.out.print("Digite a operação que deseja fazer:\n"
					+ "1 - Deposito\n"
					+ "2 - Retirada\n"
					+ "3 - Fim da operação\n");
			op = sc.nextInt();
			switch (op) {
				case 1:
					System.out.println("Que saldo voce gostaria de acrescentar: ");
					operacao = sc.nextDouble();
					saldo += operacao;
					break;
				case 2:
					System.out.println("Digite o valor para sacar: ");
					operacao = sc.nextDouble();
					saldo -= operacao;
					break;
				case 3:
					System.out.println("Finalizando operacao !" );
					cont = 1;
					break;
				default:
					System.out.println("Digite um valor valido !");
			}
		} while (cont != 1);
		System.out.print(nome + ", seu saldo final: R$ " + saldo);
	}

}
