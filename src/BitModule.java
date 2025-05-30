public class BitModule {
    public static void checkOddEven(int num){
        if((num&1)==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static int getBit(int num , int i){
        int bitMask = (1<<i);
         if((num & bitMask) ==0){
             return 0;
         }else{
             return 1;
         }
    }
    public static int setBit(int num , int i){
        int bitMask = (1<<i);
        return num|bitMask;
    }
    public static int clearBit(int num, int i){
        int bitMask=~(1<<i);
        return num&bitMask;
    }
    public static int updateBit(int num, int i, int bit){
        if(bit==0){
            return clearBit(num,i);
        }else{
            return setBit(num,i);
        }
    }
    public static int clearIBit(int num, int i){
        int bitMask = (~0)<<i;
        return num & bitMask;
    }
    public static int clearIBitInRange(int num, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return num & bitMask;
    }

    public static void main(String[] args){
        //Binary AND &
        System.out.println(5&6);
        //Binary OR |
        System.out.println(5|6);
        //Binary XOR |
        System.out.println(5^6);
        //Binary One's complement ~
        System.out.println(~5);
        //Binary Left Shift <<
        System.out.println(5<<2);
        //Binary Right Shift >>
        System.out.println(6>>1);

        //Check a number is even or Odd
        checkOddEven(5);

        //Get i th bit
        System.out.println(getBit(5,2));

        //Set i th bit to 1
        System.out.println(setBit(10,2));

        //Clear i th bit to 0
        System.out.println(clearBit(7,1));

        //Update i th bit to 0 or 1
        System.out.println(updateBit(8,0,1));

        //clear i th bit to zeros
        System.out.println(clearIBit(7,2));//here i is excluded

        //clear bits in range
        System.out.println(clearIBitInRange(10,0,2));
    }
}
