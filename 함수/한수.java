package backjoon.run;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int cnt = 0;

		for (int i = 1; i <= num; i++) {

			cnt += hansu(i);// 한수가 맞으면 1 반환, 아ㅣ면 0반환

		}

		System.out.println(cnt);
		
		sc.close();

	}

	private static int hansu(int i) {

		int result = 1;

		while (i / 10 != 0) {

			int rst1 = Math.abs((i % 10) - ((i / 10) % 10));

			i /= 10;

			int rst2 = Math.abs((i % 10) - ((i / 10) % 10));

			if (rst1 != rst2) {

				result = 0;
			}

		}

		return result;
	}

}
