import java.util.Scanner;

public class DailySalesSummary {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 读取销售天数
        System.out.print("Enter day count: ");
        if (scanner.hasNextInt()) {
            int dayCount = scanner.nextInt();

            if (dayCount >= 1 && dayCount <= 7) {
                // 创建销量数组
                int[] sales = new int[dayCount];

                // 读取每天销量
                boolean saleValid = true;
                for (int i = 0; i < dayCount; i++) {
                    System.out.printf("Enter sales for day %d: ", i + 1);
                    if (scanner.hasNextInt()) {
                        int sale = scanner.nextInt();

                        if (sale < 0 || sale > 1000) {
                            saleValid = false;
                            System.out.println("Invalid sales");
                            break;
                        } else {
                            sales[i] = sale;
                        }
                    } else {
                        saleValid = false;
                        System.out.println("Invalid sales");
                        break;
                    }
                }

                // 统计总销量
                if (saleValid) {
                    int totalSales = 0;

                    for (int i = 0; i < dayCount; i++) {
                        totalSales += sales[i];
                    }

                    // 输出统计信息
                    System.out.println("=== Daily Sales Summary ===");
                    System.out.printf("Day count: %d%n", dayCount);
                    System.out.printf("Total sales: %d%n", totalSales);
                }
            } else {
                System.out.println("Invalid day count");
            }
        } else {
            System.out.println("Invalid day count");
        }
    }
}
