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
    public static void diagonalSum(int[][] matrix) {
        int sum = 0;
        // there is big issue with this code that is high time complexity O(n^2)
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == j) {//primary diagonal
//                    sum += matrix[i][j];
//                }
//                if (i + j == matrix.length - 1) {
//                    sum += matrix[i][j];
//                }
//            }
//        }
        //Approach 2
        for (int i=0; i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(" Diagonal Sum : "+sum);
    }
    public static boolean stairCaseSearch(int[][] matrix, int key){
        int row = 0;
        int col = matrix[0].length-1;
        while(col>=0 && row < matrix.length){
            if(matrix[row][col]==key){
                System.out.println("Found at ("+row+","+col+")");
                return true;
            }else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String [] args){
//        int[][] matrix = inputMatrix(2,2);
//        printMatrix(matrix);
//        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        printMatrix(matrix);
//        spiralMatrix(matrix);
//            diagonalSum(matrix);

        //Searching in sorted Matrix Row wise + Col wise
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int key=100;
        stairCaseSearch(matrix,key);
//        printMatrix(matrix);


    }
}
