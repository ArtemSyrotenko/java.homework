/**
 * @author Artem Syrotenko
 * @version 1.0
 */

public class Swaper{

	/**
	 * Static method for swapping rows
	 * @param maxRow - greatest number row index
	 * @param matrix - double number matrix
	 * @return matrix
	 */ 
	public static double[][] swapRows(int maxRow, double[][] matrix){
		double temp;

		while(maxRow != 0){
			for (int i = 0; i < matrix[i].length; i++){
				temp = matrix[maxRow - 1][i];
				matrix[maxRow - 1][i] = matrix[maxRow][i];
				matrix[maxRow][i] = temp;
			}
			maxRow--;
		}
		return matrix;
	}

	/**
	 * Static method for swapping columns
	 * @param maxCol - greatest number column index
	 * @param matrix - double number matrix
	 * @return matrix
	 */ 
	public static double[][] swapColumns(int maxCol, double[][] matrix){
		double temp;

		while(maxCol != 0){
			for (int i = 0; i < matrix.length; i++){
				temp = matrix[i][maxCol - 1];
				matrix[i][maxCol - 1] = matrix[i][maxCol];
				matrix[i][maxCol] = temp;
			}
			maxCol--;
		}
		return matrix;
	}
}