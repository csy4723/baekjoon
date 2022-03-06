package backjoon.run;

public class 함수 {

	public void arr() {

		int arr[] = new int[3];

		sum(arr);

	}

	private long sum(int[] arr) {

		long result = 0;

		for (int i = 0; i < arr.length; i++) {

			result += arr[i];

		}

		return result;
		// TODO Auto-generated method stub

	}
}
