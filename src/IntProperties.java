public class IntProperties {

    public static void print(){
        System.out.println("int properties...");
        printIntMaxValue();
        printIntMinValue();
        printIntMaxValuePlusoOne();
        printIntMinValueMinusOne();
        printIntBitSet();
        printValueForZeroBits();
        printValueFromAll31Bits();
        //printMinimalValueFromBitset();
        System.out.println();
    }

    private static void printIntMaxValue() {
        int i=1;
        while (i+1>0){
            i++;
        }
        System.out.println("int max value: " + i);
    }

    private static void printIntMinValue(){
        int i=-1;
        while (i-1<0){
            i--;
        }
        System.out.println("int min value: " + i);
    }

    private static void printIntMaxValuePlusoOne(){
        System.out.println("int max value + 1: " +( Integer.MAX_VALUE + 1));
    }

    private static void printIntMinValueMinusOne(){
        System.out.println("int min value - 1: " +( Integer.MIN_VALUE - 1));
    }

    private static void printIntBitSet(){
        int value = Integer.MAX_VALUE;
        String binaryString = Integer.toBinaryString(value);
        System.out.println("int max value bit set: " + binaryString);
        //first bit is a sign bit
        System.out.println("int max value bit count: " + binaryString.length());

        value = Integer.MIN_VALUE;
        binaryString = Integer.toBinaryString(value);
        System.out.println("int min value bit set: " + binaryString);
        System.out.println("int min value bit count: " + binaryString.length());
    }

    private static void printValueForZeroBits(){
        String bitset = "00000000000000000000000000000000";
        int value = Integer.valueOf(bitset, 2);
        System.out.println("000..00 to int: " + value);
    }

    private static void printValueFromAll31Bits(){
        String bitset = "1111111111111111111111111111111";
        int value = Integer.valueOf(bitset, 2);
        System.out.println("1111....1111 (31 bits) to int: " + value);
    }

    private static void printMinimalValueFromBitset(){
        String bitset = "10000000000000000000000000000000";
        int value = Integer.parseInt(bitset, 2);
        System.out.println("1000...0000 (32 bits) to int: " + value);
    }
}
