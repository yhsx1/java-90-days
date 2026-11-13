import java.util.Scanner;

public class ShelfScanPractice {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 获取行数、列数以及目标列数
        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns: ");
        int columns = scanner.nextInt();
        System.out.print("Enter target column: ");
        int targetColumn = scanner.nextInt();

        // 输入检测
        boolean rowsValid = rows >= 1 && rows <= 4;
        boolean columnsValid = columns >= 2 && columns <= 6;
        boolean targetColumnValid = targetColumn >= 1 && targetColumn <= columns && targetColumn != 2;

        // 货架扫描操作
        if (rowsValid && columnsValid && targetColumnValid) {
            System.out.println("Start scanning");
            for (int i = 1; i <= rows; i++) {
                System.out.printf("Row %d:%n", i);
                for (int j = 1; j <= columns; j++){
                    if (j == 2) {
                        continue;
                    }
                    System.out.printf("Scan (%d,%d)%n", i, j);
                    if (j == targetColumn) {
                        System.out.printf("Target found in row %d%n", i);
                        break;
                    }
                }
            }

            System.out.println("Scan completed");
        } else {
            System.out.println("Invalid input");
        }
    }
}
