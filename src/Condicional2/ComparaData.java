package Condicional2;

import java.util.Scanner;

public class ComparaData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1, m1, a1;
		int d2, m2, a2;
		System.out.print("Digite o primeiro dia: ");
		d1 = sc.nextInt();
		System.out.print("Digite o primeiro mes: ");
		m1 = sc.nextInt();
		System.out.print("Digite o primeiro ano: ");
		a1 = sc.nextInt();
		System.out.print("Digite o segundo dia: ");
		d2 = sc.nextInt();
		System.out.print("Digite o segundo mes: ");
		m2 = sc.nextInt();
		System.out.print("Digite o segundo ano: ");
		a2 = sc.nextInt();
		if (a1 != a2) {
			if (a1 > a2) {
				System.out.print("Data mais proxima: " + d1 + ":" + m1 + ":" + a1);
			} else {
				System.out.print("Data mais proxima: " + d2 + ":" + m2 + ":" + a2);
			}
		} else {
			if (m1 != m2) {
				if (m1 > m2) {
					System.out.print("Data mais proxima: " + d1 + ":" + m1 + ":" + a1);
				} else {
					System.out.print("Data mais proxima: " + d2 + ":" + m2 + ":" + a2);
				}
			} else {
				if (d1 != d2) {
					if (m1 > m2) {
						System.out.print("Data mais proxima: " + d1 + ":" + m1 + ":" + a1);
					} else {
						System.out.print("Data mais proxima: " + d2 + ":" + m2 + ":" + a2);
					}
				} else {
					System.out.print("Datas iguais");
				}
			}
		}
	}

}
