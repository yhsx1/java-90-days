public class LibraryNotice {
    public static void main(String[] args) {
        printWelcome();
        printRules();
        printSeparator();
        printRules();
        printClosing();
    }

    // 输出欢迎信息
    public static void printWelcome() {
        System.out.println("=== Library Open ===");
    }

    // 输出两条入馆规则
    public static void printRules() {
        System.out.println("Keep quiet.");
        System.out.println("No food allowed.");
    }

    // 输出分隔线
    public static void printSeparator() {
        System.out.println("--------------------");
    }

    // 输出闭馆提醒
    public static void printClosing() {
        System.out.println("=== Library Closed ===");
    }
}
