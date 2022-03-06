package backjoon.run;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int ex = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 1; i <= 10000; i++) {

			arr.add(i);

		}

		for (int n = 1; n < 99999; n++) {

			int result = d(n);

			for (int i = 0; i < arr.size(); i++) {

				if (arr.get(i) == result) {

					arr.remove(i);

				}

			}

		}

		for (Integer a : arr) {

			bw.write(String.valueOf(a).toString());
			bw.newLine();
		}

		bw.close();

	}

	private static int d(int n) {

		int result = n + (n / 10000) + ((n / 1000) % 10) + ((n / 100) % 10) + ((n / 10) % 10) + (n % 10);

		return result;

	}

}
