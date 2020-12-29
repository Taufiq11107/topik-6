package org.d3ifcool.ima06;
import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		
		int data;
		int perulangan = 0, total = 0;
		double rata2;
		
		//Input angka (permen) sampai nilai input 0
		do {
			data = input.nextInt();
			total += data;
			if (data !=0)
				perulangan += 1;
				rata2 = (double) total / perulangan;
		}while(data != 0);
		System.out.println(String.format("%.2f",rata2));
	}
}
