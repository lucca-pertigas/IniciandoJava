package Modularizacao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha, n;
		do {
			System.out.println("Iniciar tabuada: "
					+ "1 - Sim");
			escolha = sc.nextInt();
			if (escolha == 1) {
				System.out.println("Escolha um numero maior que 1 e menor que 11: ");
				n = sc.nextInt();
				if ((n > 1) && (n < 11)) {
					tabuada(n);
				} else {
					System.out.println("Tente novamente !");
				}
			} else {
				System.out.print("Não entendi sua resposta ");
			}
			
		} while (escolha == 1);

	}
	
	public static void tabuada (int num) {
		for (int i = 1; i <= 10; i ++) {
			System.out.println(i + " * " + num + " = " + i*num);
		}
	}

}
