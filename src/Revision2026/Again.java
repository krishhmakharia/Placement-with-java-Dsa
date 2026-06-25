package Revision2026;

public class Again {
    public static void printDec(int n){
        if(n==0){
            return;
        }
        printDec(n-1);
        System.out.println(n);

    }
    public static int fab(int n){
        if(n==0 || n==1){
            return n;
        }

        return fab(n-1)+fab(n-2);
    }
    public static boolean isSorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx]>arr[idx+1]){
            return false;
        }

        return isSorted(arr,idx+1);

    }
    public static int pow(int x, int n){
        if (n==1){
            return 1;
        }
         int half = pow(x,n/2);
        int halfSq = half * half;

        if(n%2 !=0){
            halfSq = x * halfSq;
        }

        return halfSq;

    }
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        return tiling(n-1)+tiling(n-2);
    }
    public static void duplicates(String s,boolean[] arr, StringBuilder str, int idx){
        if(idx == s.length()){
            System.out.println(str);
            return;
        }
        char c = s.charAt(idx);
        if(arr[c-'a']==true){
            duplicates(s,arr,str,idx+1);
        }else{
            arr[c-'a']=true;
            duplicates(s,arr,str.append(c),idx+1);
        }

    }
    public static boolean nQueen(char[][] board, int row){
        if(row==board.length){
            printBoard(board);
            return true;
        }

        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nQueen(board,row+1)){
                    return true;
                }
                board[row][j]='X';
            }
        }
    return false;
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
//        printDec(100);
      //  System.out.println(fab(4));
//        duplicates("apnacollege",new boolean[26],new StringBuilder(""),0);
        int n=4;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j=0; j<board.length;j++){
                board[i][j]='X';
            }
        }
        System.out.println(        nQueen(board,0));

    }
}
