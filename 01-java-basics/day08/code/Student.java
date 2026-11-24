public class Student {
    // 声明实例字段
    String studentId;
    String name;
    int age;
    int javaScore;
    int databaseScore;
    int networkScore;

    public static void main(String[] args) {
        // 创建并初始化两个学生对象
        Student student1 = new Student();
        Student student2 = new Student();

        student1.studentId = "STU-001";
        student1.name = "Alice";
        student1.age = 22;
        student1.javaScore = 90;
        student1.databaseScore = 80;
        student1.networkScore = 85;

        student2.studentId = "STU-002";
        student2.name = "Bob";
        student2.age = 23;
        student2.javaScore = 55;
        student2.databaseScore = 60;
        student2.networkScore = 60;

        // 输出学生信息
        student1.printInfo();
        student2.printInfo();

        // 计算初始成绩结果
        int student1InitialTotalScore = student1.calculateTotalScore();
        double student1InitialAverageScore = student1.calculateAverageScore();
        boolean student1InitialIsPassed = student1.isPassed();
        String student1InitialGrade = student1.calculateGrade();

        int student2InitialTotalScore = student2.calculateTotalScore();
        double student2InitialAverageScore = student2.calculateAverageScore();
        boolean student2InitialIsPassed = student2.isPassed();
        String student2InitialGrade = student2.calculateGrade();

        System.out.printf("Initial student1: total=%d, average=%.2f, passed=%b, grade=%s%n", student1InitialTotalScore, student1InitialAverageScore, student1InitialIsPassed, student1InitialGrade);
        System.out.printf("Initial student2: total=%d, average=%.2f, passed=%b, grade=%s%n", student2InitialTotalScore, student2InitialAverageScore, student2InitialIsPassed, student2InitialGrade);

        // 正常更新成绩及验证状态独立性
        boolean student1UpdateScore = student1.updateScores(95, 90, 85);
        System.out.printf("Update student1 result: %b%n", student1UpdateScore);
        student1.printInfo();
        student2.printInfo();

        int student1UpdatedTotalScore = student1.calculateTotalScore();
        double student1UpdatedAverageScore = student1.calculateAverageScore();
        boolean student1UpdatedIsPassed = student1.isPassed();
        String student1UpdatedGrade = student1.calculateGrade();
        System.out.printf("Updated student1: total=%d, average=%.2f, passed=%b, grade=%s%n", student1UpdatedTotalScore, student1UpdatedAverageScore, student1UpdatedIsPassed, student1UpdatedGrade);

        // 验证非法成绩更新
        boolean student1UpdatedInvalidJava = student1.updateScores(-1, 70, 80);
        System.out.printf("Invalid Java update: %b%n", student1UpdatedInvalidJava);
        student1.printInfo();

        boolean student1UpdatedInvalidDatabase = student1.updateScores(70, 101, 80);
        System.out.printf("Invalid Database update: %b%n", student1UpdatedInvalidDatabase);
        student1.printInfo();

        boolean student1UpdatedInvalidNetwork = student1.updateScores(70, 80, -5);
        System.out.printf("Invalid Network update: %b%n", student1UpdatedInvalidNetwork);
        student1.printInfo();

        // 验证单科成绩合法范围
        boolean isValidScore1 = student2.isValidScore(0);
        boolean isValidScore2 = student2.isValidScore(100);
        boolean isValidScore3 = student2.isValidScore(-1);
        boolean isValidScore4 = student2.isValidScore(101);

        System.out.printf("Valid score 0: %b%n", isValidScore1);
        System.out.printf("Valid score 100: %b%n", isValidScore2);
        System.out.printf("Valid score -1: %b%n", isValidScore3);
        System.out.printf("Valid score 101: %b%n", isValidScore4);

        // 验证等级分界值及合法成绩更新
        boolean student2UpdatedBoundary60 = student2.updateScores(0, 80, 100);
        double student2UpdatedAverageScoreBoundary60 = student2.calculateAverageScore();
        boolean student2UpdatedIsPassedBoundary60 = student2.isPassed();
        String student2UpdatedGradeBoundary60 = student2.calculateGrade();
        System.out.printf("Boundary 60: updated=%b, average=%.2f, passed=%b, grade=%s%n", student2UpdatedBoundary60, student2UpdatedAverageScoreBoundary60, student2UpdatedIsPassedBoundary60, student2UpdatedGradeBoundary60);

        boolean student2UpdatedBoundary70 = student2.updateScores(70, 70, 70);
        double student2UpdatedAverageScoreBoundary70 = student2.calculateAverageScore();
        boolean student2UpdatedIsPassedBoundary70 = student2.isPassed();
        String student2UpdatedGradeBoundary70 = student2.calculateGrade();
        System.out.printf("Boundary 70: updated=%b, average=%.2f, passed=%b, grade=%s%n", student2UpdatedBoundary70, student2UpdatedAverageScoreBoundary70, student2UpdatedIsPassedBoundary70, student2UpdatedGradeBoundary70);

        boolean student2UpdatedBoundary80 = student2.updateScores(80, 80, 80);
        double student2UpdatedAverageScoreBoundary80 = student2.calculateAverageScore();
        boolean student2UpdatedIsPassedBoundary80 = student2.isPassed();
        String student2UpdatedGradeBoundary80 = student2.calculateGrade();
        System.out.printf("Boundary 80: updated=%b, average=%.2f, passed=%b, grade=%s%n", student2UpdatedBoundary80, student2UpdatedAverageScoreBoundary80, student2UpdatedIsPassedBoundary80, student2UpdatedGradeBoundary80);

        boolean student2UpdatedBoundary90 = student2.updateScores(90, 90, 90);
        double student2UpdatedAverageScoreBoundary90 = student2.calculateAverageScore();
        boolean student2UpdatedIsPassedBoundary90 = student2.isPassed();
        String student2UpdatedGradeBoundary90 = student2.calculateGrade();
        System.out.printf("Boundary 90: updated=%b, average=%.2f, passed=%b, grade=%s%n", student2UpdatedBoundary90, student2UpdatedAverageScoreBoundary90, student2UpdatedIsPassedBoundary90, student2UpdatedGradeBoundary90);

        boolean student2UpdatedBelow60 = student2.updateScores(59, 60, 60);
        double student2UpdatedAverageScoreBelow60 = student2.calculateAverageScore();
        boolean student2UpdatedIsPassedBelow60 = student2.isPassed();
        String student2UpdatedGradeBelow60 = student2.calculateGrade();
        System.out.printf("Below 60: updated=%b, average=%.2f, passed=%b, grade=%s%n", student2UpdatedBelow60, student2UpdatedAverageScoreBelow60, student2UpdatedIsPassedBelow60, student2UpdatedGradeBelow60);

        // 输出最终状态与统计结果
        System.out.println("Final students:");
        student1.printInfo();
        student2.printInfo();

        int student1FinalTotalScore = student1.calculateTotalScore();
        double student1FinalAverageScore = student1.calculateAverageScore();
        boolean student1FinalIsPassed = student1.isPassed();
        String student1FinalGrade = student1.calculateGrade();

        int student2FinalTotalScore = student2.calculateTotalScore();
        double student2FinalAverageScore = student2.calculateAverageScore();
        boolean student2FinalIsPassed = student2.isPassed();
        String student2FinalGrade = student2.calculateGrade();

        System.out.printf("Final student1: total=%d, average=%.2f, passed=%b, grade=%s%n", student1FinalTotalScore, student1FinalAverageScore, student1FinalIsPassed, student1FinalGrade);
        System.out.printf("Final student2: total=%d, average=%.2f, passed=%b, grade=%s%n", student2FinalTotalScore, student2FinalAverageScore, student2FinalIsPassed, student2FinalGrade);
    }

    // 输出学生信息
    void printInfo() {
        System.out.printf("Student: %s, %s, age=%d, Java=%d, Database=%d, Network=%d%n", studentId, name, age, javaScore, databaseScore, networkScore);
    }

    // 计算总成绩
    int calculateTotalScore() {
        return javaScore + databaseScore + networkScore;
    }

    // 计算平均成绩
    double calculateAverageScore() {
        return (double) calculateTotalScore() / 3;
    }

    // 判断是否及格
    boolean isPassed() {
        return calculateAverageScore() >= 60;
    }

    // 计算成绩等级
    String calculateGrade() {
        double averageScore = calculateAverageScore();

        if (averageScore >= 90) {
            return "A";
        } else if (averageScore >= 80) {
            return "B";
        } else if (averageScore >= 70) {
            return "C";
        } else if (averageScore >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // 判断单科成绩是否合法
    boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    // 同时更新三门成绩
    boolean updateScores(int newJavaScore, int newDatabaseScore, int newNetworkScore) {
        if (isValidScore(newJavaScore) && isValidScore(newDatabaseScore) && isValidScore(newNetworkScore)) {
            javaScore = newJavaScore;
            databaseScore = newDatabaseScore;
            networkScore = newNetworkScore;
            return true;
        }

        return false;
    }
}
