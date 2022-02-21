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
