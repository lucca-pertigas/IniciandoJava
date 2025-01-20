package Repeticao2;

import java.util.Scanner;

public class TabuadaMultiplicacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, result = 0;
		System.out.print("Digite um numero: ");
		n = sc.nextInt();
		for (int i = 1; i <= 10; i ++) {
			result = i * n;
			System.out.println(n + " * " + i + " = " + result);
		}

	}

}
