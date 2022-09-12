package buoi5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang {
	private float tile;
	private Date ngayMgiam;
	
	public KhachHangVIP(){
		super();
		tile = 0.0f;
		ngayMgiam = new Date();
	}
	
	public KhachHangVIP(KhachHangVIP khv) {
		super(khv);
		tile = khv.tile;
		ngayMgiam = khv.ngayMgiam;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tile cua khach hang Vip: ");
		tile = sc.nextFloat();
		System.out.print("Nhap ngay mien giam: ");
		ngayMgiam.nhap();
	}
	
	public void in() {
		super.in();
		System.out.print("- Ti le: " + tile + "\n" + "- Ngay mien giam: " + ngayMgiam);
	}
	
	public String toString() {
		return super.toString() + "- Ti le: " + tile + "\n" + "- Ngay mien giam: " + ngayMgiam;
	}
}
