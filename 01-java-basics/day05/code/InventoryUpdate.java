public class InventoryUpdate {
    public static void main(String[] args) {
        // 输出程序标题
        System.out.println("=== Inventory Update ===");

        // 初始化商品库存
        int[] stocks = {50, 80, 120, 60};

        // 设置入库信息
        int productId = 2;
        int addQuantity = 1001;

        if (productId - 1 >= 0 && productId - 1 < stocks.length && addQuantity >= 0 && addQuantity <= 1000){
            // 输出指定商品编号以及更新前库存
            System.out.printf("Product ID: %d%n", productId);
            System.out.printf("Before stock: %d%n", stocks[productId - 1]);

            // 更新指定商品库存
            stocks[productId - 1] += addQuantity;
            System.out.printf("After stock: %d%n", stocks[productId - 1]);
        } else {
            System.out.println("Invalid update");
        }
    }
}
