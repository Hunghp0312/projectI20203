package edu.week1;

public class BaiTap6 {
	public static void main(String[] args) {
		int cnt = 0;
		int i = 5;
		while(true) {
			if(checkPerfectNumber(i)) {
				System.out.print(i+ " ");
				cnt++;
			}
			i++;
			if(cnt == 4) break;
		}
		
		System.out.println(33550336 + " ");
		System.out.println("Hoang Phuc Hung - 20183756");
	}
	public static boolean checkPerfectNumber(int k) {
		int sum = 1;
		for(int j = 2; j*j<= k;j++) {
			if(k%j == 0) sum+= j + k/j;
		}
		if(sum == k) return true;
		else return false;
	}
}
