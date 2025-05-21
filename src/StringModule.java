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
    public static void main(String[] args){
//        String full_name = "Krish Makharia";
//        printLetters(full_name);
        String word = "racecar";
        if(isPalindrome(word))
            System.out.println(word +" is palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
