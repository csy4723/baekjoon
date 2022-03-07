package backjoon.run.함수;

import java.io.IOException;
import java.util.Scanner;

public class 한수내방법 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		automatic_sequence(num);
		
		
		
		
	}

	private static void automatic_sequence(int num) {
		
		
		int cnt = 0;
		for (int i = 1; i <= num; i++) {

			if (i < 100) {
				cnt++;
			} else {
				
				int j = i;
				boolean jcnt = false;

				while (j >= 100) {

					int hun = (j / 100) % 10;
					int ten = (j / 10) % 10;
					int one = j % 10;

					if ((hun - ten) == (ten - one)) {
						jcnt = true;
						
					}else {
						
						jcnt = false;
						break;
					}

					j /= 10;
					
				}
				
				if(jcnt) {
					cnt++;
				}
				

			}

		}
		
		System.out.println(cnt);
		
		
		
		
		
	}

}