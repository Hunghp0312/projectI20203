package edu.week1;

import java.util.Scanner;

public class BaiTap9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tmp = n;
		System.out.print(n + " = " );
		while(n!=1) {
			if(n != tmp) System.out.print(".");
			for(int i = 2; i <= n;i++) {
				if(n%i ==0) {
					n = n/i;
					System.out.print(i);
					break;
				}
				
			}
		}
		System.out.println();
		System.out.println("Hoang Phuc Hung - 20183756");
	}
}
