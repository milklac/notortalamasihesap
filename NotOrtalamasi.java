package Ders1;

import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		byte mat,fizik,kimya,biyoloji,turkce,muzik;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Matematik notunuz: ");
		mat=scan.nextByte();
		
		System.out.println("Fizik notunuz: ");
		fizik=scan.nextByte();
		
		System.out.println("Kimya notunuz: ");
		kimya=scan.nextByte();
		
		System.out.println("Biyoloji notunuz: ");
		biyoloji=scan.nextByte();
		
		System.out.println("Türkçe notunuz: ");
		turkce=scan.nextByte();
		
		System.out.println("Müzik notunuz: ");
		muzik=scan.nextByte();
		
		double ort=(mat+fizik+kimya+biyoloji+turkce+muzik)/6;
		System.out.println("Ortalamanız: "+ort);
		
		if (ort>=50) {
			System.out.println("Sınıfı geçtiniz. Tebrikler!");
			
		} else {
			System.out.println("Sınıf tekrarı!");

		}
		
	
		
		

	}

}
