public class ByteProperties {

    public static void print(){
        System.out.println("byte properties...");
        printMaxValue();
        printMinValue();
        printMaxValuePlusoOne();
        printMinValueMinusOne();
        authomaticResize();
        u2System();
        System.out.println();
    }

    private static void u2System(){
        System.out.println("byte u2 system:");
        byte b = (byte)(int)Integer.valueOf("10000011", 2);
        System.out.println("10000011 as byte: "+b);

        b = (byte)(int)Integer.valueOf("10000010", 2);
        System.out.println("10000010 as byte: "+b);

        b = (byte)(int)Integer.valueOf("01111111", 2);
        System.out.println("01111111 as byte: "+b);

        b = (byte)(int)Integer.valueOf("11111111", 2);
        System.out.println("11111111 as byte: "+b);

        b = (byte)(int)Integer.valueOf("00000000", 2);
        System.out.println("00000000 as byte: "+b);
    }

    private static void printMaxValue(){
        byte i=1;
        while (i+(byte)1>(byte)0){
            i++;
        }
        System.out.println("byte max value: " +(byte) (i-1));
    }

    private static void printMinValue(){
        byte i = -1;
        while (i-(byte)1<(byte)0){
            i--;
        }
        System.out.println("byte min value: " + (byte)(i+1));
    }

    private static void authomaticResize(){
        byte s = Byte.MAX_VALUE;
        System.out.println("Adding 1 to the maximum value of the byte does not move to the minimum value without casting to byte!");
        System.out.println("byte max +1: " + (s+1));
        System.out.println("byte max +1 cast to (byte): " + (byte )(s+1));
    }

    private static void printMaxValuePlusoOne(){
        System.out.println("byte max value + 1: " +( Byte.MAX_VALUE + 1));
    }

    private static void printMinValueMinusOne(){
        System.out.println("byte min value - 1: " +( Byte.MIN_VALUE - 1));
    }
}
