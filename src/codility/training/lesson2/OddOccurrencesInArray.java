package codility.training.lesson2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {

	public static void main(String[] args) {

		OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

		// int[] A = { 9, 3, 9, 3, 9, 7, 9 };

		int[] A = { 9, 3, 9, 3, 9, 7, 9, 7, 9, 9, 4 };

		System.out.println(oddOccurrencesInArray.solution(A));
		System.out.println(oddOccurrencesInArray.solution2(A));
		System.out.println(oddOccurrencesInArray.solution3(A));

	}

	public int solution(int[] A) {

		List<Integer> valueList = Arrays.stream(A).boxed().collect(Collectors.toList());

		Collections.sort(valueList);

		int countSame = 1;
		int iPrevious = Integer.MIN_VALUE;
		for (Integer intCurrent : valueList) {
			if (iPrevious == Integer.MIN_VALUE) {
				iPrevious = intCurrent;
			} else {
				if (iPrevious == intCurrent.intValue()) {
					countSame++;
				} else if (countSame % 2 != 0) {
					break;
				} else {
					iPrevious = intCurrent.intValue();
					countSame = 1;
				}
			}
		}

		return iPrevious;
	}

	public int solution2(int[] A) {
		int iOddNumber = Integer.MIN_VALUE;

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {

			Integer intCount = hashMap.get(Integer.valueOf(A[i]));
			if (intCount == null) {
				intCount = Integer.valueOf(1);
			} else {
				intCount++;
			}
			hashMap.put(Integer.valueOf(A[i]), intCount);
		}
		for (Iterator<Integer> iterator = hashMap.keySet().iterator(); iterator.hasNext();) {
			Integer key = iterator.next();
			if (hashMap.get(key).intValue() % 2 != 0) {
				iOddNumber = key.intValue();
				break;
			}
		}

		return iOddNumber;
	}
	
    public int solution3(int[] A) {

        if(A.length == 0)
            return 0;
        
        int iUnpaired;
        iUnpaired = A[0]; 
        
        for(int i=1; i< A.length; i++){    
        	iUnpaired = iUnpaired ^ A[i];   
        }
        
        return iUnpaired; 
    }

}
