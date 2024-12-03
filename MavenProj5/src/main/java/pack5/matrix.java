package pack5;

public class matrix {

	public static void main(String[] args) {
		int A[][] = {{2,3},{1,2}};
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A.length; j++) {
				System.out.print("\t" + A[i][j]);
			}
			System.out.println();
		}

	}

}
