package buoi1;

import java.util.Scanner;

public class Bai6 {

	public void sngto(int n){
		int s=0;
		for (int i = 2; i < n/2; i++){
			if (n % i == 0)
				s++;
		}
		
		if (s==0) 
			System.out.println(n + " la so nguyen to.");
		else 
			System.out.println(n + " khong la so nguyen to.");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = sc.nextInt();
		Bai6 nt = new Bai6();
		nt.sngto(n);
		String s = Integer.toBinaryString(n);
		System.out.println("So nhi phan la: "+ s);
	}

}