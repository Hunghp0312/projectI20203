package edu.week1;

public class BaiTap3 {
	public static void main(String[] args) {
		for(int i = 1000; i <= 2000;i++) {
			if(checkPrime(i)) {
				System.out.print(i+ " ");
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
