import java.util.Scanner;

public class ScoreStatistics {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 读取学生人数
        System.out.print("Enter student count: ");
        if (scanner.hasNextInt()) {
            int studentCount = scanner.nextInt();

            if (studentCount >= 1 && studentCount <= 30) {
                // 创建成绩数组
                int[] scores = new int[studentCount];

                // 依次输入学生成绩
                boolean scoresValid = true;
                for (int i = 0; i < studentCount; i++) {
                    System.out.printf("Enter score for student %d: ", i + 1);

                    if (scanner.hasNextInt()) {
                        int score = scanner.nextInt();

                        if (score >= 0 && score <= 100) {
                            scores[i] = score;
                        } else {
                            scoresValid = false;
                            System.out.println("Invalid score");
                            break;
                        }
                    } else{
                        scoresValid = false;
                        System.out.println("Invalid score");
                        break;
                    }
                }

                // 统计最高分、最低分和平均分
                int maxScore = scores[0];
                int minScore = scores[0];
                int total = 0;
                if (scoresValid) {
                    for (int i = 0; i < studentCount; i++) {
                        total += scores[i];

                        if (scores[i] < minScore) {
                            minScore = scores[i];
                        }

                        if (scores[i] > maxScore) {
                            maxScore = scores[i];
                        }
                    }

                    double average = (double) total / studentCount;

                    System.out.println("=== Score Statistics ===");
                    System.out.printf("Student count: %d%n", studentCount);
                    System.out.printf("Highest score: %d%n", maxScore);
                    System.out.printf("Lowest score: %d%n", minScore);
                    System.out.printf("Average score: %.2f%n", average);
                }
            } else {
                System.out.println("Invalid student count");
            }
        } else {
            System.out.println("Invalid student count");
        }
    }
}
