package Revision2026;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayRevision{
    public static boolean search(int[][] matrix, int key){
        for(int row = 0; row<matrix.length; row++){
            for(int col =0; col<matrix[row].length; col++){
                if(matrix[row][col]==key){
                    System.out.println("Found at index ("+row+","+col+")");
                    return true;
                }
            }

        }
        System.out.println("Key Not Found!");
        return false;
    }

    public static ArrayList<Integer> maxMin(int[][] matrix){
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        for(int row = 0; row<matrix.length; row++){
            for(int col =0; col<matrix[row].length; col++){
                max = max<matrix[row][col]?matrix[row][col]:max;
                min = min>matrix[row][col]?matrix[row][col]:min;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(min);
        list.add(max);
        return list;
    }

    public static void printSprial(int[][] matrix){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //Top
            for(int j = startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //Right
            for(int j = startRow+1; j<=endRow; j++){
                System.out.print(matrix[j][endCol]+" ");
            }
            //Bottom
            for(int j =endCol-1; j>=startCol; j--){

                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //Left
            for(int j =endRow-1; j>=startRow+1; j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[j][startCol]+" ");
            }

            System.out.println();
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

    }
    public static int diagonalSum(int[][] matrix){
        int sum = 0;
        //Brute force
        /*
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                //Primary Diagonal
                if(i==j)
                    sum+=matrix[i][j];
                else if (i+j==matrix.length-1) {
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;

         */
        //Better approach
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];//i+j=n-1   j=n-1-i
            }
        }
        return sum;
    }
    public static boolean staircaseSearch(int[][] matrix, int key){
        int col = matrix.length-1;
        int row = 0;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }

            if(key>matrix[row][col]){
                row++;
            }else
                col--;
        }
        System.out.println("Key Not Found!");
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
        int[][] matrix = new int[3][3];
        for(int row = 0; row<matrix.length; row++){
            for(int col =0; col<matrix[row].length; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

        //Print output
        for(int row = 0; row<matrix.length; row++){
            for(int col =0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
        //Search element in 2d
        System.out.println(search(matrix,5));

        //Min Max
        System.out.println(maxMin(matrix));
        */
        //Print Sprial Matrix
        /*
        int[][] matrix1 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        printSprial(matrix1);

         */
        /*
        int[][] matrix2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(diagonalSum(matrix2));

         */
        int[][] matrix3 = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
        staircaseSearch(matrix3,key);
    }
}