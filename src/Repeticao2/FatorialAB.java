package Repeticao2;

import java.util.Scanner;

public class FatorialAB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, fatorial;
		System.out.print("Digite o primeiro nome: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo nome: ");
		n2 = sc.nextInt();
		for (int i = n1 ; i <= n2; i ++) {
			fatorial = 1;
			if (i % 2 == 0) {
				for (int y = 1; y <= i; y++) {
					fatorial *= y;
				}
				System.out.println("Fatorial de " + i + " = " + fatorial);
			}
		}

	}

}
