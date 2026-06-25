package Revision2026.April1;

public class Recursion {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static int nFibonacchi(int n){
        if(n==1 || n==0){
            return n;
        }
        int result = nFibonacchi(n-1) + nFibonacchi(n-2);
        return result;
    }
    public static boolean isSort(int[] arr, int i){
        if(i==arr.length-1)
            return true;
        int curr = arr[i];
        if(curr > arr[i+1]){
            return false;
        }
        return isSort(arr,i+1);
    }
    public static int findFirst(int[] arr, int idx, int key){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
        return findFirst(arr,idx+1,key);
    }
    public static int findLast(int[] arr, int idx, int key){
        if(idx==0){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
        return findFirst(arr,idx-1,key);
    }
    public static int pow(int x,int n){
        if(n==1|| n==0){
            return 1;
        }
        int half = pow(x,n/2);
        int half_sq = half*half;

        if(n%2!=0){
            half_sq = x * half_sq;
        }
        return 2*half_sq;
    }
    public static void viewBoard(char[][] board){
        System.out.println("-----Chess Board-----");
        for (int i=0; i<board.length; i++){
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }
public static void nQueen(char[][] board, int row){
        if(row == board.length){
            viewBoard(board);
            return;
        }
    for (int j = 0; j < board.length ; j++) {
        if(isSafe(board,row,j)){
            board[row][j]='Q';
            nQueen(board,row+1);
            board[row][j]='X';
        }
    }
}
public static boolean isSafe(char[][] board, int row, int col){
        //vertically
    for(int i=row-1; i>=0; i--){
        if(board[i][col]=='Q'){
            return false;
        }
    }
    //left diagonal
    for (int i = row-1,j=col-1; i >=0 && j>=0 ; i--,j--) {
        if(board[i][j]=='Q'){
            return false;
        }
    }
    //right diagonal
    for(int i=row-1, j=col+1; i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
}

    public static void main(String[] args){
        //Factorial
        //System.out.println(fact(2));
        //Sum of n natural numbers
        //System.out.println(sum(5));
        // Nth fibonacchi number
//        System.out.println(nFibonacchi(5));

//        System.out.println(isSort(new int[]{1,2,3,4,5},0));

//        System.out.println(findFirst(new int[]{1,2,3,4,5,66,77,1},0,1));
//        System.out.println(findLast(new int[]{1,2,3,4,5,66,77,1},7,1));

        //nQueen
        int n=4;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j=0; j<board.length;j++){
                board[i][j]='X';
            }
        }
        nQueen(board,0);
    }
}
