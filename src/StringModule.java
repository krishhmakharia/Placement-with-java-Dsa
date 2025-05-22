public class StringModule {
    public static void printLetters(String name){
        for (int i=0; i<name.length();i++){
            System.out.println(i+"-->"+name.charAt(i));
        }
    }
    public static boolean isPalindrome(String word){
        for(int i=0; i<word.length()/2; i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static float getShortestPath(String directions){
        int x=0;
        int y=0;
        for(int i=0; i<directions.length(); i++){
            char d = directions.charAt(i);
            //East
            if(d=='E'){
                x++;
            }
            //West
            else if(d=='W'){
                x--;
            }
            //North
            else if(d=='N'){
                y++;
            }
            //South
            else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
         return (float) Math.sqrt(x2+y2);
    }
    public static String toSubStr(String s,int si,int ei){ //alternative is .subStr inbuilt method
        String str = "";
        for(int i=si; i<ei; i++){
            str = str + s.charAt(i);
        }
        return str;
    }
    public static void main(String[] args){
//        String full_name = "Krish Makharia";
//        printLetters(full_name);
//        String word = "racecar";
//        if(isPalindrome(word))
//            System.out.println(word +" is palindrome");
//        else
//            System.out.println("Not a palindrome");

        String directions = "WNEENESENNN";
//        System.out.println(getShortestPath(directions));
//        System.out.println(toSubStr(directions,0,6));

        //lexicographical by  largest string


    }
}
