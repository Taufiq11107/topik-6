package org.d3ifcool.ima06;
import java.util.Scanner;

public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		int hari;
		double zat_X, sisazat_X =0;
		// Input zat dalam gram dan banyaknya hari
		zat_X = input.nextDouble();
		hari = input.nextInt();
			
		while(hari > 0){
			zat_X = zat_X / 2;
			hari -= 10;
			sisazat_X = zat_X;
		}
			
	System.out.println(String.format("%.3f",sisazat_X));
	}
}
