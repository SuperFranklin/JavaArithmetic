public class LongProperties {

    public static void print(){
        prlonglongMaxValue();
        prlonglongMinValue();
        prlonglongMaxValuePlusoOne();
        prlonglongMinValueMinusOne();
        prlonglongBitSet();
    }

    private static void prlonglongMaxValue() {
        long i = Long.MAX_VALUE-100000;
        while (i+1>0){
            i++;
        }
        System.out.println("long max value: " + i);
    }

    private static void prlonglongMinValue(){
        long i = Long.MIN_VALUE+1000;
        while (i-1<0){
            i--;
        }
        System.out.println("long max value: " + i);
    }

    private static void prlonglongMaxValuePlusoOne(){
        System.out.println("long max value + 1: " +( Long.MAX_VALUE + 1));
    }

    private static void prlonglongMinValueMinusOne(){
        System.out.println("long min value - 1: " +( Long.MIN_VALUE - 1));
    }

    private static void prlonglongBitSet(){
        long value = Long.MAX_VALUE;
        String binaryString = Long.toBinaryString(value);
        System.out.println("long max value bit set: " + binaryString);
        //first bit is a sign bit
        System.out.println("long max value bit count: " + binaryString.length());

        value = Long.MIN_VALUE;
        binaryString = Long.toBinaryString(value);
        System.out.println("long min value bit set: " + binaryString);
        System.out.println("long min value bit count: " + binaryString.length());
    }
}
