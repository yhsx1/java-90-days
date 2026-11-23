import java.util.Scanner;

public class TicketLoadAnalyzer {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 初始化统计变量
        int validTicket = 0;
        int urgentTicket = 0;
        int totalPoints = 0;

        // 循环统计
        int priority;
        while (true) {
            System.out.print("Enter ticket priority (1-3, 0 to finish): ");
            priority = scanner.nextInt();

            if (priority != 0) {
                if (isValidPriority(priority)) {
                    validTicket++;
                    totalPoints += calculatePriorityPoints(priority);

                    if (priority == 3) {
                        urgentTicket++;
                    }
                } else {
                    System.out.println("Invalid priority.");
                }
            } else {
                break;
            }
        }

        // 计算负载等级
        String loadLevel = determineLoadLevel(totalPoints);

        // 输出统计结果
        System.out.printf("Valid tickets: %d%n", validTicket);
        System.out.printf("Urgent tickets: %d%n", urgentTicket);
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Load level: %s%n", loadLevel);
    }

    // 优先级合法性判断
    public static boolean isValidPriority(int priority) {
        return priority >= 1 && priority <= 3;
    }

    // 合法优先级转换为对应积分
    public static int calculatePriorityPoints(int priority) {
        if (priority == 1) {
            return 1;
        } else if (priority == 2) {
            return 3;
        } else {
            return 5;
        }
    }

    // 计算工作负载等级
    public static String determineLoadLevel(int totalPoints) {
        if (totalPoints == 0) {
            return "NONE";
        } else if (totalPoints >= 1 && totalPoints <= 4) {
            return "LOW";
        } else if (totalPoints >= 5 && totalPoints <= 9) {
            return "MEDIUM";
        } else {
            return "HIGH";
        }
    }
}
