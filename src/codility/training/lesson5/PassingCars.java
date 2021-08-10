package codility.training.lesson5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PassingCars {

	public static void main(String[] args) {

	}

	public int solution(int[] A) {

		int iCurrentCar = -1;
		int iPrevCar = -1;
		int iSum = 0;
		int iTempSum = 0;

		for (int i = A.length - 1; i > -1; i--) {
			iCurrentCar = A[i];
			if (iPrevCar == -1 ) {
				iTempSum = A[i];
			} else if (iCurrentCar == 1) {
				iTempSum++;
			} else {
				iSum = iSum + iTempSum;
			}
			iPrevCar = iCurrentCar;
			if (iSum > 1000000000) {
				return -1;
			}
		}
		System.out.println(iSum);
		return iSum;
	}

	@Test
	public void testSolution() {
		PassingCars pc = new PassingCars();
		int[] A = { 0, 1, 0, 1, 1 };
		assertEquals(5, pc.solution(A));
	}
	
	@Test
	public void testSolution2() {
		PassingCars pc = new PassingCars();
		int[] B = { 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1 };
		assertEquals(20, pc.solution(B));
	}

}
