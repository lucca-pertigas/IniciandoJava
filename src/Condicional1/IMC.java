package Condicional1;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double h, peso = 0;
		int sexo;
		System.out.print("Digite:\n"
				+ "1 - Homem\n"
				+ "2 - Mulher\n");
		sexo = sc.nextInt();
		System.out.print("Digite sua altura: ");
		h = sc.nextDouble();
		if (sexo == 1) {
			peso = (72.7 * h) - 58;
			System.out.print("Peso ideal = " + peso + "Kg");
		} else {
			if (sexo == 2) {
				peso = (62.1 * h) - 44.7;
				System.out.print("Peso ideal = " + peso + "Kg");
			} else {
				System.out.print("Tente novamente");
			}
		}

	}

}
