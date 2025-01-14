package Condicional2;

import java.util.Scanner;

public class CreditoBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double saldo_medio, credito;
		System.out.print("Digite o saldo medio do ultimo ano: ");
		saldo_medio = sc.nextDouble();
		if (saldo_medio <= 200) {
			System.out.print("Credito não aprovado");
		} else {
			if ((saldo_medio >= 200.01) && (saldo_medio <= 400)) {
				credito = saldo_medio * 0.2;
				System.out.print("Credito de " + credito);
			} else {
				if ((saldo_medio >= 400.01) && (saldo_medio <= 600)) {
					credito = saldo_medio * 0.3;
					System.out.print("Credito de " + credito);
				} else {
					credito = saldo_medio * 0.4;
					System.out.print("Credito de " + credito);
				}
			}
		}

	}

}
