/**
 * @author Artem Syrotenko
 * @version 1.0
 */
public class Writer {

	/**
	 * Static method to print out matrix
	 * @param matrix - double number matrix
	 */ 
	public static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t\t");
				}
				System.out.println();
		}
		System.out.println();
	}	
}