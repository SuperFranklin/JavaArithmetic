public class IntProperties {

    public static void print(){
        printIntMaxValue();
        printIntMinValue();
        printIntMaxValuePlusoOne();
        printIntMinValueMinusOne();
        printIntBitSet();
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
}
