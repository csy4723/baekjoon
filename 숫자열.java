package backjoon.run;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 숫자열 {

	public static void main(String[] args) throws IOException {
		breakEvenPoing();
		beehive();
		anotherBeehive();
		findeFraction();
		findeFraction2();
		snail();
		snail_2();
		hotel();

	}

	private static void hotel() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// H층의 W방 갯수, N번째 손님

		int testNum = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testNum; i++) {

			String[] arr = br.readLine().split(" ");
			int H = Integer.parseInt(arr[0]);
			int W = Integer.parseInt(arr[1]);
			int N = Integer.parseInt(arr[2]);

			int w = (int) Math.ceil((double) N / H);
			int h = N - H * (w - 1);

			if (w < 10) {
				bw.write("" + h + "0" + w+"\n");
			} else {
				bw.write("" + h + w+"\n");
			}

		}

		bw.close();

		// TODO Auto-generated method stub
		
	}

	private static void snail_2() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day =1;
        if(A < V) {
          V -= A;
          day +=  V / (A-B);
          if (V % (A-B) != 0) {
              day++;
          }
        }
        System.out.println(day);
		
	}

	private static void snail() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = br.readLine().split(" ");
		double a = Integer.parseInt(arr[0]);
		double b = Integer.parseInt(arr[1]);
		double v = Integer.parseInt(arr[2]);
		double day = 0;// 달팽이가 정상에 올라간날
		//시간초과가 있어서 수학식으로 푸렁야 하낟. 
		
		day = (v-b)/(a-b);
		
		bw.write(String.valueOf((int)(Math.ceil(day))));
		bw.close();
		
	// TODO Auto-generated method stub
		
	}

	private static void findeFraction2() throws NumberFormatException, IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int TC = Integer.parseInt(br.readLine());//몇번재 분수 입력
			int cnt = 1;// 몇번째 분수이기 세기위한 cnt
			int size = 1;
			boolean flag = true; //up
			while(true) {
				if(TC <= size) {//입력된 분수가 1이거나 1보다 작을 때 
					int up = 0; 
					int down = 0;
					if(flag) {//만약 flag가 true면 
						up = cnt;//분수 윗자리. up = 1
						down = 1;//분수 아랫자리 down은 1
						for(int i=size-cnt; i<TC-1; i++) {
							up--;down++;
						}
						System.out.println(up+"/"+down);
					} else {
						up = 1;
						down = cnt;//cnt = 2
						for(int i=size-cnt; i<TC-1; i++) {
							up++;down--;
						}
						System.out.println(up+"/"+down);
					}
					break;
				} else {//입력된 분수가 1보다 클때 
					size += cnt+1;//size는 계속 1씩 커지기 때문에 언젠가는 if문을 타게 된다. 
					cnt++;//
					flag = !flag;//
					
				}}}
		
	

	private static void findeFraction() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		int level = 1; // num이 포함될 레벨

		int cnt = 1; // num과 비교할 count
		String result = "";// 출력할 결과를 담아줌

		// 먼저 num이 포함될 level을 구해준다.
		while (num > cnt) {

			level++;
			cnt += level;

		}
		cnt -= level;

		for (int i = 1; i <= level; i++) {

			if (level % 2 == 0) {
				result = "" + i + "/" + (level - (i - 1));
				cnt++;
				if (cnt == num)
					break;

			} else {

				result = "" + (level - (i - 1) + "/" + i);
				cnt++;
				if (cnt == num)
					break;

			}

		}

		System.out.println(result);

	
		
	}

	private static void anotherBeehive() throws NumberFormatException, IOException {

		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		int count = 1; // 겹 수(최소 루트)
		int range = 2;	// 범위 (최솟값 기준) 
 
		if (N == 1) {
			System.out.print(1);
		}
 
		else {
			while (range <= N) {	// 범위가 N보다 커지기 직전까지 반복 
				range = range + (6 * count);
				count++;
			}
			System.out.print(count);
		}
		// TODO Auto-generated method stub
		
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
