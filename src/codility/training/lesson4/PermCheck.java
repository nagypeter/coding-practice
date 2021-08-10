package codility.training.lesson4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PermCheck {

	public static void main(String[] args) {

	}

	public int solution(int[] A) {

		int iMax = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > iMax) {
				iMax = A[i];
			}
		}
		
		return (iMax == A.length ? 1 : 0);
		
	}

	@Test
	public void testSolution() {
		int[] A = {1,2,3,4};
		int iResult = 1;

		PermCheck pc = new PermCheck();
		assertEquals(iResult, pc.solution(A));
	}
	
	@Test
	public void testSolution2() {
		int[] A = {1,2,4};
		int iResult = 0;

		PermCheck pc = new PermCheck();
		assertEquals(iResult, pc.solution(A));
	}

}
