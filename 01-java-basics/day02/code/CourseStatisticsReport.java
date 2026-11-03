public class CourseStatisticsReport {
    public static void main(String[] args) {
        // 固定配置常量声明与初始化
        final String SCHOOL_NAME = "Example University";
        final int REQUIRED_CREDITS = 120;
        final int COURSE_CREDITS = 4;

        // 定义学生与课程数据
        String studentName = "Alice";
        String studentId = "20260001";
        int studentAge = 23;
        String courseName = "Java Programming";
        char courseGrade = 'A';
        boolean isEnrolled = true;
        float attendanceRate = 96.5F;
        long platformVisits = 3000000000L;
        int completedCredits = 84;

        // 计算课程成绩
        int assignmentScore = 88;
        int examScore = 92;
        int projectScore = 95;
        int totalScore = assignmentScore + examScore + projectScore;
        double averageScore = (double) totalScore / 3;
        int scoreRemainder = totalScore % 3;

        // 计算学分进度
        int remainingCredits = REQUIRED_CREDITS - completedCredits;
        completedCredits += COURSE_CREDITS;

        // 输出学习统计报告
        System.out.print("===== Course Statistics Report =====\n");
        System.out.println("School: " + SCHOOL_NAME);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Course: " + courseName);
        System.out.println("Course Grade: " + courseGrade);
        System.out.println("Enrolled: " + isEnrolled);
        System.out.println("Attendance Rate: " + attendanceRate);
        System.out.println("Platform Visits: " + platformVisits);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Score Remainder: " + scoreRemainder);
        System.out.println("Remaining Credits: " + remainingCredits);
        System.out.println("Updated Completed Credits: " + completedCredits);
        System.out.print("Report Generated Successfully\n");
    }
}
