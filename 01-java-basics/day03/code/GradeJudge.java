import java.util.Scanner;

public class GradeJudge {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 读取成绩
        System.out.print("Enter student score: ");
        double score = scanner.nextDouble();

        // 成绩等级评定
        char grade = ' ';
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
        }

        // 等级说明评定
        String gradeDescription = "";
        switch (grade) {
            case 'A':
                gradeDescription = "Excellent";
                break;
            case 'B':
                gradeDescription = "Good";
                break;
            case 'C':
                gradeDescription = "Average";
                break;
            case 'D':
                gradeDescription = "Pass";
                break;
            case 'F':
                gradeDescription = "Fail";
                break;
            default:
        }

        // 输出评定结果
        if (score >= 0 && score <= 100) {
            System.out.println("Grade: " + grade);
            System.out.println("Description: " + gradeDescription);
        }
    }
}
