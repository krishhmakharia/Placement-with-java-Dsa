package Revision2026;

public class BackTracking {
    public static void printArr(int[] arr){
        for(int a:arr){
            System.out.print(a+"\t");
        }
    }
    public static void changeArr(int[] arr, int i, int value){
        //Base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //kaam
        arr[i] = value;
        changeArr(arr,i+1,value+1);//function call step
        arr[i] = arr[i] - 2;//Backtrack step
    }
    public static void findSubset(String s, String ans, int idx ){
        //Base case
        if(idx == s.length()){
            System.out.println(ans);
            return;
        }
        //Choice 1: Yes
        findSubset(s,ans + s.charAt(idx),idx+1);
        //Choice 2: No
        findSubset(s,ans,idx+1);
    }
    public static void nQueen(char[][] board, int row){
        if(row==board.length){
            printBoard(board);
            return;
        }

        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueen(board,row+1);
                board[row][j]='X';
            }
        }

    }
    public static void printBoard(char[][] board){
        System.out.println("------Chess Board------");
        for (int i=0; i<board.length; i++){
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char[][] board, int row, int col){
        //Vertically
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Left Diagonal
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //Right Diagonal
        for(int i=row-1,j=col+1; i>=0 && j< board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
//        int[] arr = new int[10];
//        changeArr(arr,0,1);
//        System.out.println();
//        printArr(arr);

//        findSubset("abc","",0);
        int n = 4;
        char[][] board = new char[n][n];
        nQueen(board,0);

    }
}
