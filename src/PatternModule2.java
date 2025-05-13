public class PatternModule2 {
    public static void hollowRect(){
        for(int i=0; i<=5; i++){
            for(int j=0; j<=5; j++){
                if(j==0 || i==0||j==5 || i==5){
                    System.out.print("*"+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static void invertedRevTri(){
        for(int i=0; i<=5; i++){
            for(int j=0; j<=5; j++){
                if(j<=i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void invertedTri(){
        for(int i=0; i<5; i++){
            for(int j=5; j>0; j--){
                if(j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void numInvertTri(){
        for(int i=0; i<=5; i++){
            int k=1;
            for (int j=5-i; j>0 ; j--) {
                System.out.print(k+"\t");
                k++;
            }
            System.out.println();
        }
    }
    public static void floydTri(){
        int num=1;
        for (int i = 0; i<5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
    }
    public static void zeroOneTri(){
        int k=0;
        for(int i=0; i<5; i++){
            int temp=k;
            for(int j=0; j<=i; j++){
                if(temp%2==0){
                    System.out.print(1+"\t");
                }else{
                    System.out.print(0+"\t");
                }
                temp++;
            }
            k++;
            System.out.println();
        }
    }
    public static void prymoid(){
        for (int i=0; i<5; i++){
            for (int j = 5; j >i ; j--) {
                System.out.print(" ");
            }
            for(int j=0; j<=(2*i+1)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        for(int i=1; i<=n; i++){
            for (int j = 0; j <i; j++) {
                System.out.print("*"+"\t");
            }
            for (int j = (2*(n-i)); j>0 ; j--) {
                System.out.print(" "+"\t");
            }
            for (int j = 0; j <i; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+"\t");
            }
            for (int j = 0; j <(2*(n-i)) ; j++) {
                System.out.print(" "+"\t");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }

    }
    public static void rombus(int n){
        for (int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" "+"\t");
            }
            for (int j=1;j<=5;j++){
                System.out.print("*"+"\t");
            }
            System.out.println();

        }
    }
    public static void hollowRombus(int n){
        for (int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" "+"\t");
            }
            for (int j=1;j<=5;j++){
                if(j==1 ||j==5 || i==1 || i==5){
                    System.out.print("*"+"\t");
                }else{
                    System.out.printf(" "+"\t");
                }
            }
            System.out.println();

        }
    }
    public static void diamond(int n){
        for (int i = 1; i <=n; i++) {
            for (int j=n; j >=i ; j--) {
                System.out.print(" "+"\t");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }

        for (int i =n; i >=1; i--) {
            for (int j=n; j >=i ; j--) {
                System.out.print(" "+"\t");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
//        butterfly(5);
//        hollowRombus(5);
        diamond(5);
    }
}
