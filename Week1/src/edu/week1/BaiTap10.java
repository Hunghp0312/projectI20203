package edu.week1;

import java.util.Scanner;

public class BaiTap10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 2; i <= n;i++) {
			if(n%i == 0) {
				if(checkPrime(i)) {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println();
		System.out.println("Hoang Phuc Hung - 20183756");
	}
	public static boolean checkPrime(int k) {
		if(k == 2 || k == 3) return true;
		for(int j = 2; j * j <= k;j++) {
			if(k%j == 0) return false;
			
		}
		return true;
	}
}
