package buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tuSo, mauSo;
	public PhanSo() {
		tuSo = 0;
		mauSo = 1;
	}
	
	public PhanSo(int tu, int mau) {
		tuSo = tu;
		mauSo = mau;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tu: ");
		tuSo = sc.nextInt();
		
		int b;
		do {
			System.out.print("Nhap mau: ");
			b = sc.nextInt();
			
			if (b==0) {
				System.out.println("Mau phai khac 0. Hay nhap lai!");
			}
			else {
				mauSo = b;
			}
		}
		while (b==0);
	}
	
	public void in() {
		if (tuSo !=0 && mauSo != 1) {
			if (tuSo*mauSo < 0)
				System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
			else
				System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
		}
		else if (tuSo != 0) {
			if (mauSo == 1);
				System.out.println(tuSo);
		} else {
			System.out.println(tuSo);
		}
	}
	
	public void nghichDao() {
		int tmp;
		tmp = tuSo;
		tuSo = mauSo;
		mauSo = tmp;
}
	
	public PhanSo gtnDao() {
		PhanSo kq = new PhanSo(tuSo, mauSo);
		kq.tuSo = mauSo;
		kq.mauSo = tuSo;
		return kq;
	}
	
	public float gtThuc() {
		float ans = tuSo/mauSo;
		return ans;
	}
	
//	public boolean lonHon(PhanSo a) {
//		if ()
//	}
	
	public PhanSo congPS(PhanSo p2) {
		int a = tuSo*p2.mauSo + p2.tuSo*mauSo;
		int b = mauSo*p2.mauSo;
		return new PhanSo(a, b);
	}
	
	public PhanSo truPS(PhanSo p2) {
		int a = tuSo*p2.mauSo - p2.tuSo*mauSo;
		int b = mauSo*p2.mauSo;
		return new PhanSo(a, b);
	}
	
	public PhanSo nhanPS(PhanSo p2) {
		int a = tuSo*p2.tuSo;
		int b = mauSo*p2.mauSo;
		return new PhanSo(a, b);
	}
	
	public PhanSo chiaPS(PhanSo p2) {
		int a = tuSo*p2.mauSo;
		int b = mauSo*p2.tuSo;
		return new PhanSo(a, b);
	}
	
	public int lonHon(PhanSo a) {
		if (tuSo*a.mauSo == mauSo*a.tuSo) return 0;
		if (tuSo*a.mauSo > mauSo*a.tuSo) return 1;
		return -1;
	}
	
	public PhanSo congSoNguyen(int x) {
		int a = mauSo*x + tuSo;
		int b = mauSo;
		return new PhanSo(a, b);
	}
	
	public PhanSo truSoNguyen(int x) {
		int a = mauSo*x - tuSo;
		int b = mauSo;
		return new PhanSo(a, b);
	}
	
	public PhanSo nhanSoNguyen(int x) {
		int a = tuSo*x;
		int b = mauSo;
		return new PhanSo(a, b);
	}
	
	public PhanSo chiaSoNguyen(int x) {
		int a = tuSo;
		int b = mauSo*x;
		return new PhanSo(a, b);
	}
	
	public int layT() {
		return tuSo;
	}
	
	public int layM() {
		return mauSo;
	}
	
	public void gan(int tu, int mau) {
		tuSo = tu;
		mauSo = mau;
	}
	
	public void ganT(int tu) {
		tuSo = tu;
	}
	
	public void ganM(int mau) {
		mauSo = mau;
	}
}
