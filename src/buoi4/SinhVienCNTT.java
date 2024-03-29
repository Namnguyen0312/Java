package buoi4;
import java.util.Scanner;

import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien{
	
	private String tkhoan, mkhau, email;

	public SinhVienCNTT() {
		super();
		tkhoan = new String();
		mkhau = new String();
		email = new String();
	}
	public SinhVienCNTT(SinhVienCNTT s) {
		super(s);
		tkhoan = new String(s.tkhoan);
		mkhau = new String(s.mkhau);
		email = new String(s.email);
	}
	
	public void nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tai khoan: ");
		tkhoan = sc.nextLine();
		System.out.print("Nhap mat khau: ");
		mkhau = sc.nextLine();
		System.out.print("Nhap email: ");
		email = sc.nextLine();
	}
	
	public String toString(){
		return super.toString() + tkhoan + "-" + mkhau + "-" + email; 
	}
	
	public String layEmail(){
		return email;
	}
	
	public void doiMatKhau(String m){
		mkhau = new String(m);
	}
}