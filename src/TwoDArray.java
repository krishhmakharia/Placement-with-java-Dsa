import java.util.Scanner;

public class TwoDArray {
    public static void search(int [][] matrix, int key){
        int flag=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at ( "+i+" , "+j+" )");
                    flag=1;
                }
            }
        }
        if(flag==0){
            System.out.println("NOT Found");
        }
    }
    public static int[][] inputMatrix(int row, int col){
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int [row][col];
        for(int i = 0; i< matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print("("+i+","+j+" ) :");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix){
        for(int i = 0; i< matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static int max(int [][] matrix){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                max = Math.max(max,matrix[i][j]);
            }
        }
        return max;
    }
    public static void spiralMatrix(int[][] matrix){
        int start_row = 0;
        int start_col= 0;
        int end_row = matrix.length-1;
        int end_col = matrix[0].length-1;
        while(start_row<=end_row && start_col<=end_col){
            //top
            for(int j = start_col; j<=end_col; j++){
                System.out.print(matrix[start_row][j]+"\t");
            }
            //right
            for(int i=start_row+1; i<=end_row; i++){
                System.out.print(matrix[i][end_col]+"\t");
            }
            //bottom
            for (int j=end_col-1; j>=start_col; j--){
                if(start_col==end_col){// odd rows
                    break;
                }
                System.out.print(matrix[end_row][j]+"\t");
            }
            //left
            for(int i=end_row-1; i>=start_row+1;i--){
                if(start_row==end_row){
                    break;
                }
                System.out.print(matrix[i][start_col]+"\t");
            }
            //for iteration
            start_row++;
            end_row--;
            start_col++;
            end_col--;
        }
    }
    public static void main(String [] args){
//        int[][] matrix = inputMatrix(2,2);
//        printMatrix(matrix);
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        printMatrix(matrix);
        spiralMatrix(matrix);



    }
}
