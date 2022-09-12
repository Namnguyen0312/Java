package buoi1;

import java.util.Scanner;

public class Bai7 {
	
	public void tachten(String s){
		s=s.trim();
		int i = s.lastIndexOf(' ');
		String tachten = s.substring(i + 1);
		System.out.println("Ket qua: " + tachten);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao chuoi ho ten: ");
		String s = sc.nextLine();
		Bai7 answ = new Bai7();
		answ.tachten(s);
		
		
	}

}