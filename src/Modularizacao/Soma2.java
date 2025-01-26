package Modularizacao;

import java.util.Scanner;

public class Soma2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n;
		System.out.print("Digite um numero: ");
		n = sc.nextFloat();
		System.out.print(operacao(n));

	}
	
	public static float operacao (float num) {
		float soma = 0, x = num + 1;
		for(float i = 1; i <= num ; i ++) {
			soma += i / (x - i);
		}
		return soma;
	}

}
