package edu.week1;
import java.util.Scanner;
public class BaiTap8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean check = true;
		for(int i = 2; i*i <=n;i++) {
			if(n%i == 0) {
				System.out.println("Uoc nguyen to nho nhat cua n la: " + i);
				check =false;
				break;
			}
		}
		if(check) System.out.println("n la so nguyen to");
		System.out.println("Hoang Phuc Hung - 20183756");
	}
}
