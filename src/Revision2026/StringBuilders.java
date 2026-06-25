package Revision2026;

public class StringBuilders {
    public static StringBuilder toCapitalCase(StringBuilder sb){
        StringBuilder nsb = new StringBuilder();
        int flag = 1;
        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(flag==1){
                String s = ch+"";
                nsb.append(s.toUpperCase());
            }else{
                nsb.append(ch);
            }

            if(ch==' '){
                flag=1;
            }else{
                flag =0;
            }
        }
        return nsb;
    }
    public static String compression(String s){
        int flag=0;
        StringBuilder sb = new StringBuilder(" ");
        for(int i=0; i<s.length();i++){
            Integer count=1;
            char c = s.charAt(i);
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            if(count>=1){
                sb.append(c+count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hey");
        sb.append("! my name is krish");
        sb.append(" makharia");
        System.out.println(sb);
        System.out.println(toCapitalCase(sb));
        System.out.println(compression("aabbccc"));
    }
}
