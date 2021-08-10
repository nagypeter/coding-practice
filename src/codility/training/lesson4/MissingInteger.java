package codility.training.lesson4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MissingInteger {

	public static void main(String[] args) {

		int[] A = { -1, -3, 0, 1, 2, 3, 5, 7 };
		//int[] A = { -1, -3 };

		MissingInteger mi = new MissingInteger();
		System.out.println(mi.solution(A));

	}

	public int solution(int[] A) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				set.add(A[i]);
			}
		}

		int i = 1;
		while (true) {
			if (!set.contains(i)) {
				return i;
			}
			i++;
		}

	}
	
    @Test
    @DisplayName("Test1")
    void demoTestMethod() {
    	int[] A = { -1, -3, 0, 1, 2, 3, 5, 7 };
    	MissingInteger mi = new MissingInteger();
		assertEquals(4, mi.solution(A));
    }

}
