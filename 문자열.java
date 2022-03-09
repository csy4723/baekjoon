package backjoon.run;

import java.util.Scanner;

public class 문자열 {

	public static void main(String[] args) {

		ASCIICode();
		sum();

	}

	private static void sum() {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] num2 = sc.next().split("");
		int sum = 0;
		
		for(int i = 0; i<num;i++) {
			
			sum += Integer.parseInt(num2[i]);
			
		}
		
		System.out.println(sum);
		
	
		
	}

	private static void ASCIICode() {
		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);

		System.out.println((int) ch);

	}

}
