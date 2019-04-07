public class DoubleProperties {

    public static void print(){
        System.out.println("double properties...");
        printAddTwodoubles();
        printMultiplication();
        printEpsilon();
        System.out.println();
    }

    private static void printAddTwodoubles(){
        double a = 0.2f;
        double b = 0.1f;
        double result = a + b;
        System.out.println("a + b = 0.3 ?: " + (result==0.3));
    }

    private static void printMultiplication(){
        double a = 100f;
        double b = 0.3f;
        double result = a * b;
        System.out.println("a*b/b = 100 ?: "+ (result / b == 100));
    }

    private static void printMaxValue(){

    }

    private static void printEpsilon(){
        double x=1.0;
        double epsilon=1.0f;

        while(x+(double)(epsilon*0.5)!=x) {
            epsilon*=0.5;
        }
        System.out.println("double epsilon: " + epsilon);
    }
}
