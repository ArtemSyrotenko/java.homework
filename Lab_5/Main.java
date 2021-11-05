/**
 * @author Artem Syrotenko
 * @version 1.0
 * Main class
*/
public class Main {
	/**
	 * Main method
	 * @param args console params
	 * @throws MyException example of an exception class
	*/
	public static void main(String[] args) throws MyException {
		try{
			/**
			 * Creating matrix of double numbers
			 */
			double[][] matrix =
			{{	0.569,	0.256,		0.0001,	0.00008},
			{	5.268,	2.3684,		0.01,	0.9999999},
			{	5.269,	7.2367,		2568,	2.2154},
			{	123,	25.685,		258,	121.},
			{	1.,		587.999,	14.584,	2.}};

			/**
			 * Initializing indexies of the greatest number
			 */
			int maxRow = 0, maxCol = 0;
			if(maxRow == -1 ) throw new MyException("EXCEPTION TEXT", Integer.toString(maxRow));

			/**
			 * Printing out matrix
			 */ 
			Writer.printMatrix(matrix);

			/**
			 * Looking for the greatest element and saving his indexies
			 */ 
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (matrix[i][j] > matrix[maxRow][maxCol]){
						maxRow = i;
						maxCol = j;
					}
				}
			}

			/**
			 * Swaping rows and columns, so the greatest num is in top-left corner
			 */ 
			matrix = Swaper.swapRows(maxRow, matrix);
			matrix = Swaper.swapColumns(maxCol, matrix);

			/**
			 * Printing out matrix
			 */ 
			Writer.printMatrix(matrix);
		}
		catch(MyException ex){
			System.out.println(ex.getMessage());
		}
	}
}