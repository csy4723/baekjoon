package program;

import java.util.Arrays;

public class map {

	public static void main(String[] args) {
		
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		
		String[]arr = solution(n, arr1, arr2);
		System.out.println(Arrays.toString(arr));
		

	}

	private static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
        String result = "";
        
        for(int i = 0; i<n; i++){
           int num1 = arr1[i]|arr2[i];
           System.out.println(num1);
           String bnum = Integer.toBinaryString(num1);
           System.out.println(bnum);
           for(int j = 0; j<n; j++) {
        	   
        	   if(j<bnum.length()) {
        	   if(bnum.charAt(j) == '1') {
        		   result +="#";
        	   }else {
        		   result +=" ";
        	   }
        	   }else {
        		   result =" "+result;
        	   }
        	   
           }
           
           
           System.out.println(result);
           
           answer[i] = result;
           result = "";
           
        }
  
        
        
        return answer;
	}

}
