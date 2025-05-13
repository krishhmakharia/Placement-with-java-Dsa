public class PatternModule1 {
    public static void starTriangle(){
        for(int i=0; i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
    public static void invertedStarTriangle(){
        for (int i = 0; i < 5; i++) {
            for (int j = 4 ; j > i; j--) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
    public static void numberTriangle(){
        for(int i=0; i<5 ; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(j+1+"\t");
            }
            System.out.println();
        }
    }
    public static void patternAbc(){//focus on what to print
        int x=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print((char)(x+65)+"\t");
                x++;
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        patternAbc();
    }
}
