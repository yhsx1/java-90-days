import java.util.Scanner;

public class OrderStatusChecker {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 读取状态码
        System.out.print("Enter order status: ");
        int orderStatus = scanner.nextInt();

        // 根据状态码输出订单状态与业务说明
        switch (orderStatus) {
            case 1:
                System.out.println("Status: Pending");
                System.out.println("Description: Waiting for payment");
                break;
            case 2:
                System.out.println("Status: Paid");
                System.out.println("Description: Payment received");
                break;
            case 3:
                System.out.println("Status: Shipped");
                System.out.println("Description: Order is on the way");
                break;
            case 4:
                System.out.println("Status: Completed");
                System.out.println("Description: Order delivered");
                break;
            case 5:
                System.out.println("Status: Cancelled");
                System.out.println("Description: Order cancelled");
                break;
            default:
                System.out.println("Invalid order status");
        }
    }
}
