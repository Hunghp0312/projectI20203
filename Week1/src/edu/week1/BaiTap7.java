package edu.week1;

public class BaiTap7 {
	public static void main(String[] args) {
		int div5 = 0,div5_1 = 0,div5_2 = 0,div5_3 = 0;
		for(int i = 0; i < 100;i++) {
			if(i%5 == 0) {
				div5 += 1;
			}
			if(i%5 == 1) {
				div5_1 +=1;
			}
			if(i%5 == 2) {
				div5_2 +=1;
			}
			if(i%5 ==3) {
				div5_3 +=1;
			}
		}
		System.out.println("So chu so chia het cho 5 < 100: " + div5);
		System.out.println("So chu so chia cho 5 du 1 < 100: " + div5_1);
		System.out.println("So chu so chia cho 5 du 2 < 100: " + div5_2);
		System.out.println("So chu so chia cho 5 du 3 < 100: " + div5_3);
		System.out.println("Hoang Phuc Hung - 20183756");
	}
}
