package buoi4;
import buoi2.Diem;

public class SDDiemMau {

	public static void main(String[] args) {
		DiemMau A = new DiemMau(5, 10, "Trang");
		A.in();
		A.toString();
		
		DiemMau B = new DiemMau();
		System.out.println("\nNhap diem B:");
		B.nhap();
		
		B.doiDiem(10, 8);
		System.out.println("Diem B sau khi doi la: ");
		B.in();
		System.out.println();
		B.ganmau("Vang");
		System.out.println("Diem B sau khi gan mau:");
		B.in();
	}

}