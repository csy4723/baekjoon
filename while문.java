package backjoon.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class while문 {

	public static void main(String[] args) throws IOException {
		
		
		aplusb();
		aplusbuntilnoinput();

	}

	private static void aplusbuntilnoinput() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			
				
				System.out.println(a+b);
			
			
		}
		
	}

	private static void aplusb() throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) {
				break;
			}else {
				
				System.out.println(a+b);
			}
			
		}
		
	}

}
