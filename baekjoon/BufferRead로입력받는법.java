package backjoon.run;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferRead로입력받는법 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//1. String에 담아서 split 하는 방법
		String s = br.readLine();
		String arr[]=s.split(" ");
		
		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			//2. 토큰으로 받는 방법
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			bw.write((a + b) + "\n");
			bw.newLine();//줄바꿈

		}

		br.close();
		bw.flush();//남아있는 데이터를 모두 출력 시키는 방법. 없으면 출력되지 않음 
		bw.close();

	}
	
	public void Read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		bw.write(a); // 바로바로 출력되는 건 아니다. 성능을 위해 버퍼에 저장했다가 flush되거나 close될때 한꺼번에 출력하기 때문이다
		
		
		String b = br.readLine();
		bw.write(b);
		bw.flush();// close는 스트림을 닫기 때문에 중간에 출력해주고 스트림을 계속 사용하려면 flush를 사용해야 한다. 
		
		bw.write(br.readLine());
		
		bw.close();
		br.close();
		
	}


}
