public class FloatProperties {

    public static void print(){
        System.out.println("float properties...");
        printAddTwoFloats();
        printMultiplication();
        printEpsilon();
        System.out.println();
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

    private static void printEpsilon(){
        float x=1.0f;
        float epsilon=1.0f;

        while(x+(float)(epsilon*0.5)!=x) {
            epsilon*=0.5;
        }
        System.out.println("float epsilon: " + epsilon);
    }

}
