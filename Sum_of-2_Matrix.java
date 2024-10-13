public class Array {
    public static void main(String[] ar){

       

        int[][] matrix1 = {{1, 2}, {4, 5}, {7, 8}};
        int[][] matrix2 = {{9, 8}, {6, 5}, {3, 2}};
        
        int rows = matrix1.length;
        int columns = 2;
        System.out.println(rows);
        System.out.println(columns);
        
        int[][] result = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Displaying the result matrix
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        }
    }

