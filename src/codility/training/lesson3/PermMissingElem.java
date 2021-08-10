package codility.training.lesson3;

public class PermMissingElem {

	public static void main(String[] args) {
		
		PermMissingElem pme = new PermMissingElem();
		
		//int[] A = {2, 3, 1, 5};
		
		int[] A = {2, 3, 1, 5, 4, 6, 8, 9, 10};
		
		System.out.println(pme.solution(A));
		
		

	}
	
	public int solution(int[] A) {
		
        long lMissingNum = (A.length + 2) * (A.length + 1) / 2;
        
        for(int i=0; i<A.length; i++){
        	lMissingNum = lMissingNum - A[i]; 
        }
        
        return (int)lMissingNum;
		
	}

}
