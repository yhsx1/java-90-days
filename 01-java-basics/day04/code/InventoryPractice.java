import java.util.Scanner;

public class InventoryPractice {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 初始化库存与操作标记
        int stock = 20;
        boolean continueFlag = true;

        // 输出
        System.out.printf("Initial stock: %d%n", stock);

        // 商品库存扣减
        while (stock > 0 && continueFlag) {
            // 输入扣减数量
            System.out.print("Enter quantity (0 to stop): ");
            int quantity = scanner.nextInt();

            // 扣减操作
            if (quantity == 0) {
                continueFlag = false;
            } else if (quantity < 0) {
                System.out.println("Invalid quantity");
            } else if (quantity > stock) {
                System.out.println("Insufficient stock");
            } else {
                stock -= quantity;
                System.out.printf("Remaining stock: %d%n", stock);
            }
        }

        // 输出最终库存
        System.out.printf("Final stock: %d%n", stock);
    }
}
