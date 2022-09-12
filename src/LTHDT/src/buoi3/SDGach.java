package buoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);
		Gach ds[];
		int n; System.out.print("Nhap vao so hop gach: ");
		n = sc.nextInt();
		ds = new Gach[n];
		for (int i = 0; i < n; i++) 
			ds[i] = new Gach();
		for (int i = 0; i<n; i++) {
			System.out.print("Nhap thong tin cho hop gach " + (i+1) + ":");
			ds[i].nhap();
		}
		System.out.println("\n==========Thong tin cac hop gach==========");
		for(int i = 0; i < n; i++) {
			System.out.println("\nHop gach thu " + (i+1) + ": \n" + ds[i]);
		}
		
		for (Gach e:ds) e.toString();
		System.out.print("So tien it nhat cho mot dien tich dai 20m, ngang 5m la: ");
		long min = Long.MAX_VALUE;
		for (int i = 0; i<n; i++) {
			long t = ds[i].soLuongHop(20, 5)*ds[i].layGia();
			if (t < min) min = t;
		}
		System.out.println(min);
	}
}
