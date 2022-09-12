package buoi2;

import java.util.Scanner;

public class Date {

	private int ngay, thang, nam;
	public Date() {
		ngay = 1;
		thang = 1;
		nam = 2020;
	}
	
	public Date(int d, int m, int y) {
		ngay = d;
		thang = m;
		nam = y;
	}
	
	public Date(Date d) {
		nam = d.nam;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.print("Nhap thang: ");
			thang = sc.nextInt();
			System.out.print("Nhap nam: ");
			nam = sc.nextInt();
		} while(!hople());
	}
	
//	public void in() {
//		System.out.println(ngay + "/" + thang + "/" + nam);
//	}
	
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}
	
	public boolean hople() {
		int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((nam % 4 == 0 && nam %100 != 0) || nam % 400 == 0)
			max[2] = 29;
		if (ngay > 0 && thang > 0 && nam > 0 && ngay <= max[thang] && thang < 13)
			return true;
		else return false;
	}
	
	public Date cong() {
		Date d = new Date(ngay, thang, nam);
			d.ngay++;
		if (!d.hople()) {
			d.ngay = 1;
			d.thang++;
			if (!d.hople()) {
				d.thang = 1;
				d.nam++;
			}
		}
		return d;
	}
	
	public Date Cong(int n) {
		Date d = new Date(ngay, thang, nam);
		for (int i = 0; i < n; i++)
			d = d.cong();
		return d;
	}
	
	public int layNgay() {
		return ngay;
	}
	
	public int layThang() {
		return thang;
	}
	
	public int layNam() {
		return nam;
	}
	
}
