package buoi1;

import java.util.Scanner;

public class Bai4 {
	public int nhap(){
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		do{
			System.out.print("Nhap mot so: ");
			s = sc.nextLine();
			try{
				n = Integer.parseInt(s);
			}
			catch(Exception e){
				n = Integer.MAX_VALUE;
				System.out.println("Nhap sai, nhap lai!");
				
			}
		} while(n == Integer.MAX_VALUE);
		return n;
	}
	public static void main(String[] args) {
		Bai4 t = new Bai4();
		int a = t.nhap();
		int b = t.nhap();
		System.out.println(a + " + " + b + " = " + (a+b));
	}

}