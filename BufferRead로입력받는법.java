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

}
