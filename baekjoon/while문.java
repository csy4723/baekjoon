package backjoon.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class while문 {

	public static void main(String[] args) throws IOException {

		aplusb();
		aplusbuntilnoinput();
		pluscycle();

	}

	private static void pluscycle() {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();// 처음 숫자 보관용

		int a = num;

		int cnt = 0;

		do {

			if (a < 10) {

				a = Integer.parseInt("" + a % 10 + a % 10);

				cnt++;
			} else {

				int b = a / 10 + a % 10;

				a = Integer.parseInt("" + a % 10 + b % 10);

				cnt++;
			}

		} while (a != num);

		System.out.println(cnt);
		
		
		//다른 방법
		/* int number = Integer.parseInt(br.readLine());
        int count = 0;
        int result = number;
        do {
            result = ((result % 10) * 10) + (((result / 10) + (result % 10)) % 10);
            count++;
        } while (number != result);

        System.out.println(count);
		 * 
		 * */

	}

	private static void aplusbuntilnoinput() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";

		while ((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			System.out.println(a + b);

		}

	}

	private static void aplusb() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0) {
				break;
			} else {

				System.out.println(a + b);
			}

		}

	}

}
