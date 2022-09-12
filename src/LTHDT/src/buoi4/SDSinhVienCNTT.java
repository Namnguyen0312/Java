package buoi4;

import java.util.Scanner;

public class SDSinhVienCNTT {

	public static void main(String[] args) {
		SinhVienCNTT ds[];
		Scanner sc = new Scanner(System.in);
		char c = ' ';
		System.out.print("Nhap so sinh vien: ");
		int n = sc.nextInt();
		sc.nextLine();
		ds = new SinhVienCNTT[n];
		for (int i = 0; i<n; i++){
			System.out.print("Ban nhap thong tin cho sinh vien(s), cho SinhVienCNTT(c): ");
			c = sc.nextLine().charAt(0);
			if (c == 's') ds[i] = new SinhVienCNTT();
			else ds[i] = new SinhVienCNTT();
			ds[i].nhap();
		}
		for (int i = 0; i<n; i++)
			System.out.println("Sinh vien thu " + (i+1) +":" + ds[i]);
		
			String email;
			System.out.println("Nhap email sinh vien can tim: ");
			email = sc.nextLine();
		for (int i =0; i<n; i++){
			if (ds[i].layEmail().equals(email)){
				System.out.println("Diem tb: " + ds[i].dtb());
				break;
			}
		}
	}

}