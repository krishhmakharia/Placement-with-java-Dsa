package Revision2026;

public class Strings {
    public static boolean palindrome(String str){
        boolean flag = true;
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start) != str.charAt(end) ){
                System.out.print("Not a Palindrome!");
                flag = false;
                break;
            }
            start++;
            end--;
        }
        if(flag== true){
            System.out.println("String is Palindrome");
        }
        return flag;
    }
    public static float getShortestPath(String path){
        //coordinates
        int x=0,y=0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }else if(dir == 'N'){
                y++;
            } else if (dir == 'W') {
                x--;
            }else{
                x++;
            }
        }

        int X2 = x*x;
        int Y2 =y*y;

        return (float) Math.sqrt(X2+Y2);
    }
    public static void main(String[] args){
//        palindrome("madam");

        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
