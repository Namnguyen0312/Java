package buoi3;
	import buoi2.Date;
	import java.util.Scanner;

	public class SinhVien {
		private String mssv, hten;
		private Date nsinh;
		private int sl;
		private String tenHp[], diem[];
		
		public SinhVien() {
			mssv = new String();
			hten = new String();
			nsinh = new Date();
			sl = 0;
			tenHp = new String[50];
			diem = new String[50];
		}
		
		public SinhVien(SinhVien s) {
			mssv = new String(s.mssv);
			hten = new String(s.hten);
			nsinh = new Date(s.nsinh);
			sl = s.sl;
			tenHp = new String[50];
			diem = new String[50];
			for (int i = 0; i < sl; i++) {
				tenHp[i] = new String(s.tenHp[i]);
				diem[i] = new String(s.diem[i]);
			}
		}
		
		public void nhap() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap mssv: ");
			mssv = sc.nextLine();
			System.out.print("Nhap ho ten: ");
			hten = sc.nextLine();
			System.out.print("Nhap ngay sinh: \n");
			nsinh.nhap();
		}
		
		public void dky() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap so mon hoc dang ky: ");
			sl = sc.nextInt();
			sc.nextLine();
			
			for (int i = 0; i < sl; i++) {
				System.out.print("Nhap mon hoc thu " + (i+1) + ": ");
				tenHp[i] = sc.nextLine();
			}
		}
		
		public void nhapDiem() {
			double sum= 0;
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < sl; i++) {
				System.out.print("Nhap diem mon:  " + tenHp[i]);
				diem[i] = sc.nextLine();
			}
		}
		
		public void themHp(String ten, String d) {
			if (sl<tenHp.length-1) {
				tenHp[sl] = new String(ten);
				tenHp[sl] = new String(d);
				sl++;
			}
		}
		
//		public void xoaHp(String ten) {
//			int pos = -1;
//			for (int i = 0; i<sl; i++) {
//				if (tenHp[i].equals(ten)) {
//					pos = i;
//					break;
//				}
//				if (pos != -1) {
//					for (int i = pos; i<sl; i++) {
//						tenHp[i] = tenHp[i+1];
//						diem[i] = diem[i+1];
//					}
//					sl--;
//				}
//			}
//		}
		
		public float dtb() {
			float d = 0;
			for (int i = 0; i<sl; i++) {
				if (diem[i].equals("A"))
					d+=4;
				else if (diem[i].equals("B+"))
					d+=3.5;
				else if (diem[i].equals("B"))
					d+=3;
				else if (diem[i].equals("C+"))
					d+=2.5;
				else if (diem[i].equals("C"))
					d+=2;
				else if (diem[i].equals("D+"))
					d+=1.5;
				else if (diem[i].equals("D"))
					d+=1;
				else 
					d+=0;
			}
			return d/(float)sl;
		}
		
		public String layTen() {
			String h = new String(hten);
			h = h.trim();
			return h.substring(h.lastIndexOf(" ")+1);
		}
		
		public String toString() {
			String s  = mssv + " - " + hten + " - " + nsinh;
			for (int i = 0; i < sl; i++) {
				s += " - " + tenHp[i] + ": " + diem[i];
			}
			return s;
		}
		
	}
