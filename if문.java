package backjoon.run;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		if (a > b) {
//			System.out.println(">");
//		} else if (a < b) {
//			System.out.println("<");
//		} else if (a == b) {
//			System.out.println("==");
//		}
//
////2
//		
//		int score = sc.nextInt();
//		
//		
//		if(score >= 90) {
//			System.out.println("A");
//		}else if(score <=89 && score >=80) {
//			System.out.println("B");
//		}else if(score <= 79 && score >= 79) {
//			System.out.println("C");
//		}else if(score<= 69 && score >=60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
//		
//		//3
//		
//
//		int year = sc.nextInt();
//		
//		if((year%400 == 0) ||(year%4 == 0 && year%100 != 0)) {
//			System.out.println("1");
//		}else {
//			System.out.println("0");
//		}
		
		//4
		
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		if(a >0 && b>0) {
//			System.out.println("1");
//		}else if(a>0 && b<0) {
//			System.out.println("4");
//		}else if(a<0 && b>0) {
//			System.out.println("2");
//		}else if(a<0 && b<0) {
//			System.out.println("3");
//		}
//		
//		//다른 방법
//		
//		if(a * b >0) {
//			
//			if(a>0) {
//				System.out.println("1");
//			}else {
//				System.out.println("3");
//			}
//			
//		}else if(a*b<0){
//			if(a>0) {
//				System.out.println("4");
//			}else {
//				System.out.println("2");
//			}
//		}
//		
//		
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m<45) {
			h--;
			m+=15;
		}else {
			m-=45;
			
		}
		if(h<0) {
			h+=24;
		}
		
		System.out.println(h+" "+m);
		
		
	}

}
