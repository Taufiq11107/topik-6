package org.d3ifcool.ima06;
import java.util.Scanner;

public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input =new Scanner(System.in);
		int  Pertambahan = 0, Counter, Faktor, Temp, Reminder;
		int angka;
		angka = input.nextInt();

		Temp = angka;
		while (Temp > 0){
			Faktor = 1;
			Counter = 1;
			Reminder = Temp % 10;
			while(Counter <= Reminder){
				Faktor = Faktor * Counter;
				Counter++;
		}
			Pertambahan = Pertambahan + Faktor;
			Temp = Temp /10;
		}
		if(angka == Pertambahan){
			System.out.println("YA");
		}else{
			System.out.println("BUKAN");
		}
	}
}
