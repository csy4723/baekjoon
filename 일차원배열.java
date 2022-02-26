package backjoon.run;

import java.util.Arrays;
import java.util.Scanner;

public class 일차원배열 {

	public static void main(String[] args) {
		
		minmax();
		maxindex();
		onetonine();

	}

	private static void onetonine() {


		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		
		
		String[] arr = String.valueOf(a*b*c).toString().split("");
		
//		System.out.println(Arrays.toString(arr));

		for(int i = 0 ; i < 10; i++) {
			int cnt = 0;
			
			for(int j = 0; j < arr.length; j++) {
				
				if(Integer.parseInt(arr[j])==i) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
			
		}
		
	
	
	}

	private static void maxindex() {


		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		

		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			result = Math.max(arr[i], result);
			
		}
		
		
		System.out.println(result);
		
		
		
		for(int i = 0; i < arr.length; i++) {
			
			if(result == arr[i]) {
				System.out.println(i+1);
			}
			
		}
		
		
	//////////////////////다른 방법
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
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(srr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " "+arr[index-1]);
	
		
	}

}
