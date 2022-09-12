package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
//in a,b
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 9);
		System.out.print("a = ");
		a.in();
		System.out.print("b = ");
		b.in();

		System.out.println();
//nhap x....nghich dao_gt nghich dao_gia tri thuc
		PhanSo x = new PhanSo();
		System.out.println("PS thu nhat");
		x.nhap();
		System.out.print("Nghich dao x = ");
		x.nghichDao();
		x.in();
		System.out.print("Gia tri nghich dao y = ");
		x.gtnDao();
		x.in();
		x.gtThuc();
		x.in();
		
		System.out.println();
//nhap y....nghich dao_gt nghich dao_gia tri thuc
		PhanSo y = new PhanSo();
		System.out.println("PS thu hai");
		y.nhap();
		System.out.print("Nghich dao x = ");
		y.nghichDao();
		y.in();
		System.out.print("Gia tri nghich dao y = ");
		y.gtnDao();
		y.in();
		y.gtnDao();
		x.in();
		
		System.out.println();
//tong 2 phan so
		PhanSo pstong = new PhanSo();
		System.out.print("Tong a + b = ");
		pstong = x.congPS(y);
		pstong.in();
		
		System.out.println();
		
//////tong phan so voi so so nguyen
//		Scanner sc = new scanner(System.in);
//			int x = sc.nextInt()
//		PhanSo psntong = new PhanSo();
//		System.out.println("Tong ");
		
//nhap danh sach 
		PhanSo ds[];
		Scanner sc = new Scanner (System.in);
		System.out.print("Nhap so phan tu: ");
		int n = sc.nextInt();
		ds = new PhanSo[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan so thu " + (i+1) + ":");
			ds[i] = new PhanSo();
			ds[i].nhap();
		}
//in danh sach 	
		System.out.println("Cac phan so vua nhap la: ");
		for (PhanSo e : ds) e.in();
		
		System.out.println();
//tong danh sach
		PhanSo tong = new PhanSo();
		for (int i = 0; i < n; i++) {
			tong = tong.congPS(ds[i]);
		}
		System.out.print("Tong cac  phan so: tong = ");
		tong.in();
		
		System.out.println();
//max danh sach		
		PhanSo max = new PhanSo();
		max = ds[0];
		for (int i = 0; i < n; i++) {
			if (max.lonHon(ds[i]) < 0)
				max = ds[i];
		}
		System.out.print("Phan so lon nhat la: ");
		max.in();
		
		System.out.println();
		
//sap xep tang dan
		for(int i = 0; i < n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if( ds[i].lonHon(ds[j])>0 ) {
					 PhanSo  temp = ds[i];
					 ds[i] = ds[j];
					 ds[j] = temp;
				}
			}
		}
		System.out.println("Danh sach phan so sau khi sap xep");
		for(int i=0; i < n; i++)
		     ds[i].in();
	}
}
