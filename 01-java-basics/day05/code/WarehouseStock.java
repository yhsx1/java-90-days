public class WarehouseStock {
    public static void main(String[] args) {
        // 输出程序标题
        System.out.println("=== Warehouse Stock ===");

        // 初始化库存数组
        int[] stocks = {120, 85, 200, 60};

        // 获取仓位数量并输出
        int slotCount = stocks.length;
        System.out.printf("Slot count: %d%n", slotCount);

        // 使用索引逐个输出仓位库存
        System.out.printf("Slot 1: %d%n", stocks[0]);
        System.out.printf("Slot 2: %d%n", stocks[1]);
        System.out.printf("Slot 3: %d%n", stocks[2]);
        System.out.printf("Slot 4: %d%n", stocks[3]);

        // 输出首尾仓库库存
        System.out.printf("First slot stock: %d%n", stocks[0]);
        System.out.printf("Last slot stock: %d%n", stocks[slotCount - 1]);
    }
}
