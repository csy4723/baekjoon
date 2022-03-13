package backjoon.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 문자열 {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		ASCIICode();
//		sum();
//		lowercaseASCIIcode();
//		repeatstr();
//		maxcharat();
		maxcharatOther();
		blankspase();
		blankspase_1();
		blankspase_2();

	}

	private static void blankspase_2() throws IOException {
		//원시 입력 형태로 문자를 하나씩 읽어들이기 
		int count = 0;
		int pre_str = 32;	// 공백을 의미한다.
		int str ;
		
		
		while(true) {
			str = System.in.read();
            
			// 입력받은 문자가 공백일 때,
			if(str == 32) {
				// 이전의 문자가 공백이 아니면
				if(pre_str != 32) count++;
			}
 
			// 입력받은 문자가 개행일때 ('\n')
			else if(str == 10) {
				// 이전의 문자가 공백이 아니면
				if(pre_str != 32) count++;
				break;
			}
			
			pre_str = str;
			
		}
		
		System.out.println(count);
	}
 
		
	

	private static void blankspase_1() {
		//StringTokenizer로 하는 법
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		sc.close();
		
		StringTokenizer st = new StringTokenizer(s, " ");
		
		System.out.println(st.countTokens());//토큰의 개수를 반환
		
	}

	private static void blankspase() throws IOException {
		//앞뒤 공백 없애는 함수 trim(), strip()
		//split() 함수 문제 
		//" "공백이 있는 문자열에 공백을 없앤 결과는 NULL 이 아니라 ""빈 문자열을 반환하게 된다  
		//""빈 문자열을 공백으로 split할 경우 나눌 수 있는 공백이 없기 때문에 자기 자신을 반환한다. 
		//""빈 문자열은 null이 아니고 ""로 인스턴스화 된 문자열이기 때문에 split한 결과를 담은 배열의 길이는 0이 아니라 1이 되게 된다.
		// 때문에 존재하지 않는 문자열이 존재한다고 결과를 도출하게 된다. 주의해야 함 
		
		
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				String[] arr = br.readLine().split(" ");
				
				int cnt = 0;
				
				for(int i = 0; i<arr.length; i++) {
					if(arr[i].isBlank()) {
					
					}else {
						cnt++;
					}
					
					
				}
				
				System.out.println(cnt);
				
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
