package codility.training.lesson4;

import java.util.HashMap;

public class FrogRiverOne {

	public static void main(String[] args) {

		int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };

		int X = 5;

		FrogRiverOne fro = new FrogRiverOne();
		System.out.println(fro.solution(X, A));

	}

	public int solution(int X, int[] A) {

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(0);

		for (int i = 0; i < A.length; i++) {
			hashMap.put(Integer.valueOf(A[i]), Integer.valueOf(A[i]));

			if (hashMap.size() == X) {
				return i;
			}
		}
		return -1;
	}

}
