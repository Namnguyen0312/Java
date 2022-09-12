package buoi2;

import java.util.Scanner;

public class Diem {
	
	private int x, y;
	
	public Diem() { 
		x = 0;
		y = 0;
	}
	
	public Diem(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	public Diem(Diem d) {
		x = d.x;
		y = d.y;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap x = ");
			x = sc.nextInt();
		System.out.print("Nhap y = ");
			y = sc.nextInt();
	}
	
	public void in() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public float khoangCach() {
		float kq = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return kq;
	}
	
	public float khoangCach(Diem B) {
		float ans = (float) Math.sqrt(Math.pow(x - B.x, 2) + Math.pow(y - B.y, 2));
		return ans;
	}
	
	public int layX() {
		return x;
	}
	
	public int layY() {
		return y;
	}
	
	public void ganX(int x1) {
		x = x1;
	}
	
	public void ganY(int y1) {
		y = y1;
	}
	
	public void gan(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
}
	


