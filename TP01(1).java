package org.d3ifcool.ima06;
import java.util.Scanner;

public class TP01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input=new Scanner(System.in);
		int bilangan, amoeba = 30, waktu = 0;
		
		bilangan = input.nextInt();
		
		while(amoeba < bilangan){
			amoeba *=2;
			waktu += 15;
		}
		System.out.println(waktu);
	}
}