import java.util.Scanner;

public class ForPractice {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 获取用户输入
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        // 统计指定范围内 3 的倍数
        int count = 0;
        if (n >= 1 && n <= 30) {
            System.out.println("Multiples of 3:");
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    count++;
                    System.out.printf("%d%n", i);
                }
            }
            System.out.printf("Count: %d%n", count);
        } else {
            System.out.println("Invalid input");
        }
    }
}
