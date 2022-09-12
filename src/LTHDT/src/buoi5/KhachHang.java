package buoi5;

import java.util.Scanner;

public class KhachHang {
	private String ms, ten, dchi;
	
	public KhachHang() {
		ms = new String();
		ten = new String();
		dchi = new String();
	}
	
	public KhachHang(KhachHang kh) {
		ms = new String(kh.ms);
		ten = new String(kh.ten);
		dchi = new String(kh.dchi);
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);

//		KhachHang d[];
//		int n = sc.nextInt();
//		sc.nextLine();
//		d = new KhachHang[n];
//		char c = ' ';
//		
//		for (int i = 0; i<n; i++){
//			System.out.print("Ban nhap thong tin cho KhachHangVIP(1), cho KhachHang(2): ");
//			c = sc.nextLine().charAt(0);
//			if (c == '1') d[i] = new KhachHangVIP();
//			else d[i] = new KhachHang();
//			d[i].nhap();
//		}
		
		System.out.print("\tNhap ms khach hang: ");
		ms = sc.nextLine();
		System.out.print("\tNhap ten khach hang: ");
		ten = sc.nextLine();
		System.out.print("\tNhap dia chi khach hang: ");
		dchi = sc.nextLine();
	}
	
	public String toString() {
		return "\n* Ma so khach hang: " + ms + "\n" + "* Ten khach hang: " + ten + "\n" + "* Dia chi khach hang: "+ dchi;
	}
	
	public void in() {
		System.out.println("\n* Ma so khach hang: " + ms + "\n" + "* Ten khach hang: " + ten + "\n" + "* Dia chi khach hang: "+ dchi);
	}
}
