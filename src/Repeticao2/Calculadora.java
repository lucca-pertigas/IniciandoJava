package Repeticao2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, op, result;
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextInt();
		do {
			System.out.println("\n\nEscolha a operação:\n"
					+ "1 - Soma\n"
					+ "2 - Substracao\n"
					+ "3 - Multiplicacao\n"
					+ "4 - Divisao\n"
					+ "5 - Trocar Valores\n"
					+ "6 - Sair");
			op = sc.nextInt();
			switch (op) {
				case 1:
					result = n1 + n2;
					System.out.println(n1 + " + " + n2 + " = " + result);
					break;
				case 2:
					result = n1 - n2;
					System.out.println(n1 + " - " + n2 + " = " + result);
					break;
				case 3:
					result = n1 * n2;
					System.out.println(n1 + " * " + n2 + " = " + result);
					break;
				case 4:
					if (n2 != 0) {
						result = n1 / n2;
						System.out.println(n1 + " / " + n2 + " = " + result);
						break;
					} else {
						System.out.println("Não é possivel dividir !");
						break;
					}
				case 5: 
					System.out.println("Digite o primeiro numero: ");
					n1 = sc.nextInt();
					System.out.println("Digite o segundo numero: ");
					n2 = sc.nextInt();
					break;
				case 6:
					System.out.println("Finalizando aplicativo !");
					break;
			}
		} while (op != 6);

	}

}
