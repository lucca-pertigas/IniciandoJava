package Modularizacao;

import java.util.Scanner;

public class Soma3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n;
		System.out.print("Digite um numero: ");
		n = sc.nextFloat();
		System.out.print(operacao(n));
	}
	
	public static float operacao(float num) {
		float soma = 0;
		for (float i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				soma += 1 / i;
			} else {
				soma -= 1 / i;
			}
		}
		return soma;
	}

}
