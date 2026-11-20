public class Calculator {
    public static void main(String[] args) {
        // 方法调用
        int intAddResult = add(10, 5);
        double doubleAddResult = add(10.5, 2.5);
        int intSubtractResult = subtract(10, 5);
        int intMultiplyResult = multiply(10, 5);
        double intDivideResult = divide(10, 4);
        double intDivideZeroResult = divide(10, 0);
        int twoIntMaxResult = max(10, 20);
        int threeIntMaxResult = max(10, 20, 15);
        boolean validDivisor = isValidDivisor(4);
        boolean invalidDivisor = isValidDivisor(0);

        // 方法测试与输出
        System.out.printf("Int Add: %d%n", intAddResult);
        System.out.printf("Double Add: %.1f%n", doubleAddResult);
        System.out.printf("Subtract: %d%n", intSubtractResult);
        System.out.printf("Multiply: %d%n", intMultiplyResult);
        System.out.printf("Divide: %.1f%n", intDivideResult);
        System.out.printf("Divide Zero: %.1f%n", intDivideZeroResult);
        System.out.printf("Max Two: %d%n", twoIntMaxResult);
        System.out.printf("Max Three: %d%n", threeIntMaxResult);
        System.out.printf("Valid Divisor: %b%n", validDivisor);
        System.out.printf("Invalid Divisor: %b%n", invalidDivisor);
    }

    // 整数加法
    public static int add(int a, int b) {
        return a + b;
    }

    // 小数加法
    public static double add(double a, double b) {
        return a + b;
    }

    // 整数减法
    public static int subtract(int a, int b) {
        return a - b;
    }

    // 整数乘法
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 整数参数的浮点数除法
    public static double divide(int a, int b) {
        if (isValidDivisor(b)) {
            return (double) a / b;
        } else {
            return Double.NaN;
        }
    }

    // 两个整数的最大值
    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    // 三个整数的最大值
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    // 判断除数合法性
    public static boolean isValidDivisor(int divisor) {
        return divisor != 0;
    }
}
