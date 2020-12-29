package org.d3ifcool.ima06;
import java.util.Scanner;

public class TP02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		int angka, balik = 0;
		Scanner input = new Scanner(System.in); 
     
		angka = input.nextInt();
		while( angka != 0) {
			balik = balik * 10;
			balik = balik + angka%10;
			angka = angka/10;
		}
		System.out.println(balik);
	}
}