package backjoon.run;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
////////// 다른 방법
		
		boolean[] check = new boolean[10000];//////불리언 배열을 생성한다. 
		
		for(int j=1;j<=10000;j++) { //10000까지 돌려주고 
			int n=d(j);              //d(j)로 던져서 받아주고 
			if(n<=10000)			//만약 리턴된 값이 10000보다 작으면 (10000보다 작은 생성자면)
				check[n-1]=true; // 해당 칸에 들어있는 (인덱스 아님 그래서 1빼주는 거임) 값을 true로 바꿔준다(기본값은 false였음)
		}
		
		StringBuilder buf = new StringBuilder();
		for(int i=0;i<10000;i++) {
			if(!check[i]) // 생성자가 없으면 // 해당 인덱스가 false이면 // 셀프생성자면
				buf.append(i+1).append("\n"); // 스프링버퍼에 넣어서 
		}
		System.out.println(buf.toString()); // 출력
	}
	
	static int d(int n) {
		int sum = n; // 일단 먼저 원본 수인 n을 더해준다. 
		while(n!=0) { // n이 0이 아니면 
			sum+=n%10; // 10으로 나눈 나머지!! -> 항상 10보다 작은수이다.  .. 를 더해준다. 
			n/=10; // 그리고 10으로 나눠줌. 자릿수를 하나씩 줄여준다. 마지막엔 10보다 작은 수를 10으로 나눈 몫이니 0이 된다.
		}
		return sum;
	
		
	}


}
