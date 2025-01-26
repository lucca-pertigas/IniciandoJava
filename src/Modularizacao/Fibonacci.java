package Modularizacao;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n;
		n = receberValor();
		fibonacci(n);
	}
	
	public static void fibonacci (int num) {
		int a = 0, b = 1;
		for (int i = 0; i <= num; i++) {
			System.out.println(b);
			b = a + b;
			a = b - a;
		}
	}
	
	public static int receberValor () {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Digite um valor: ");
		num = sc.nextInt();
		return num;
	}

}
