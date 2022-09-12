package buoi4;

import java.util.Scanner;

public abstract class DVat {
	private String giong, mau;
	private float cnang;
	public DVat() {
		giong = new String();
		mau = new String();
		cnang = 0f;
	}
	public DVat(DVat d) {
		giong = new String(d.giong);
		mau = new String(d.mau);
		cnang = d.cnang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Nhap giong: ");
		giong = sc.nextLine();
		System.out.print("Nhap mau: ");
		mau = sc.nextLine();
		System.out.print("Nhap can nang: ");
		cnang = sc.nextFloat();
	}
	
	public void in() {
		System.out.print("Giong: " + giong + "\tMau: " + mau + "\tCan nang: " + cnang);
	}
	
	public abstract void keu();
}