package buoi3;

import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
		SinhVien a = new SinhVien();
		a.nhap();
		a.themHp("LTHDT", "F");
		System.out.println("Thong tin sinh vien a: " + a);
		
		SinhVien ds[];
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap so sinh vien: ");
		n = sc.nextInt();
		ds = new SinhVien[n];
		for (int i = 0; i<n; i++) {
			ds[i] = new SinhVien();
		}
		for (int i = 0; i<n; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i+1) + ": ");
			ds[i].nhap();
			ds[i].dky();
			ds[i].nhapDiem();			
		}
		
		System.out.println();
				
		for (int i = 0; i<n; i++)
			System.out.println("Thong tin sinh vien thu " + (i+1) + ":" + ds[i]);
		
		System.out.println();
		
		float max = 0;
		System.out.println("Danh sach sinh vien bi canh bao hoc vu: ");
		for (int i = 0; i<n; i++) {
			if (ds[i].dtb() < 1)
				System.out.println(ds[i]);
			if (max < ds[i].dtb())
				max = ds[i].dtb();
				
		}
		
		System.out.println();
		
		System.out.print("Sinh vien co diem trung binh cao nhat lop la: ");
		for (int i = 0; i<n; i++) {
			if (max == ds[i].dtb()) {
				System.out.println(ds[i]);
				break;
			}
		}
		
		System.out.println("\n");
		
		System.out.println("Danh sach sinh vien duoc sap xep theo ten: ");
		for (int i = 0; i<n-1; i++) {
			for (int j = i+1; j<n; j++) {
				if (ds[i].layTen().compareTo(ds[j].layTen())>0) {
					SinhVien t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
			}
		}
		
		for (int i = 0; i<n; i++) {
			System.out.println("Thong tin sinh vien thu " + (i+1) + ":" + ds[i]);
		}
	}
}
