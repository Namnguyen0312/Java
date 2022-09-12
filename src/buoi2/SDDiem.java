package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		
		Diem A = new Diem(3, 4);
		System.out.print("A");
		System.out.println(A);
		
		Diem B = new Diem();
		B.nhap();
		System.out.print("B");
		System.out.println(B);
		
		System.out.print("Diem doi xung la: C");
		Diem C = new Diem(-B.layX(), -B.layY());
		System.out.println(C);
		
		System.out.print("Khoang cach: OB = " + B.khoangCach());
		
		System.out.println();
		
		System.out.print("Khoang cach: BA = " + B.khoangCach(A));
		
	}
}
