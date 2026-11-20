public class StudentScoreCalculator {
    public static void main(String[] args) {
        // 分数变量声明与初始化
        int score1 = 80;
        int score2 = 95;

        // 计算总分
        int total = calculateTotal(score1, score2);

        // 计算平均分
        double average = calculateAverage(score1, score2);

        // 判断成绩合法性
        boolean valid = isValidScore(score1);

        // 判断两门成绩是否合法且平均分是否及格
        boolean pass = isPass(score1, score2);

        // 输出
        System.out.printf("Total: %d%n", total);
        System.out.printf("Average: %.1f%n", average);
        System.out.printf("Valid: %b%n", valid);
        System.out.printf("Pass: %b%n", pass);
        System.out.printf("Invalid Score: %b%n", isValidScore(-5));
        System.out.printf("Invalid Pass: %b%n", isPass(80, 120));
    }

    // 计算两门课程总分
    public static int calculateTotal(int score1, int score2) {
        return score1 + score2;
    }

    // 计算两门课程平均分
    public static double calculateAverage(int score1, int score2) {
        return (score1 + score2) / 2.0;
    }

    // 判断单科成绩合法性
    public static boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    // 判断两门成绩是否合法且平均分是否及格
    public static boolean isPass(int score1, int score2) {
        if (isValidScore(score1) && isValidScore(score2)) {
            double average = calculateAverage(score1, score2);

            return average >= 60;
        } else {
            return false;
        }
    }
}
