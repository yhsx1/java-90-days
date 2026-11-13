import java.util.Scanner;

public class NumberPractice {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 输出程序启动标题
        System.out.println("=== Number Practice ===");

        // 程序死循环，满足特定条件时退出
        while (true) {
            // 获取用户输入
            System.out.print("Enter N (0 to exit): ");
            int n = scanner.nextInt();

            // 根据用户输入执行对应操作
            if (n == 0) {
                System.out.println("Program ended");
                break;
            } else if (n < 0 || n > 20) {
                // 输入非法重新输入并开始下一轮循环
                System.out.println("Invalid input");
                continue;
            }
            // 计算累加并输出结果
            int total = 0;
            for (int i = 1; i <= n; i++) {
                total += i;
            }
            System.out.printf("Sum(1..%d) = %d%n", n, total);

            // 输出九九乘法表
            System.out.println("Multiplication Table:");
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%d*%d=%d", j, i, i * j);
                    if (j < i) {
                        System.out.print(' ');
                    } else {
                        System.out.print('\n');
                    }
                }
            }
        }
    }
}
