package buoi1;

import java.util.Scanner;

public class Bai5 {
	
	public void bac1(double a, double b){
		if (a==0){
			System.out.println("PHUONG TRINh VO NGHIEM!");
		} else{
			System.out.println("PHUONG TRINH CO NGHIEM X = " + (-b/a));
		}
		
	}
	
	public void bac2(double a, double b, double c){
		double denta;
		if (a==0) bac1(b,c);
		else{
			denta = b*b - 4*a*c;
			if (denta > 0) {
				System.out.println("PHUONG TRINH CO HAI NGHIEM PHAN BIET: ");
				System.out.println("x1 = " + ((-b-Math.sqrt(denta))/(2*a)));
				System.out.println("x2 = " + ((-b+Math.sqrt(denta))/(2*a)));
			}
			else if (denta == 0){
				System.out.println("PHUONG TRINH CO NGHIEM KEP: ");
				System.out.println("x = " + (-b/(2*a)));
			} else
				System.out.println("PHUONG TRINH VO NGHIEM!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap b: ");
		double b = sc.nextDouble();
		System.out.print("Nhap c: ");
		double c = sc.nextDouble();
		Bai5 gpt = new Bai5();
		gpt.bac2(a, b, c);

	}

}