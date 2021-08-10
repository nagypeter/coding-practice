package codility.training.lesson6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class Distinct {

	public int solution(int[] A) {
		
		HashSet<Integer> distinctValues = new HashSet<Integer>();
		
		for (int i = 0; i < A.length; i++) {
			distinctValues.add(A[i]);
		}
		
		return distinctValues.size();
	}
	

	@Test
	public void testSolution() {

		int[] A = { 2, 1, 2, 2, 3, 1 };
		int result = 3;

		Distinct distinct = new Distinct();
		assertEquals(result, distinct.solution(A));
	}

}
