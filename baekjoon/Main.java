package backjoon.run;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[][] arr = new int[T][2];
		
		
		for(int i=0; i < arr.length; i++ ){
			
			for(int j = 0; j<2;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i < arr.length; i++ ){
			int a = 0;
			
			for(int j = 0; j<2;j++) {
				a+=arr[i][j];
			}
			System.out.println(a);
		}
		
		
		

		// gogodan();
	}

	private static void gogodan() {

		int N = sc.nextInt();

		if (N >= 1 && N <= 9) {

			for (int i = 1; i < 10; i++) {

				System.out.println(N + " * " + i + " = " + N * i);

				// System.out.printf("%d + %d = %d\n", N, i, N * i);
			}
		}

	}

}
