import java.util.*;
public class MatrixAdvancedOperations
{
    // Method to create random matrix
    public static double[][] createRandomMatrix(int rows, int cols) 
	{
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                matrix[i][j] = rand.nextInt(9) + 1; 
            }
        }
        return matrix;
    }

    // Method to find transpose
    public static double[][] transpose(double[][] matrix)
	{
        double[][] trans = new double[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
		{
            for (int j = 0; j < matrix[0].length; j++)
			{
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] m)
	{
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m)
	{
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) 
	{
        double det = determinant2x2(m);
        if (det == 0) return null;

        return new double[][]
		{
            { m[1][1] / det, -m[0][1] / det },
            { -m[1][0] / det, m[0][0] / det }
        };
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) 
	{
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    // Method to display matrix
    public static void displayMatrix(double[][] matrix) 
	{
        if (matrix == null)
		{
            System.out.println("Inverse does not exist (Determinant = 0)");
            return;
        }
        for (int i = 0; i < matrix.length; i++) 
		{
            for (int j = 0; j < matrix[0].length; j++)
			{
                System.out.printf("%8.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
	{

        double[][] matrix = createRandomMatrix(3, 3);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        double det = determinant3x3(matrix);
        System.out.println("\nDeterminant: " + det);

        System.out.println("\nInverse:");
        displayMatrix(inverse3x3(matrix));
    }
}

