package edu.week1;

public class BaiTap5 {
	public static void main(String[] args) {
		for(int i = 1001; i < 2000;i++) {
			if(i%3 == 0 && i%5 ==0 && i%7 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("Hoang Phuc Hung - 20183756");
	}
}
