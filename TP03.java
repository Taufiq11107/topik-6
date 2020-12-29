package org.d3ifcool.ima06;
import java.util.Scanner;

public class TP03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner in = new Scanner(System.in);
		int angka = 0, total = 0;
		
		do{
			angka = in.nextInt();
			total = total + angka;
			
		}while(angka > 0);
		System.out.println(total);
	}
}