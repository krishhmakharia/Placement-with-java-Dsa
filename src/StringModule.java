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
    public static String smallest(String[] words){
        String small = words[0];
        for(int i=1; i<words.length; i++){
            if(words[i].compareToIgnoreCase(small)<0){
                small = words[i];
            }
        }
        return small;
    }
    public static String toUpperCase(String s){
        StringBuilder sb =  new StringBuilder("");
        char ch = s.charAt(0);
        sb.append(Character.toUpperCase(ch));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count ++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
//        String full_name = "Krish Makharia";
//        printLetters(full_name);
//        String word = "racecar";
//        if(isPalindrome(word))
//            System.out.println(word +" is palindrome");
//        else
//            System.out.println("Not a palindrome");

//        String directions = "WNEENESENNN";
//        System.out.println(getShortestPath(directions));
//        System.out.println(toSubStr(directions,0,6));

        //lexicographical by  largest string
//        String [] fruits = {"mango","banana","apple","pineapple"};
//        System.out.println("Smallest : "+smallest(fruits));

        // String Builder
        /* Since string is immutable then changment at index level
        makes high Time complexity to bypass this we have String builder
         */
//        StringBuilder sb = new StringBuilder("");
//        for(char a ='a'; a<='z'; a++){
//            sb.append(a);
//        }
//        System.out.print(sb);

//        String s = "hey i am krish";
//        System.out.println(toUpperCase(s));

        //String Compression
        String s = "aaabbcccd";
        System.out.println("Original :"+s+"\n"+"Compressed :"+compress(s));


    }
}
