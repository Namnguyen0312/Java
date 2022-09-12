package buoi5;

import java.util.Scanner;

public class SDHoaDon {

	public static void main(String[] args) {
		
		HoaDon ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong khach hang: ");
		int n = sc.nextInt();
		ds = new HoaDon[n];
		for (int i = 0; i<n; i++) {
			ds[i] = new HoaDon();
		}
		for (int i = 0; i<n; i++) {
			System.out.println("Nhap Hoa Don khach hang " + (i+1) + ":");
			ds[i].nhap();
		}
		
		System.out.print("\n======HOA_DON=====\n\n");
		for (int i = 0; i<n; i++) {
			System.out.println("HOA DON CUA KHACH HANG THU " + (i+1) +":" + ds[i]);
			System.out.println();
		}
		
	}


}
