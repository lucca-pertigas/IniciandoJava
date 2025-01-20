package Repeticao2;

import java.util.Scanner;

public class SequenciaPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, contador;
		System.out.print("Digite um valor: ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			contador = 0;
			for (int y = 1; y <= i; y++) {
				if (i % y == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				System.out.println(i);
			}
		}

	}

}
