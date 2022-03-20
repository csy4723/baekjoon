package backjoon.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자열 {

	public static void main(String[] args) throws IOException {
		breakEvenPoing();
		beehive();

	}

	private static void beehive() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		int gap = 0;
		int levelnum = 1;// 그 레벨에 들어가는 최대 숫자
		int level = 1;

		if (num == 1) {
			System.out.println(level);// 레벨1 출력
		}else {

		level++;
		gap += 6;// 6
		levelnum += gap;// 7
		// 레벨2

		for (;;) {

			if (num > levelnum) {
				gap += 6;// 12
				levelnum += gap;
				level++;

			} else if (num <= levelnum) {
				break;
			}

		}

		System.out.println(level);

	}
		
	}

	private static void breakEvenPoing() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = br.readLine().split(" ");

		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);

		boolean bep = false;

		/*
		 * a+(b*i) = c*i >> 총 비용과 총 수익이 같아지는 지점. (이익이 같아지는 지점은 아니다)
		 * 
		 * a = (c*i)-(b*i) a = (c-b)*i i = a/(c-b) >>기초수학임
		 * 
		 * 여기 i에 +1을 해주면 손익분기점이 나온다.
		 * 
		 * **문제는 손익이 나지 않는 경우 손익이 나지 않는다 = 적자이다.(-)
		 * 
		 * a/(c-b)는 이익이 나는 지점의 수식화로 이의 전제조건은 a/(c-b)+1>0이다.(0보다 크다는 의미는 이익이 발생했다는 뜻) 반대로
		 * 말하면 저 수가 음수가 되면 이익이 발생할 일이 없다는 뜻이다. a,b,c는 모두 자연수이다. a는 불변 비용으로 변하지 않고 c-b가
		 * 음수이면 a/(c-b)가 음수로 적자가 되겠다.
		 * 
		 * => c-b<0 일경우 -1 반환 또 c-b가 0일 경우 0으로 a를 나눌 수 없기 때문에 c-b<= 0으로 0도 포함
		 * 
		 * 
		 * 쉽게 장사하는 것처럼 생각하면 매달 나가는 돈 + 재료비가 있다. 가격이 재료비보다 비싸기만 하면 언젠가는 매달 나가는 돈도 커버하고
		 * 수익이 나는 지점이 있다. 하지만 재료비가 더 비싸면 적자이기만 하고 수익이 나지 않는다.
		 * 
		 * 재료비와 가격이 같은 경우도 그렇다.
		 */

		if ((c - b) <= 0) {
			System.out.println(-1);
		} else {
			System.out.println((a / (c - b)) + 1);

		}

	}

}
