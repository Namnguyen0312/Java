package buoi1;

import java.util.Scanner;

public class Bai8 {
	int ds[];
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		int n = sc.nextInt();
		ds = new int[n];
		for (int i = 0; i < n; i++){
			System.out.print("Nhap phu tu thu " + i + ":");
			ds[i] = sc.nextInt();
		}
	}
	
	public void in() {
		for (int i = 0; i < ds.length; i++){
			System.out.print(ds[i] + " ");
		}
	}
	
	public int timkiem(int x){
		int cout = 0;
		for (int i = 0; i < ds.length; i++){
			if (x == ds[i]){
				cout++;
			}
		}
		return cout;
	}
	
	public void sapxeptang() {
		for (int i = 0; i < ds.length-1; i++) {
			for (int j = i+1; j < ds.length; j++) {
				if (ds[i] > ds[j]) {
					int tmp = ds[i];
					ds[i] = ds[j];
					ds[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Bai8 d = new Bai8();
		
		d.nhap();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so can tim: ");
		int x = sc.nextInt();

		System.out.print("So luong la: " + d.timkiem(x));
		
		System.out.println();
		System.out.println("Day so tang dan la: ");
		d.sapxeptang();
		d.in();
		
	}

}