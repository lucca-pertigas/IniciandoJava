package Repeticao2;

import java.util.Scanner;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a = 0, b = 1;
		System.out.print("Ate que numero voce quer saber da sequencia: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Sequencia = " + b);
			b = a + b;
			a = b - a;
		}

	}

}
