package buoi3;
import buoi2.Diem;

public class SDDoanThang {

	public static void main(String[] args) {
		Diem A = new Diem(2, 5);
		Diem B = new Diem(20, 35);
		DoanThang AB = new DoanThang(A, B);
		System.out.print("AB: " + AB);
		AB.tinhTien(5, 3);
		System.out.print(AB);
		System.out.print("\nTrung diem AB: " + AB.trungDiem());
		
		System.out.println();
		
		DoanThang CD = new DoanThang();
		CD.nhap();
		System.out.print(CD);
		CD.tinhTien(6, 8);
		System.out.print(CD);
		System.out.print("\nTrung diem CD: " + CD.trungDiem());
	}

}