package codility.training.lesson1;

public class BinaryGap {

	public static void main(String[] args) {

		int N = Integer.parseInt("110000110000001", 2);
		System.out.println(Integer.toBinaryString(N));
		System.out.println(solution(N));

	}

	public static int solution(int N) {
		int iLongestBinarygap = 0;

		String sBinaryString = Integer.toBinaryString(N);
		int iTempBinaryGap = 0;
		for (int i = 0; i < sBinaryString.length(); i++) {

			if (iLongestBinarygap > sBinaryString.length() - i && iTempBinaryGap < iLongestBinarygap) {
				break;
			}

			if (sBinaryString.charAt(i) == '1') {
				if (iLongestBinarygap < iTempBinaryGap) {
					iLongestBinarygap = iTempBinaryGap;
				}
				iTempBinaryGap = 0;
			} else {
				iTempBinaryGap++;
			}

		}

		return iLongestBinarygap;

	}

}
