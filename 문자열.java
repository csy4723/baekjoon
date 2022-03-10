package backjoon.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 문자열 {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		ASCIICode();
//		sum();
//		lowercaseASCIIcode();
//		repeatstr();
//		maxcharat();
		maxcharatOther();

	}

	private static void maxcharatOther() throws IOException {
		int str = System.in.read(); // 문자열만 입력 받기에 간소화 가능 : 출력부분에서만 캐스팅

		int[] arr = new int[26]; // 알파벳의 개수 26개

		while (str >= 'A') {
			if (str <= 'Z') { // 대문자 범위
				arr[str - 'A']++;// 알파벳 해당 인덱스의 값을 +1해준다 ('C'일 경우 65를 빼서 arr[2]++ 해주는 것)
			} else { // 소문자 범위
				arr[str - 'a']++;
			}
			str = System.in.read();// 다시 입력
		}

		int max = 0;
		int ch = '?' - 'A';//63-65

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];// 개수가 더 많으면 max에 담아줌
				ch = i;//ch엔 인덱스 담아줌
			} else if (arr[i] == max) {
				ch = '?' - 'A';// 같으면 ch에 2를 담아줌
			}
		}

		System.out.print((char) (ch + 'A'));// 인덱스 +65로 해당 알파벳의 아스키코드를 받을 수 있다. 

	}

	private static void maxcharat() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine().toUpperCase();
		int result = 0;
		char str = 0;

		for (int i = 0; i < s.length(); i++) {

			int cnt = 0;

			if (s.indexOf(s.charAt(i)) != i) {// 해당 알파벳의 첫번째가 아니면

				continue;

			} else {

				cnt++;// 첫번째 글자에 1 더해준다.

				for (int j = i + 1; j < s.length(); j++) {

					if (s.charAt(i) == s.charAt(j)) {
						cnt++;
					}

				}

				if (result < cnt) {

					result = cnt;
					str = s.charAt(i);

				} else if (result == cnt) {

					str = '?';

				}

			}

		}

		System.out.println(str);

	}

	private static void repeatstr() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {

			String[] arr = br.readLine().split(" ");

			int num2 = Integer.parseInt(arr[0]);

			String str = arr[1];
			String result = "";

			for (int j = 0; j < str.length(); j++) {

				for (int k = 1; k <= num2; k++) {

					result += str.charAt(j);

				}

			}

			System.out.println(result);

		}

		// TODO Auto-generated method stub

	}

	private static void lowercaseASCIIcode() {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		for (char a = 'a'; a <= 'z'; a++) {

			System.out.print(S.indexOf(a) + " ");

		}

	}

	private static void sum() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String[] num2 = sc.next().split("");
		int sum = 0;

		for (int i = 0; i < num; i++) {

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
