package Condicional1;

import java.util.Scanner;

public class CompraMacas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor;
		int qntMacas;
		System.out.print("Quantas macas voce quer comprar: ");
		qntMacas = sc.nextInt();
		if (qntMacas < 12) {
			valor = qntMacas * 0.3;
		} else {
			valor = qntMacas * 0.25;
		}
		System.out.print("Valor final: R$ " + valor);

	}

}
