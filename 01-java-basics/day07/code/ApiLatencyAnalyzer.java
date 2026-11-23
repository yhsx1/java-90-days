import java.util.Scanner;

public class ApiLatencyAnalyzer {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 请求耗时阈值
        final int threshold = 200;

        // 获取请求数量
        System.out.print("Enter request count (1-8): ");
        int count = scanner.nextInt();

        // 请求数量合法性判断并创建请求耗时数组
        if (count >= 1 && count <= 8) {
            int duration;
            boolean durationValid = true;
            int[] durations = new int[count];

            // 获取请求耗时
            for (int i = 0; i < count; i++) {
                System.out.printf("Enter duration for request %d (0-10000 ms): ", i + 1);
                duration = scanner.nextInt();

                if (duration >= 0 && duration <= 10000) {
                    durations[i] = duration;
                } else {
                    durationValid = false;
                    System.out.println("Invalid duration");
                    break;
                }
            }

            // 统计信息计算与输出
            if (durationValid) {
                int totalDuration = calculateTotal(durations);
                int maxDuration = findMax(durations);
                int minDuration = findMin(durations);
                double averageDuration = calculateAverage(durations);
                int countSlow = countSlowRequests(durations, threshold);

                System.out.printf("Total duration: %d ms%n", totalDuration);
                System.out.printf("Maximum duration: %d ms%n", maxDuration);
                System.out.printf("Minimum duration: %d ms%n", minDuration);
                System.out.printf("Average duration: %.2f ms%n", averageDuration);
                System.out.printf("Slow requests (>= 200 ms): %d%n", countSlow);
            }
        } else {
            System.out.println("Invalid count");
        }
    }

    // 计算总耗时
    public static int calculateTotal(int[] durations) {
        int total = 0;

        for (int duration : durations) {
            total += duration;
        }

        return total;
    }

    // 统计最大耗时
    public static int findMax(int[] durations) {
        int max = durations[0];

        for (int duration : durations) {
            if (duration > max) {
                max = duration;
            }
        }

        return max;
    }

    // 统计最小耗时
    public static int findMin(int[] durations) {
        int min = durations[0];

        for (int duration : durations) {
            if (duration < min) {
                min = duration;
            }
        }

        return min;
    }

    // 计算平均耗时
    public static double calculateAverage(int[] durations) {
        int total = calculateTotal(durations);

        return (double) total / durations.length;
    }

    // 统计达到或超过阈值的请求数量
    public static int countSlowRequests(int[] durations, int threshold) {
        int count = 0;

        for (int duration : durations) {
            if (duration >= threshold) {
                count++;
            }
        }

        return count;
    }
}
