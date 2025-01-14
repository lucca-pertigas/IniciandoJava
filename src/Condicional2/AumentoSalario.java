package Condicional2;

import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo;
		double salario, novo_salario = 0;
		System.out.print("Digite o codigo do seu cargo: ");
		codigo = sc.nextInt();
		System.out.print("Digite o seu salario: ");
		salario = sc.nextDouble();
		if (codigo == 101) {
			novo_salario = salario * 1.1;
		} else {
			if (codigo == 102) {
				novo_salario = salario * 1.2;
			} else {
				if (codigo == 103) {
					novo_salario = salario * 1.3;
				} else {
					novo_salario = salario * 1.4;
				}
			}
		}
		System.out.print("Novo salario do funcionario = " + novo_salario);
	}

}
