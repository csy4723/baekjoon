package backjoon.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자열 {

	public static void main(String[] args) throws IOException {
		breakEvenPoing();

	}

	private static void breakEvenPoing() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 String[] arr = br.readLine().split(" ");
		 
		 int a = Integer.parseInt(arr[0]);
		 int b = Integer.parseInt(arr[1]);
		 int c = Integer.parseInt(arr[2]);
		 
		 boolean bep = false;
		 
		
		 
		 for(int i = 1; ;i++) {
			 
			 bep = a+(b*i) <= c*i?true: false;
			 
			 if(bep) {
				  System.out.println(i);
				 break;
				 
			 }
			 
			 
		 }
		 
		
		
		
		
		
	
		
	}

}
