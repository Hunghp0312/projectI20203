package edu.week1;
import java.util.Scanner;
public class BaiTap12 {
	private static void inSao(int i, int h) {
      	for(int count=1; count<=(2*h-1); count++) {
           	if(count >= (h-(i-1)) && count<=(h+(i-1))) {
                 	System.out.print("*");
           	}
           	else {
                 	System.out.print(" ");
           	}
      	}
      	System.out.println();
 	}
 	public static void main(String[] args) {
      	int h;
      	int chon=0;
      	Scanner in = new Scanner(System.in);
      	System.out.print("Nhap chieu cao h= ");
      	h = in.nextInt();
      	while(h<2 || h>10) {
           	System.out.println("chieu cai phai thoa man dieu kien 2 <= h <= 10");
           	System.out.print("Nhap lai chieu cao h= ");
           	h = in.nextInt();
      	}
      	while(chon!=1 && chon!=2) {
           	System.out.println("Chon kieu in: (1)In xuoi   	(2)In nguoc");
           	chon = in.nextInt();
      	}
      	if(chon==1) {
           	for(int i=1; i<=h; i++) {
                 	inSao(i, h);
           	}   
      	}
      	else if(chon==2) {
           	for(int i=h; i>=1; i--) {
                 	inSao(i, h);
           	}
      	}
      	System.out.println("Hoang Phuc Hung - 20183756");   
 	}

}
