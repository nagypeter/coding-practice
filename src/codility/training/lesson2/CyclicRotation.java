package codility.training.lesson2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CyclicRotation {

	public static void main(String[] args) {

		int[] A = { 3, 8, 9, 7, 6 };
		int K = 3;

		CyclicRotation cyclicRotation = new CyclicRotation();
		System.out.println(Arrays.toString(cyclicRotation.solution(A, K)));
		System.out.println(Arrays.toString(cyclicRotation.solution2(A, K)));

	}

	public int[] solution(int[] A, int K) {
		int[] arrayResult = null;

		List<Integer> tempList = Arrays.stream(A).boxed().collect(Collectors.toList());

		Collections.rotate(tempList, K);

		arrayResult = tempList.stream().mapToInt(i -> i).toArray();

		return arrayResult;
	}
	
    public int[] solution2(int[] A, int K) {
        
        int[] arrayResult = new int[A.length];
        
        for(int i=0; i< A.length; i++){
            int iNewPosition = (i + K) % A.length;          
            arrayResult[iNewPosition] = A[i]; 
        }
        
        return arrayResult; 
    }

}
