package codility.training.lesson5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class GenomicRangeQuery {

	public static void main(String[] args) {

	}

	public int[] solution(String S, int[] P, int[] Q) {

		int[] arrayResult = new int[P.length];

		for (int i = 0; i < P.length; i++) {
			if (S.substring(P[i], Q[i]).contains("A")) {
				arrayResult[i] = 1;
			} else if (S.substring(P[i], Q[i]).contains("C")) {
				arrayResult[i] = 2;
			} else if (S.substring(P[i], Q[i]).contains("G")) {
				arrayResult[i] = 3;
			} else {
				arrayResult[i] = 4;
			}
		}

		return arrayResult;

	}

	@Test
	public void testSolution() {

		GenomicRangeQuery mats = new GenomicRangeQuery();

		String S = "CAGCCTA";
		int[] P = { 2, 5, 0 };
		int[] Q = { 4, 5, 6 };
		int[] result = { 2, 4, 1 };

		assertArrayEquals(result, mats.solution(S, P, Q));
	}
	
	@Test
	public void testSolution2() {

		GenomicRangeQuery mats = new GenomicRangeQuery();

		String S = "CAGCCTA";
		int[] P = { 2, 5, 0 };
		int[] Q = { 4, 5, 6 };
		int[] result = { 2, 4, 1 };

		assertArrayEquals(result, mats.solution(S, P, Q));
	}	

	public int[] solution2(String S, int[] P, int[] Q) {

		int[] result = new int[P.length];

		int A[] = new int[S.length() + 1];
		int C[] = new int[S.length() + 1];
		int G[] = new int[S.length() + 1];
		int T[] = new int[S.length() + 1];

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'A') {
				A[i + 1] = A[i] + 1;
				C[i + 1] = C[i];
				G[i + 1] = G[i];
				T[i + 1] = T[i];
			} else if (S.charAt(i) == 'C') {
				A[i + 1] = A[i];
				C[i + 1] = C[i] + 1;
				G[i + 1] = G[i];
				T[i + 1] = T[i];
			} else if (S.charAt(i) == 'G') {
				A[i + 1] = A[i];
				C[i + 1] = C[i];
				G[i + 1] = G[i] + 1;
				T[i + 1] = T[i];
			} else if (S.charAt(i) == 'T') {
				A[i + 1] = A[i];
				C[i + 1] = C[i];
				G[i + 1] = G[i];
				T[i + 1] = T[i] + 1;
			}
		}

		int num_of_query = P.length;
		for (int i = 0; i < num_of_query; i++) {
			int a = A[Q[i] + 1] - A[P[i]];
			int c = C[Q[i] + 1] - C[P[i]];
			int g = G[Q[i] + 1] - G[P[i]];

			if (a > 0) {
				result[i] = 1;
			} else if (c > 0) {
				result[i] = 2;
			} else if (g > 0) {
				result[i] = 3;
			} else {
				result[i] = 4;
			}
		}

		return result;
	}

}
