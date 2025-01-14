package Condicional2;

import java.util.Scanner;

public class ParImparPosNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Digite um numero: ");
		n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Numero Par !");
		} else {
			System.out.println("Numero impar !");
		}
		if (n > 0) {
			System.out.println("Numero positivo !");
		} else {
			System.out.println("Numero negativo !");
		}

	}

}
