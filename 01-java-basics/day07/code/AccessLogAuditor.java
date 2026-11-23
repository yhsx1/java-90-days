import java.util.Scanner;

public class AccessLogAuditor {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 初始化统计变量
        int processedRecords = 0;
        int grantedRecords = 0;
        int deniedRecords = 0;
        int alarmRecords = 0;
        int totalRiskPoints = 0;
        String riskLevel = "";

        // 读取访问记录数量
        int recordCount = readBoundedInt(scanner, "Enter record count (1-5): ", 1, 5);

        // 逐条读取访问结果
        for (int i = 0; i < recordCount; i++) {
            int code = readBoundedInt(scanner, String.format("Enter access result for record %d (1-3): ", i + 1), 1, 3);

            // 更新统计变量
            processedRecords++;
            if (code == 1) {
                grantedRecords++;
            } else if (code == 2) {
                deniedRecords++;
            } else {
                alarmRecords++;
            }
            totalRiskPoints += calculateRiskPoints(code);
        }

        // 更新访问风险等级
        riskLevel = determineRiskLevel(totalRiskPoints);

        // 结果输出
        System.out.printf("Processed records: %d%n", processedRecords);
        System.out.printf("Granted records: %d%n", grantedRecords);
        System.out.printf("Denied records: %d%n", deniedRecords);
        System.out.printf("Alarm records: %d%n", alarmRecords);
        System.out.printf("Total risk points: %d%n", totalRiskPoints);
        System.out.printf("Risk level: %s%n", riskLevel);
    }

    // 输入、检查并返回合法整数
    public static int readBoundedInt(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Invalid integer input.");
                continue;
            }

            int integer = scanner.nextInt();

            if (integer < min || integer > max) {
                System.out.println("Value out of range.");
                continue;
            }

            return integer;
        }
    }

    // 风险积分计算
    public static int calculateRiskPoints(int code) {
        int riskPoints;

        if (code == 1) {
            riskPoints = 0;
        } else if (code == 2) {
            riskPoints = 2;
        } else {
            riskPoints = 5;
        }

        return riskPoints;
    }

    // 风险等级判断
    public static String determineRiskLevel(int totalRiskPoints) {
        String riskLevel;

        if (totalRiskPoints == 0) {
            riskLevel = "SAFE";
        } else if (totalRiskPoints >= 1 && totalRiskPoints <= 4) {
            riskLevel = "WATCH";
        } else if (totalRiskPoints >= 5 && totalRiskPoints <= 9) {
            riskLevel = "WARNING";
        } else {
            riskLevel = "CRITICAL";
        }

        return riskLevel;
    }
}
