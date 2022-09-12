package buoi4;

import java.util.Scanner;

public class SDDVat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DVat ds[];
		int n;
		System.out.print("Nhap so dong vat: ");
		n = sc.nextInt();
		sc.nextLine();
		ds = new DVat[n];
		char c = ' ';
		for (int i = 0; i < n; i++) {
			System.out.println("Ban nhap con Bo(b), Heo(h), De(d): ");
			c = sc.nextLine().charAt(0);
			if (c == 'b') ds[i] = new Bo();
			else if (c == 'h') ds[i] = new Heo();
			else ds[i] = new De();
			ds[i].nhap();
		}
		for (int i = 0; i < n; i++) {
			ds[i].in();
			ds[i].keu();
		}
	}

}