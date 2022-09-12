package buoi5;

import java.util.Scanner;

public class HangHoa {
	private String ms, ten;
	private Date ngaysx;
	
	public HangHoa() {
		ms = new String();
		ten = new String();
		ngaysx = new Date();
	}
	
	public HangHoa(HangHoa hh) {
		ms = new String(hh.ms);
		ten = new String(hh.ten);
		ngaysx = new Date(hh.ngaysx);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\tNhap ma so hang hoa: ");
		ms = sc.nextLine();
		System.out.print("\tNhap ten hang hoa: ");
		ten = sc.nextLine();
		System.out.print("\tNhap ngay sx hang hoa: ");
		ngaysx.nhap();
	}
	
	public void in() {
		System.out.println("\n- Ma so hang hoa: "+ms + "\n" + "- Ten hang hoa: " + ten + "\n"+"- Ngay san xuat hang hoa: " + ngaysx);
	}
	
	public String toString() {
		return "\n- Ma so hang hoa: "+ms + "\n" + "- Ten hang hoa: " + ten + "\n"+"- Ngay san xuat hang hoa: " + ngaysx;
	}
	
}
