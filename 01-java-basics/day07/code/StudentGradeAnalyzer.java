import java.util.Scanner;

public class StudentGradeAnalyzer {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 读取学生人数
        int studentCount = readBoundedInt(scanner, "Enter student count (1-10): ", 1, 10);

        // 读取学生成绩
        int[] scores = readScores(scanner, studentCount);

        // 计算总分
        int totalScore = calculateTotal(scores);

        // 统计最高分
        int highestScore = findHighest(scores);

        // 统计最低分
        int lowestScore = findLowest(scores);

        // 计算平均分
        double averageScore = calculateAverage(scores);

        // 统计及格人数
        int passedStudents = countAtLeast(scores, 60);

        // 统计优秀人数
        int excellentStudents = countAtLeast(scores, 90);

        // 计算及格率
        double passRete = calculatePassRate(passedStudents, studentCount);

        // 结果输出
        System.out.printf("Student count: %d%n", studentCount);
        System.out.printf("Total score: %d%n", totalScore);
        System.out.printf("Highest score: %d%n", highestScore);
        System.out.printf("Lowest score: %d%n", lowestScore);
        System.out.printf("Average score: %.2f%n", averageScore);
        System.out.printf("Passed students: %d%n", passedStudents);
        System.out.printf("Excellent students: %d%n", excellentStudents);
        System.out.printf("Pass rate: %.2f%%%n", passRete);
    }

    // 输入有效性判断
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

    // 读取成绩
    public static int[] readScores(Scanner scanner, int studentCount) {
        // 创建学生成绩数组
        int[] scores = new int[studentCount];

        // 循环读取学生成绩
        for (int i = 0; i < studentCount; i++) {
            scores[i] = readBoundedInt(scanner, String.format("Enter score for student %d (0-100): ", i + 1), 0, 100);
        }

        return scores;
    }

    // 计算总分
    public static int calculateTotal(int[] scores) {
        int total = 0;

        for (int score : scores) {
            total += score;
        }

        return total;
    }

    // 统计最高分
    public static int findHighest(int[] scores) {
        int highestScore = scores[0];

        for (int score : scores) {
            if (score > highestScore) {
                highestScore = score;
            }
        }

        return highestScore;
    }

    // 统计最低分
    public static int findLowest(int[] scores) {
        int lowestScore = scores[0];

        for (int score : scores) {
            if (score < lowestScore) {
                lowestScore = score;
            }
        }

        return lowestScore;
    }

    // 计算平均分
    public static double calculateAverage(int[] scores) {
        return (double) calculateTotal(scores) / scores.length;
    }

    // 统计满足指定成绩要求的学生人数
    public static int countAtLeast(int[] scores, int threshold) {
        int count = 0;

        for (int score : scores) {
            if (score >= threshold) {
                count++;
            }
        }

        return count;
    }

    // 计算通过率
    public static double calculatePassRate(int passedCount, int studentCount) {
        return (double) passedCount / studentCount * 100;
    }
}
