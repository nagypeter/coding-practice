package codility.training.lesson4;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {

		int[] A = { 3, 4, 4, 6, 1, 4, 4 };
		int N = 5;

		MaxCounters mc = new MaxCounters();

		System.out.println(Arrays.toString(mc.solution(N, A)));

	}

	public int[] solution(int N, int[] A) {

		int[] solution = new int[N];
		int iMax = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] > N) {

				for (int j = 0; j < solution.length; j++) {
					solution[j] = iMax;
				}
			} else if (A[i] >= 1 && A[i] <= N) {
				solution[A[i] - 1] = solution[A[i] - 1] + 1;
				if (solution[A[i] - 1] > iMax) {
					iMax = solution[A[i] - 1];
				}
			}
			System.out.println(Arrays.toString(solution));
		}

		return solution;
	}

}
