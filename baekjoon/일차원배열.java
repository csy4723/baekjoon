package backjoon.run;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class 일차원배열 {

	public static void main(String[] args) throws IOException {

		minmax();
		maxindex();
		onetonine();
		distinct();
		OXproblem();
		avgstu();

	}

	private static void avgstu() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		double avg = 0;

		for (int i = 1; i <= num; i++) {
			String[] score = br.readLine().split(" ");

			avg = 0;

			for (int j = 1; j < score.length; j++) {

				avg += Integer.parseInt(score[j]);

			}

			avg = avg / Double.parseDouble(score[0]); // 평균
			double student = 0;

			for (int k = 1; k < score.length; k++) {

				if (Double.parseDouble(score[k]) > avg) {

					student++;
				}

			}

			Double stdrst = 100 * (student / Double.parseDouble(score[0]));

			String result = String.format("%.3f", stdrst);

			bw.write(result + "%\n");

		}

		bw.flush();
		bw.close();
		br.close();

	}

	private static void OXproblem() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		String[] num = new String[n];
		int score;

		for (int i = 0; i < num.length; i++) {

			num[i] = br.readLine();
			score = 0;
			int ox = 0;
			for (int j = 0; j < num[i].length(); j++) {
				if (num[i].charAt(j) == 'O') {
					score += ++ox;

				} else {
					ox = 0;
				}
			}

			bw.write(String.valueOf(score).toString());
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();

		// TODO Auto-generated method stub

	}

	private static void distinct() {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			int k = 0;

			for (int j = 0; j < i; j++) {

				if (arr[i] % 42 == arr[j] % 42) {
					k++;
				}

			}
			cnt = k > 0 ? cnt : ++cnt; // 이전에 같은 값이 없으면 1을 더하고 아니면 안 더한다. ->

		}

		System.out.println(cnt);

		// HashSet에 넣을 수도 있음 이건 중복값은 저장 안하니까 그리고 사이즈를 출력하면 되네

	}

	private static void onetonine() {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		String[] arr = String.valueOf(a * b * c).toString().split("");

//		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < 10; i++) {
			int cnt = 0;

			for (int j = 0; j < arr.length; j++) {

				if (Integer.parseInt(arr[j]) == i) {
					cnt++;
				}
			}

			System.out.println(cnt);

		}

	}

	private static void maxindex() {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int result = 0;

		for (int i = 0; i < arr.length; i++) {

			result = Math.max(arr[i], result);

		}

		System.out.println(result);

		for (int i = 0; i < arr.length; i++) {

			if (result == arr[i]) {
				System.out.println(i + 1);
			}

		}

		////////////////////// 다른 방법
//		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//	        int maxIndex = 0;
//	        int maxNumber = 0;
//	        int number = 0;
//
//	        for(int index = 1 ; index < 10 ; ++index){
//	            number = Integer.parseInt(br.readLine());
//	            
//	            if(maxNumber < number){
//	                maxIndex = index;
//	                maxNumber = number;
//	            }
//	        }
//
//	        System.out.println(maxNumber);
//	        System.out.println(maxIndex);

	}

	private static void minmax() {
		Scanner sc = new Scanner(System.in);

		int index = sc.nextInt();
		sc.nextLine();

		int[] arr = new int[index];

		String[] srr = sc.nextLine().split(" ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(srr[i]);
		}

		Arrays.sort(arr);

		System.out.println(arr[0] + " " + arr[index - 1]);

	}

}
