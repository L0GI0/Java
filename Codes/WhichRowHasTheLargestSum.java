
public class WhichRowHasTheLargestSum {
	public static void main(String[] args) {
		int maxRow = 0;
		int indexOfMaxRow = 0;
		int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		//Get sum of the first row in maxRow
		for (int column = 0; column < matrix[0].length; column++) {
			maxRow += matrix[0][column];
		}
		for (int row = 0; row < matrix.length; row++)
		{
			int totalOfThisRow = 0;
		for (int column = 0; column < matrix[row].length; column++) {
			totalOfThisRow += matrix[row][column];
			if (totalOfThisRow > maxRow) {
				maxRow = totalOfThisRow;
			}
		}
		}
	}
}
