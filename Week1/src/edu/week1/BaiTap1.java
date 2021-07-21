package edu.week1;

public class BaiTap1 {
    public static void main(String[] args) {
        int i;
        boolean check;
        for(i = 2; i< 100;i++){
             check = false;
             for(int j = 2; j <i;j++){
                 if(i%j ==0) check =true;
             }
             if(check){
                 System.out.print(i + " ");
             }
        }
        System.out.println();
        System.out.println("Hoang Phuc Hung - 20183756");
    }
}
