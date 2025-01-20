package Repeticao2;

import java.util.Scanner;

public class FuncionamentoRelogio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60 ; j++) {
				for (int x = 0; x < 60 ; x++) {
					System.out.println(i + ":" + j + ":" + x);
				}
			}
		}

	}

}
