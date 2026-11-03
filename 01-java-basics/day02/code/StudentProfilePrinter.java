public class StudentProfilePrinter {
    public static void main(String[] args) {
        // 固定常量声明与初始化
        final String SCHOOL_NAME = "Example University";
        final String SYSTEM_NAME = "Campus Student Portal";
        final int REQUIRED_CREDITS = 120;

        // 学生信息变量声明与初始化
        String studentName = "Alice";
        String studentId = "20260001";
        int studentAge = 23;
        String major = "Computer Science";
        int completedCredits = 96;
        boolean isEnrolled = true;

        // 计算剩余学分
        int remainingCredits = REQUIRED_CREDITS - completedCredits;

        // 输出学生学籍信息
        System.out.print("===== Student Profile =====\n");
        System.out.print("School: " + SCHOOL_NAME + '\n');
        System.out.println("System: " + SYSTEM_NAME);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + studentAge);
        System.out.println("Major: " + major);
        System.out.println("Enrolled: " + isEnrolled);
        System.out.println("Completed Credits: " + completedCredits);
        System.out.println("Remaining Credits: " + remainingCredits);
        System.out.println("Profile Generated Successfully");
    }
}
