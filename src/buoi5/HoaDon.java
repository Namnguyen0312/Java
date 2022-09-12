package buoi5;

import java.util.Scanner;

public class HoaDon {
	private String ms, tench;
	private ChiTiet c[];
	private Date ngaylap;
	private KhachHang k;
	private int soLuongSP;
	
	public HoaDon() {
		ms = new String();
		tench = new String();
		c = new ChiTiet[0];
		ngaylap = new Date();
		k = new KhachHang();
	}
	
	public HoaDon(HoaDon hd) {
		ms = new String(hd.ms);
		tench = new String(hd.tench);
		c = new ChiTiet[0];
		ngaylap = new Date(hd.ngaylap);
		k = new KhachHang(hd.k);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("- Nhap ma so hoa don: ");
		ms = sc.nextLine();
		System.out.println("- Nhap khach hang: ");
		k.nhap();
		System.out.print("- Nhap ngay lap: ");
		ngaylap.nhap();
		System.out.print("- Nhap so luong loai hang khach hang mua: ");
		soLuongSP = sc.nextInt();
		c = new ChiTiet[soLuongSP];
		System.out.print("- Nhap chi tiet tung san pham: \n");
		for(int i = 0; i < soLuongSP; ++i) {
			System.out.print("- Mat hang thu " + (i+1) + " : \n");
			c[i] = new ChiTiet();
			c[i].nhap();
		}
	}
	
	public void in() {
		System.out.println("\n- Ma so hoa don: "+ms+"\n"+"- Khach hang: "+k + "\n- Ngay lap: "+ngaylap+"\n"
				+"- So luong loai hang khach mua: " + soLuongSP + "\n");
	}
	
	public String toString() {
		String s = "\n- Ma so hoa don: "+ms+"\n"+"- Khach hang: "+k + "\n- Ngay lap: "+ngaylap+"\n"
				+"- So luong loai hang khach mua: " + soLuongSP + "\n";
		for (int i = 0; i < soLuongSP; ++i) {
			s += "- Loai hang thu " + (i + 1) + "\n";
			s += c[i].toString();
			s += "\n==> Thanh tien: " + c[i].getDonGia()*c[i].getSoluong() + "\n";
		}
		s += "\n- Tong so tien phai tra: " + thanhTien() + "\n";
		return s;
	}
	public long thanhTien() {
		long s = 0;
		for (int i = 0; i < c.length; ++i) {
			s = s + c[i].getDonGia() * c[i].getSoluong();
		}
		return s;
	}
}
