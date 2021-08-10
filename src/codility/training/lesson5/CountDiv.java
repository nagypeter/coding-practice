package codility.training.lesson5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountDiv {

	public static void main(String[] args) {

	}

	public int solution(int A, int B, int K) {

		int iCount = 0;
		for (int i = A - 1; i < B + 1; i++) {
			if (i % K == 0) {
				iCount++;
			}
		}
		return iCount;

	}

	@Test
	public void testSolution() {
		CountDiv cd = new CountDiv();
		int A = 6;
		int B = 11;
		int K = 2;
		int iResult = 3;

		assertEquals(iResult, cd.solution(A, B, K));

	}

	@Test
	public void testSolution2() {
		CountDiv cd = new CountDiv();
		int A = 6;
		int B = 11;
		int K = 2;
		int iResult = 3;

		assertEquals(iResult, cd.solution2(A, B, K));

	}

	public int solution2(int A, int B, int K) {

		int iTop = (int) Math.floor(B / K);
		int iBottom = (int) Math.floor(A / K);

		if (A % K == 0) {
			iBottom--;
		}

		return iTop - iBottom;

	}

}
