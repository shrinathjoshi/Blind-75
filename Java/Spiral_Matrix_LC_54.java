import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix_LC_54 {
	public static List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> result = new ArrayList<Integer>();
		int m = matrix.length;
		int n = matrix[0].length;
		int rowStart = 0;
		int rowEnd = m - 1;
		int columnStart = 0;
		int columnEnd = n - 1;

		int index = 0;

		while (index < m * n) {

			for (int i = columnStart; i <= columnEnd && index < m * n; i++) {
				result.add(matrix[rowStart][i]);
				index++;
			}
			rowStart++;

			for (int i = rowStart; i <= rowEnd && index < m * n; i++) {
				result.add(matrix[i][columnEnd]);
				index++;
			}
			columnEnd--;

			for (int i = columnEnd; i >= columnStart && index < m * n; i--) {
				result.add(matrix[rowEnd][i]);
				index++;
			}
			rowEnd--;

			for (int i = rowEnd; i >= rowStart && index < m * n; i--) {
				result.add(matrix[i][columnStart]);
				index++;
			}
			columnStart++;
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		List<Integer> result = Spiral_Matrix_LC_54.spiralOrder(matrix);

		for (int num : result)
			System.out.println(num + " ");
	}

}
