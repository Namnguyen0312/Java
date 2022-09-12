package buoi5;

import java.util.Scanner;

public class ChiTiet {
	private int sluong;
	private long dgia;
	private HangHoa h;
	
	public ChiTiet() {
		sluong = 0;
		dgia = 0;
		h = new HangHoa();
	}
	
	public ChiTiet(ChiTiet ct) {
		sluong = ct.sluong;
		dgia = ct.dgia;
		h = new HangHoa(ct.h);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("- Nhap so luong: ");
		sluong = sc.nextInt();
		System.out.print("- Nhap don gia: ");
		dgia = sc.nextLong();
		System.out.print("Nhap hang hoa: \n");
		h.nhap();
	}
	
	public void in() {
		System.out.println("- So luong: " +sluong + "\n" + "- Don gia: " + dgia+"\n" + "- Hang hoa: " + h);
	}
	
	public String toString() {
		return "- So luong: " +sluong + "\n" + "- Don gia: " + dgia+"\n" + "- Hang hoa: " + h;
	}
	public long getDonGia() {
		return dgia;
	}
	public int getSoluong() {
		return sluong;
	}
}
