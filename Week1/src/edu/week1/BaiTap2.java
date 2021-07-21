package edu.week1;

public class BaiTap2 {
	public static void main(String[] args) {
		int i= 2;
		int cnt = 0;
		while(true) {
			if(checkPrime(i)) {
				System.out.print(i + " ");
				cnt++;
			}
			i++;
			if(cnt == 20) break;
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
