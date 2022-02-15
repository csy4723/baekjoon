package backjoon.run;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class if문{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {
			System.out.println("==");
		}

//2
		
		int score = sc.nextInt();
		
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score <=89 && score >=80) {
			System.out.println("B");
		}else if(score <= 79 && score >= 79) {
			System.out.println("C");
		}else if(score<= 69 && score >=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		//3
		

		int year = sc.nextInt();
		
		if((year%400 == 0) ||(year%4 == 0 && year%100 != 0)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
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
       // 5
		
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
		
		
		//다른 방법
		
		int time = h*60 + m;
		
		time-=45;
		
		if(time<0) {
			int last = 24 * 60;
			time = last - Math.abs(time);
		}
		
		System.out.println(time/60 + " "+ time%60);
		
		
		
		cookTime();
	}

	private static void cookTime() {


		
			Scanner sc = new Scanner(System.in);
			
			String s = sc.nextLine();
			
			StringTokenizer st = new StringTokenizer(s);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			
			int c = sc.nextInt();
			
			int time = a*60 + b+ c;
			
			int h = 0;
			int m = 0;
			
			if(time/60 >= 24 ) {
				h = time/60 - 24;
				m = time%60;
			}else {
				h = time/60;
				m = time%60;
			}
			
			
			System.out.println(h+" "+m);
		}


		
	}

