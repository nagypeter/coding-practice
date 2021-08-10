package codility.training.lesson3;

public class TapeEquilibrium {

	public static void main(String[] args) {
		TapeEquilibrium te = new TapeEquilibrium();

		
		int[] A = { 3, 1, 2, 4, 3 };

		System.out.println(te.solution(A));
		System.out.println(te.solution2(A));

	}

	
	public int solution(int[] A) {
		
		int[]sumFromStart = new int[A.length];
		int[]sumFromEnd = new int[A.length];
		
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < A.length; i++) {
			sum1 = sum1 + A[i];
			sumFromStart[i] = sum1;
			
			sum2 = sum2 + A[A.length - 1 - i];
			sumFromEnd[A.length - 1 - i] = sum2;
		}
		
		int iMinimum = Integer.MAX_VALUE;
		for (int i = 0; i < A.length -1 ; i++) {
			int iDiff = sumFromStart[i] - sumFromEnd[i + 1];
			if (iDiff < 0) {
				iDiff = -iDiff;
			}
			if (iMinimum > iDiff) {
				iMinimum = iDiff;
			}
		}
		return iMinimum;
		
	}
	
	public int solution2(int[] A) {

		
		int iFullSum = 0;
		for (int i = 0; i < A.length; i++) {
			iFullSum = iFullSum + A[i];
		}
		
		int iMinimum = Integer.MAX_VALUE;
		int iFirstPartSum = 0;
		int iLastPartSum = 0;
		int iDiff;
		
		for (int i = 0; i < A.length - 1 ; i++) {
			
			iFirstPartSum = iFirstPartSum + A[i];
			iLastPartSum = iFullSum - iFirstPartSum;
			
			iDiff = iFirstPartSum - iLastPartSum;
			
			if (iDiff < 0) {
				iDiff = -iDiff;
			}
			if (iMinimum > iDiff) {
				iMinimum = iDiff;
			}
		}
		return iMinimum;
		
	}
}
