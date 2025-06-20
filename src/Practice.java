public class Practice {
    public static int dTb(int num){
        int dec=0;
        double pow=0;
        while(num>0){
            int ld =num%10;
            dec+=(ld*(Math.pow(2,pow)));
            pow++;
            num = num/10;
        }
        return dec;
    }
    public static void bTd(int b){
        int n = b;
        String binary="";
        while(n>0){
            binary = (n%2) + binary;
            n=(int)n/2;
        }
        System.out.println(binary);
    }
    public static void toCapitalCase(String words){
        StringBuilder sb = new StringBuilder("");
        char ch = words.charAt(0);
        sb.append(Character.toUpperCase(ch));
        for(int i=1;i<words.length();i++){
            if(words.charAt(i)==' '){
                sb.append(words.charAt(i));
                i++;
                sb.append(Character.toUpperCase(words.charAt(i)));
            }else{
                sb.append(words.charAt(i));
            }
        }
        System.out.println(sb);

    }
    public static void addBinary(String a, String b) {
        //b to d
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        int x=0,y=0,i=0,j=0;
        while(n1>0 && n2>0){
            int t = n1%10;
            x=x+((int)Math.pow(2,i)*t);
            n1=n1/10;
            i++;
        }
        while(n2>0){
            int t = n2%10;
            y=y+((int)Math.pow(2,j)*t);
            n2=n2/10;
            j++;
        }

    }
    public static void main(String[] args){
//        int n = 111;
//        System.out.println(dTb(n));
//        int b=5;
//        bTd(b);
//        String s = "11";
//        addBinary(s,"100");
        String s = "hey! my name is krish makharia";
        toCapitalCase(s);
    }

}
