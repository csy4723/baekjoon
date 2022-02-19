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
		
		dice();
	}

	private static void dice() {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
		int result = 0;
			
		String[] s = sc.nextLine().split(" ");
		
		for(int i = 0; i<3; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		if(arr[0] != arr[1] && arr[1]!=arr[2] ) {
			
			int k = Math.max(arr[0], arr[1]);// 두 수 중 큰 수를 
			int L = Math.max(k, arr[2]); // 다음 수와 비교 하여 이 중 큰 수를 낸다.
			
			result = L*100;
			
		}else if(arr[0] == arr[1] && arr[1]==arr[2]) {
			result = 10000+arr[0]*1000;
		}else if(arr[0] == arr[1]) {
			result = 1000+arr[0]*100;
		}else if(arr[1]==arr[2]) {
			result = 1000+arr[1]*100;
		}else if(arr[0]==arr[2]){
			result = 1000+arr[0]*100;
		}
		
		System.out.println(result);
		
		////////다른 방법
		
//		  InputStreamReader reader = new InputStreamReader(System.in);
//	      BufferedReader bufReader = new BufferedReader(reader);
	//
//	      String[] input = bufReader.readLine().split(" ");
//	      int[] value = new int[3];
	//
//	      for(int i = 0; i < input.length; i++){
//	          value[i] = Integer.parseInt(input[i]);
//	      }
	//
//	      if(value[0] == value[1] && value[1] == value[2]){
//	          System.out.println(10000 + value[0] * 1000);
//	      }
//	      else if(value[0] == value[1] || value[0] == value[2]){
//	          System.out.println(1000 + value[0] * 100);
//	      }
//	      else if(value[1] == value[2]){
//	          System.out.println(1000 + value[1] * 100);
//	      }
//	      else {
//	          Arrays.sort(value);
//	          System.out.println(value[2] * 100);
//	      }
		
		
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

