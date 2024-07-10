package transpose;

public class Division
{
    public static int[][] divide(int[][] first, int[][] second)
    {
        int row = first.length;
        int column = first[0].length;
        int[][] result = new int[row][column];

        System.out.println("\nDivision of Matrices:\n");
        for (int r = 0; r < row; r++)
        {
            for (int c = 0; c < column; c++)
            {
                if (second[r][c] != 0)
                {
                    result[r][c] = first[r][c] / second[r][c];
                }
                else
                {
                    result[r][c] = 0;
                }
            }
        }

        Print2dArray.print2dArray(result);
        return result;
    }
}
