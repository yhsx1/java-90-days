public class ServerNode {
    // 声明实例字段
    String nodeId;
    double cpuUsage;
    boolean online;

    public static void main(String[] args) {
        // 创建并初始化两个服务器对象
        ServerNode node1 = new ServerNode();
        ServerNode node2 = new ServerNode();

        // 设置服务器信息
        node1.nodeId = "NODE-001";
        node1.cpuUsage = 35.5;
        node1.online = true;

        node2.nodeId = "NODE-002";
        node2.cpuUsage = 62.0;
        node2.online = false;

        // 输出服务器完整信息
        System.out.printf("Initial node1: %s, %.1f, %b%n", node1.nodeId, node1.cpuUsage, node1.online);
        System.out.printf("Initial node2: %s, %.1f, %b%n", node2.nodeId, node2.cpuUsage, node2.online);

        // 验证两个对象的引用关系
        System.out.printf("Same object: %b%n", node1 == node2);

        // 验证对象状态独立性
        node1.cpuUsage = 48.0;
        System.out.printf("Independent node1 CPU: %.1f%n", node1.cpuUsage);
        System.out.printf("Independent node2 CPU: %.1f%n", node2.cpuUsage);

        // 创建共享引用
        ServerNode selectedNode = node1;
        System.out.printf("Selected is node1: %b%n", selectedNode == node1);
        selectedNode.cpuUsage = 75.0;
        System.out.printf("Shared node1 CPU: %.1f%n", node1.cpuUsage);
        System.out.printf("Shared selected CPU: %.1f%n", selectedNode.cpuUsage);

        // 重新指定引用目标
        selectedNode = node2;
        System.out.printf("Selected is node2: %b%n", selectedNode == node2);
        selectedNode.cpuUsage = 20.5;
        selectedNode.online = true;

        // 输出两个服务器的最终信息
        System.out.printf("Final node1: %s, %.1f, %b%n", node1.nodeId, node1.cpuUsage, node1.online);
        System.out.printf("Final node2: %s, %.1f, %b%n", node2.nodeId, node2.cpuUsage, node2.online);

        // 解除共享引用
        selectedNode = null;

        // 空引用判断与剩余对象输出
        System.out.printf("Selected is null: %b%n", selectedNode == null);
        System.out.printf("Remaining node2: %s, %.1f, %b%n", node2.nodeId, node2.cpuUsage, node2.online);
    }
}
