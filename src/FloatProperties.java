public class FloatProperties {

    public static void print(){
        System.out.println("float properties...");
        printFloatDoesntTurn();
        printAddTwoFloats();
        printMultiplication();
        printEpsilon();
        printBitSet();
        System.out.println();
    }

    private static void printAddTwoFloats(){
        float a = 0.2f;
        float b = 0.1f;
        float result = a + b;
        System.out.println("a + b = 0.3 ?: " + (result==0.3));
    }

    private static void printFloatDoesntTurn(){
        float v = 2.0f;
        while(v*v > 0.0f){
            System.out.println(v);
            v = v * v;
        }
        System.out.println("Float max value: " + Float.MAX_VALUE);
    }

    private static void printMultiplication(){
        float a = 100f;
        float b = 0.3f;
        float result = a * b;
        System.out.println("a*b/b = 100 ?: "+ (result / b == 100));
    }

    private static void printBitSet(){
        float x=1.0f;
        float epsilon=1.0f;

        while(x+(float)(epsilon*0.5)!=x) {
            epsilon*=0.5;
        }
        System.out.println("float bitset: " + Float.toHexString(epsilon));
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
