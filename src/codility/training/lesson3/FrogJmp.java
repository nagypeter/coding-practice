package codility.training.lesson3;

public class FrogJmp {

	public static void main(String[] args) {
		
		
		int X = 10;
		int Y = 85;
		int D = 30;
		FrogJmp fj = new FrogJmp();
		System.out.println(fj.solution(X, Y, D));

	}
	
	
	public int solution(int X, int Y, int D) {
		int iResult = 0;
		
		if (Y - X < 0) {
			throw new RuntimeException("Frog is going to the wrong direction");
		}
		
		iResult = (Y - X) / D;
		
		if ((Y - X) % D != 0) {
			iResult++;
		}
		
		return iResult;
		
	}

}
