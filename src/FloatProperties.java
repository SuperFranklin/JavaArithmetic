public class FloatProperties {

    public static void print(){
        printAddTwoFloats();
        printMultiplication();
    }

    private static void printAddTwoFloats(){
        float a = 0.2f;
        float b = 0.1f;
        float result = a + b;
        System.out.println("a + b = 0.3 ?: " + (result==0.3));
    }

    private static void printMultiplication(){
        float a = 100f;
        float b = 0.3f;
        float result = a * b;
        System.out.println("a*b/b = 100 ?: "+ (result / b == 100));
    }

    private static void printMaxValue(){

    }

}
