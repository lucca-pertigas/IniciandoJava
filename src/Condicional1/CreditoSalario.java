package Condicional1;

import java.util.Scanner;

public class CreditoSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, prestacao;
		System.out.print("Digite o seu salario: ");
		salario = sc.nextDouble();
		System.out.print("Digite o valor da prestacao: ");
		prestacao = sc.nextDouble();
		if (prestacao <= 0.3 * salario) {
			System.out.print("Credito autorizado");
		} else {
			System.out.print("Credito não autorizado");
		}

	}

}
