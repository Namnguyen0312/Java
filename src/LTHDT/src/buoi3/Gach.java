package buoi3;

import buoi2.Date;

import java.util.Scanner;

public class Gach {
	private String ms, mau;			
	private int sl, dai, ngang;				
	private long gia;	
	private Date ngaysx;
	
	public Gach() {
		ms = new String();
		mau = new String();
		sl = 0;
		dai = 0;
		ngang = 0;
		gia = 0;
		ngaysx = new Date();
	}
	
	public Gach(Gach g) {
		ms = new String(g.ms);
		mau = new String(g.mau);
		sl = g.sl;
		dai = g.dai;
		ngang = g.ngang;
		gia = g.gia;
		ngaysx = new Date(g.ngaysx);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ma so: ");
		ms = sc.nextLine();
		System.out.print("Nhap mau : ");
		mau = sc.nextLine();
		System.out.print("Nhap so luong vien trong mot hop: ");
		sl = sc.nextInt();
		System.out.print("Nhap chieu dai: ");
		dai = sc.nextInt();
		System.out.print("Nhap chieu rong: ");
		ngang = sc.nextInt();
		System.out.print("Nhap gia ban: ");
		gia = sc.nextLong();
		System.out.println("Nhap ngay sx: ");
		ngaysx.nhap();
		
	}
	
	
	public String toString() {
		return "\n-Ma so: "+ms+"\n-Mau: "+mau+"\n-So luong: "+sl+"\n-Chieu dai: "+dai+"\n-Chieu ngang: "+ngang 
				+"\n-Gia ban: "+gia+"\n-Ngay san xuat: "+ngaysx;
	}
	
	public int soLuongHop(int D, int N) {
		int svngang = N/ngang;
		if (N % ngang != 0) svngang++;
		int svdai = D/dai;
		if (D % dai != 0) svdai++;
		int sv = svngang * svdai;
		int sohop = sv/sl;
		if (sv % sl != 0) sohop++;
		return sohop;
	}
	
	public long giaBanLe() {
		return (long) (gia/(sl*1.2));
	}
	
	public long layGia() {
		return gia;
	}
		
}

