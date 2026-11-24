public class InventoryItem {
    // 声明实例字段
    String itemId;
    String itemName;
    int stock;
    double unitPrice;

    public static void main(String[] args) {
        // 创建两个商品对象
        InventoryItem item1 = new InventoryItem();
        InventoryItem item2 = new InventoryItem();

        // 设置商品信息
        item1.itemId = "ITEM-001";
        item1.itemName = "Keyboard";
        item1.stock = 20;
        item1.unitPrice = 150.0;

        item2.itemId = "ITEM-002";
        item2.itemName = "Mouse";
        item2.stock = 10;
        item2.unitPrice = 80.0;

        // 输出初始商品信息
        item1.printInfo();
        item2.printInfo();

        // 计算初始库存总价值并输出
        double item1InitialTotalValue = item1.calculateTotalValue();
        double item2InitialTotalValue = item2.calculateTotalValue();
        System.out.printf("Initial item1 value: %.2f%n", item1InitialTotalValue);
        System.out.printf("Initial item2 value: %.2f%n", item2InitialTotalValue);

        // 执行正常入库并输出两商品的库存
        item1.addStock(10);
        System.out.printf("Restocked item1 stock: %d%n", item1.stock);
        System.out.printf("Unchanged item2 stock: %d%n", item2.stock);

        // 执行非法入库并输出库存
        item1.addStock(-5);
        System.out.printf("Invalid restock item1 stock: %d%n", item1.stock);

        // 判断能否出库并输出结果
        boolean item1CanRemoveStock = item1.canRemoveStock(15);
        boolean item2CanRemoveStock = item2.canRemoveStock(15);
        System.out.printf("Can remove from item1: %b%n", item1CanRemoveStock);
        System.out.printf("Can remove from item2: %b%n", item2CanRemoveStock);

        // 执行出库操作并输出结果
        boolean item1RemoveStock = item1.removeStock(15);
        boolean item2RemoveStock = item2.removeStock(15);
        System.out.printf("Remove item1 result: %b%n", item1RemoveStock);
        System.out.printf("Remove item2 result: %b%n", item2RemoveStock);
        System.out.printf("After removal item1 stock: %d%n", item1.stock);
        System.out.printf("After removal item2 stock: %d%n", item2.stock);

        // 验证出库边界并输出结果
        boolean item2RemoveStockAll = item2.removeStock(10);
        boolean item1RemoveStockZero = item1.removeStock(0);
        boolean item1RemoveStockNegative = item1.removeStock(-3);
        System.out.printf("Exact removal result: %b%n", item2RemoveStockAll);
        System.out.printf("Exact removal item2 stock: %d%n", item2.stock);
        System.out.printf("Zero removal result: %b%n", item1RemoveStockZero);
        System.out.printf("Zero removal item1 stock: %d%n", item1.stock);
        System.out.printf("Negative removal result: %b%n", item1RemoveStockNegative);
        System.out.printf("Negative removal item1 stock: %d%n", item1.stock);

        // 输出最终状态及库存总价值
        System.out.println("Final inventory:");
        item1.printInfo();
        item2.printInfo();
        double item1FinalTotalValue = item1.calculateTotalValue();
        double item2FinalTotalValue = item2.calculateTotalValue();
        System.out.printf("Final item1 value: %.2f%n", item1FinalTotalValue);
        System.out.printf("Final item2 value: %.2f%n", item2FinalTotalValue);
    }

    // 输出商品信息
    void printInfo() {
        System.out.printf("Item: %s, %s, stock=%d, price=%.2f%n", itemId, itemName, stock, unitPrice);
    }

    // 商品入库
    void addStock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
        }
    }

    // 计算库存总价值
    double calculateTotalValue() {
        return stock * unitPrice;
    }

    // 判断能否出库
    boolean canRemoveStock(int quantity) {
        return quantity > 0 && quantity <= stock;
    }

    // 执行出库
    boolean removeStock(int quantity) {
        if (canRemoveStock(quantity)) {
            stock -= quantity;
            return true;
        }

        return false;
    }
}
