package backjoon.run;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class for문 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		gogodan();

		intplus();

		plustuntilnum();

		speedplus();

		tilN();

		Nlit();

		aplusbtwice();

		halfstar();

		reversestar();

		smallthanx();

	}

	private static void reversestar() {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= (num - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	private static void smallthanx() {
		Scanner sc = new Scanner(System.in);

		String[] arr = sc.nextLine().split(" ");

		int n = Integer.parseInt(arr[0]);
		int x = Integer.parseInt(arr[1]);

		int[] nrr = new int[n];

		for (int i = 0; i < n; i++) {

			nrr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {

			if (nrr[i] < x) {
				System.out.print(nrr[i] + " ");
			}
		}

	}

	private static void halfstar() {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		} // TODO Auto-generated method stub

	}

	private static void aplusbtwice() {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= test; i++) {
			String[] arr = sc.nextLine().split(" ");

			int num1 = Integer.parseInt(arr[0]);
			int num2 = Integer.parseInt(arr[1]);

			System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2));
		}

	}

	private static void Nlit() {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			System.out.println(i);
		}

	}

	private static void tilN() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}

	}

	private static void speedplus() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			bw.write((a + b) + "\n");

		}

		br.close();
		bw.flush();
		bw.close();

	}

	private static void plustuntilnum() {
		int num = sc.nextInt();
		int result = 0;

		for (int i = 1; i <= num; i++) {

			result += i;

		}

		System.out.println(result);
	}

	private static void intplus() {

		int T = sc.nextInt();

		int[][] arr = new int[T][2];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			int a = 0;

			for (int j = 0; j < 2; j++) {
				a += arr[i][j];
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
