import java.util.Scanner;

public class ShippingFeeCalculator {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 读取订单金额
        System.out.print("Enter order amount: ");
        double orderAmount = scanner.nextDouble();

        // 费用计算与结果输出
        if (orderAmount < 0) {
            System.out.println("Invalid order amount");
        } else if (orderAmount >= 0 && orderAmount < 50) {
            System.out.printf("Shipping Fee: %.2f%n", 10.00);
            System.out.printf("Total Amount: %.2f%n", orderAmount + 10.00);
        } else if (orderAmount < 100) {
            System.out.printf("Shipping Fee: %.2f%n", 5.00);
            System.out.printf("Total Amount: %.2f%n", orderAmount + 5.00);
        } else {
            System.out.printf("Shipping Fee: %.2f%n", 0.00);
            System.out.printf("Total Amount: %.2f%n", orderAmount);
        }
    }
}
