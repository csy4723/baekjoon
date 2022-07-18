package program;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		
		
	String[] arr = {"Jane", "Kim"};
	
	System.out.println(solution(arr));
	
	
	}
	
	
	 public static String solution(String[] seoul) {
	        String answer = "";
	        
	        int a = Arrays.asList(seoul).indexOf("Kim");
	        answer = "김서방은 "+a+"에 있다";
	        
	        return answer;
	    
	}

	   
}
