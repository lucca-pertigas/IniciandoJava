package Repeticao2;

import java.util.Scanner;

public class TabuadaDivisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		float result;
		System.out.print("Digite um numero: ");
		n = sc.nextInt();
		if (n != 0) {
			for(int i = 1; i <= 10; i++ ) {
				if (i != n) {
					result = n / i;
					System.out.println(n + " / " + i + " = " + result);
				}
			}
		}

	}

}
