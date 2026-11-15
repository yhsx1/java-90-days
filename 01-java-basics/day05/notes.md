# Day 05 学习笔记

## 一、基本信息

- 学习日期：2026-11-13 至 2026-11-15
- 所属阶段：第一阶段，Java 基础与面向对象
- 学习主题：数组、一维数组遍历与索引
- 开发环境：Windows、JDK 21、IntelliJ IDEA
- 课程完成情况：4/4
- Java 编程练习：4 个
- 核心综合验收文件：ScoreStatistics.java
- 静态代码审查：64/64 适用项通过
- 业务测试：23/23 通过
- 最终验收结果：全部通过

## 二、Java 一维数组基础

### 2.1 为什么需要数组

普通变量只能保存一个指定类型的值。

例如：

```java
int stock1 = 20;
int stock2 = 35;
int stock3 = 15;
```

如果存在大量同类型数据，使用单独变量管理不够方便。

可以使用一维数组：

```java
int[] stocks = {20, 35, 15};
```

数组能够将多个相同类型的数据组织到一起，通过索引访问和处理。

### 2.2 数组的主要特点

- 数组属于引用类型。
- 数组对象创建后长度固定。
- 数组元素具有统一的数据类型。
- 数组索引从 0 开始。
- 可以通过索引访问数组元素。
- 数组元素可以修改。
- 数组具有 length 属性。
- 非法索引访问会导致数组越界异常。

### 2.3 数组声明

推荐语法：

```java
数据类型[] 数组变量名;
```

例如：

```java
int[] numbers;
double[] prices;
String[] names;
```

只声明局部数组变量不会自动创建数组对象。

### 2.4 数组创建

使用 new 创建数组：

```java
int[] numbers = new int[5];
```

此处的 5 表示数组长度。

创建完成后，数组包含五个整数元素，索引分别为 0–4。

### 2.5 静态初始化

已知数据时，可以直接初始化：

```java
int[] numbers = {10, 20, 30};
```

也可以使用：

```java
int[] numbers = new int[]{10, 20, 30};
```

数组长度由元素数量决定。

### 2.6 动态初始化

根据指定长度创建数组：

```java
int[] numbers = new int[3];
```

数组创建完成后，int 元素默认初始化为 0。

常见数组元素默认值：

| 类型 | 默认值 |
|---|---|
| int | 0 |
| long | 0 |
| double | 0.0 |
| boolean | false |
| char | '\u0000' |
| String | null |

注意，普通局部变量不会自动获得上述默认值。

### 2.7 数组与普通变量

```java
int age = 18;
```

age 是 int 类型变量。

```java
int[] ages = {18, 20, 22};
```

ages 是 int[] 类型引用变量，引用一个数组对象。

数组可以保存多个 int 元素，而普通 int 变量只能直接保存一个整数值。

## 三、数组索引与 length

### 3.1 数组索引

对于：

```java
int[] numbers = {10, 20, 30};
```

可以通过：

```java
numbers[0]
numbers[1]
numbers[2]
```

访问数组元素。

其中：

- numbers[0] 为 10。
- numbers[1] 为 20。
- numbers[2] 为 30。

### 3.2 length 属性

```java
int[] numbers = {10, 20, 30};

System.out.println(numbers.length);
```

输出：

```text
3
```

数组使用 length 属性，而不是 length() 方法。

### 3.3 合法索引范围

对于非空数组：

```text
0 <= index < array.length
```

第一个元素的索引为 0。

最后一个元素的索引为：

```java
array.length - 1
```

例如：

```java
int[] numbers = {10, 20, 30};

System.out.println(numbers[numbers.length - 1]);
```

输出：

```text
30
```

### 3.4 数组索引越界

下面代码存在越界问题：

```java
int[] numbers = {10, 20, 30};

System.out.println(numbers[3]);
```

数组长度为 3，合法索引为 0–2。

访问索引 3 会发生：

```text
ArrayIndexOutOfBoundsException
```

可以通过条件检查防止非法访问：

```java
if (index >= 0 && index < numbers.length) {
    System.out.println(numbers[index]);
} else {
    System.out.println("Invalid index");
}
```

### 3.5 数组元素修改

数组长度固定，但元素内容可以修改。

```java
int[] scores = {70, 80, 90};

scores[1] = 95;
```

修改后：

```text
70, 95, 90
```

也可以进行复合赋值：

```java
scores[0] += 10;
```

此时第一个元素由 70 变为 80。

### 3.6 业务编号与数组索引

业务编号可能从 1 开始，而数组索引从 0 开始。

例如：

```text
商品编号 1 -> 数组索引 0
商品编号 2 -> 数组索引 1
商品编号 3 -> 数组索引 2
```

转换关系：

```java
int index = productId - 1;
```

访问前应验证：

```java
index >= 0 && index < stocks.length
```

## 四、一维数组遍历

### 4.1 for 循环遍历

```java
int[] numbers = {10, 20, 30};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

输出：

```text
10
20
30
```

遍历时应特别注意：

```java
i < numbers.length
```

不能错误地写成：

```java
i <= numbers.length
```

否则循环可能访问不存在的末尾索引。

### 4.2 while 循环遍历

```java
int[] numbers = {10, 20, 30};

int index = 0;

while (index < numbers.length) {
    System.out.println(numbers[index]);
    index++;
}
```

for 和 while 都可以遍历数组。

对于已知数组长度、按照索引顺序依次访问的场景，普通 for 循环更为直观。

### 4.3 Scanner 输入数组

```java
Scanner scanner = new Scanner(System.in);

int[] numbers = new int[3];

for (int i = 0; i < numbers.length; i++) {
    numbers[i] = scanner.nextInt();
}
```

每轮循环将输入保存到不同的数组元素。

如果数组长度来自用户输入，应先验证长度是否合法，再创建数组。

### 4.4 整数输入检查

使用：

```java
scanner.hasNextInt()
```

可以判断下一个输入是否能够作为 int 读取。

例如：

```java
if (scanner.hasNextInt()) {
    int number = scanner.nextInt();
} else {
    System.out.println("Invalid integer");
}
```

此方式可以避免直接对非整数输入调用 nextInt()。

### 4.5 非法输入终止

读取数组时，如果遇到非法输入，应当根据业务要求退出当前输入循环。

```java
boolean valid = true;

if (!scanner.hasNextInt()) {
    valid = false;
    System.out.println("Invalid input");
}
```

在循环内可以配合 break：

```java
break;
```

随后利用 valid 判断是否允许继续进行统计。

这样能够防止部分有效、部分无效的数据进入最终业务结果。

## 五、数组累加统计

### 5.1 累加变量

例如：

```java
int[] sales = {10, 20, 30};

int total = 0;

for (int i = 0; i < sales.length; i++) {
    total += sales[i];
}
```

最终：

```text
total = 60
```

### 5.2 为什么初始化为 0

0 是加法单位元。

累加变量初始化为 0，可以避免额外引入不属于数组的值。

### 5.3 根据数组长度统计数据数量

```java
int count = sales.length;
```

使用 length 可以避免将数据数量写死。

### 5.4 输入与统计分离

可以使用两个 for 循环：

第一个循环负责输入：

```java
sales[i] = scanner.nextInt();
```

第二个循环负责处理：

```java
total += sales[i];
```

这种结构便于阅读和检查数据处理流程。

## 六、数组最大值与最小值

### 6.1 最大值初始化

对于非空数组：

```java
int maxScore = scores[0];
```

使用真实的第一个元素初始化，避免采用不合理的固定值。

### 6.2 最大值更新

```java
if (scores[i] > maxScore) {
    maxScore = scores[i];
}
```

如果当前元素更大，则更新最大值。

### 6.3 最小值初始化

```java
int minScore = scores[0];
```

### 6.4 最小值更新

```java
if (scores[i] < minScore) {
    minScore = scores[i];
}
```

### 6.5 一次遍历计算极值

可以在同一个循环中分别执行最大值和最小值判断。

如果数组所有元素相同，则最大值和最小值也相同。

如果最高值在第一个或最后一个元素，正常的完整遍历都应正确识别。

### 6.6 非空数组前提

使用 scores[0] 初始化极值，必须确保数组长度至少为 1。

Day 05 综合程序通过检查学生人数处于 1–30，保证这一前提成立。

## 七、平均值计算与精度

### 7.1 平均值公式

```text
average = total / count
```

### 7.2 整数除法问题

```java
int total = 341;
int count = 4;

double average = total / count;
```

实际得到：

```text
85.0
```

原因是两个 int 参与除法，先执行整数除法，小数部分丢失。

### 7.3 正确计算方式

```java
double average = (double) total / count;
```

结果：

```text
85.25
```

也可以写成：

```java
double average = total * 1.0 / count;
```

### 7.4 保留两位小数

```java
System.out.printf("Average score: %.2f%n", average);
```

例如：

```text
Average score: 85.25
```

整数平均分也应按要求显示两位小数：

```text
Average score: 80.00
```

## 八、Java 数组与 Python list 对比

| 对比内容 | Java 数组 | Python list |
|---|---|---|
| 索引起点 | 0 | 0 |
| 获取长度 | array.length | len(array) |
| 元素类型 | 固定 | 可以混合 |
| 长度 | 创建后固定 | 可以动态变化 |
| 元素修改 | 支持 | 支持 |
| 负数索引 | 不支持 | 支持 |
| 越界异常 | ArrayIndexOutOfBoundsException | IndexError |

Java 数组适合长度已确定、元素类型统一的数据处理。

Python list 的使用方式更灵活，但不能直接将 Python 中的负数索引习惯用于 Java 数组。

## 九、Day 05 四个 Java 程序最终代码

### 9.1 WarehouseStock.java

文件路径：

`01-java-basics/day05/code/WarehouseStock.java`

```java
public class WarehouseStock {
    public static void main(String[] args) {
        // 输出程序标题
        System.out.println("=== Warehouse Stock ===");

        // 初始化库存数组
        int[] stocks = {120, 85, 200, 60};

        // 获取仓位数量并输出
        int slotCount = stocks.length;
        System.out.printf("Slot count: %d%n", slotCount);

        // 使用索引逐个输出仓位库存
        System.out.printf("Slot 1: %d%n", stocks[0]);
        System.out.printf("Slot 2: %d%n", stocks[1]);
        System.out.printf("Slot 3: %d%n", stocks[2]);
        System.out.printf("Slot 4: %d%n", stocks[3]);

        // 输出首尾仓位库存
        System.out.printf("First slot stock: %d%n", stocks[0]);
        System.out.printf("Last slot stock: %d%n", stocks[slotCount - 1]);
    }
}
```

标准运行输出：

```text
=== Warehouse Stock ===
Slot count: 4
Slot 1: 120
Slot 2: 85
Slot 3: 200
Slot 4: 60
First slot stock: 120
Last slot stock: 60
```

正式验收：14/14 适用静态审查项通过，1/1 必要业务测试通过。

### 9.2 InventoryUpdate.java

文件路径：

`01-java-basics/day05/code/InventoryUpdate.java`

以下源码保留最终针对性复验时的参数，用于展示非法上限输入的处理结果。

```java
public class InventoryUpdate {
    public static void main(String[] args) {
        // 输出程序标题
        System.out.println("=== Inventory Update ===");

        // 初始化商品库存
        int[] stocks = {50, 80, 120, 60};

        // 设置入库信息
        int productId = 2;
        int addQuantity = 1001;

        if (productId - 1 >= 0 && productId - 1 < stocks.length
                && addQuantity >= 0 && addQuantity <= 1000) {
            // 输出指定商品编号以及更新前库存
            System.out.printf("Product ID: %d%n", productId);
            System.out.printf("Before stock: %d%n", stocks[productId - 1]);

            // 更新指定商品库存
            stocks[productId - 1] += addQuantity;
            System.out.printf("After stock: %d%n", stocks[productId - 1]);
        } else {
            System.out.println("Invalid update");
        }
    }
}
```

最后一次针对性测试：

```text
=== Inventory Update ===
Invalid update
```

正常业务测试中：

```text
productId = 2
addQuantity = 30
```

统计结果：

```text
=== Inventory Update ===
Product ID: 2
Before stock: 80
After stock: 110
```

正式验收：14/14 静态审查项通过，5/5 业务测试通过。

### 9.3 DailySalesSummary.java

文件路径：

`01-java-basics/day05/code/DailySalesSummary.java`

```java
import java.util.Scanner;

public class DailySalesSummary {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 读取销售天数
        System.out.print("Enter day count: ");
        if (scanner.hasNextInt()) {
            int dayCount = scanner.nextInt();

            if (dayCount >= 1 && dayCount <= 7) {
                // 创建销量数组
                int[] sales = new int[dayCount];

                // 读取每天销量
                boolean saleValid = true;
                for (int i = 0; i < dayCount; i++) {
                    System.out.printf("Enter sales for day %d: ", i + 1);
                    if (scanner.hasNextInt()) {
                        int sale = scanner.nextInt();

                        if (sale < 0 || sale > 1000) {
                            saleValid = false;
                            System.out.println("Invalid sales");
                            break;
                        } else {
                            sales[i] = sale;
                        }
                    } else {
                        saleValid = false;
                        System.out.println("Invalid sales");
                        break;
                    }
                }

                // 统计总销量
                if (saleValid) {
                    int totalSales = 0;

                    for (int i = 0; i < dayCount; i++) {
                        totalSales += sales[i];
                    }

                    // 输出统计信息
                    System.out.println("=== Daily Sales Summary ===");
                    System.out.printf("Day count: %d%n", dayCount);
                    System.out.printf("Total sales: %d%n", totalSales);
                }
            } else {
                System.out.println("Invalid day count");
            }
        } else {
            System.out.println("Invalid day count");
        }
    }
}
```

正常输入：

```text
3
10
20
30
```

统计输出：

```text
=== Daily Sales Summary ===
Day count: 3
Total sales: 60
```

非法非整数销量测试：

```text
Enter day count: 3
Enter sales for day 1: abc
Invalid sales
```

正式验收：16/16 静态审查项通过，7/7 业务测试通过。

### 9.4 ScoreStatistics.java

文件路径：

`01-java-basics/day05/code/ScoreStatistics.java`

```java
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
                    } else {
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
```

正常输入：

```text
4
85
92
76
88
```

统计输出：

```text
=== Score Statistics ===
Student count: 4
Highest score: 92
Lowest score: 76
Average score: 85.25
```

非法人数示例：

```text
Enter student count: 0
Invalid student count
```

非整数成绩示例：

```text
Enter student count: 2
Enter score for student 1: abc
Invalid score
```

正式验收：CR01–CR20 全部通过，TC01–TC10 全部通过。

## 十、实际错误与修复经验

### 10.1 D05-S01：测试策略调整

WarehouseStock.java 仅使用固定数组展示库存，不涉及用户输入和条件分支。

最终将业务测试精简为一组标准数据测试。

保留必要的静态审查，不为了增加测试数量而重复修改固定数据。

### 10.2 D05-S02：入库数量上限遗漏

首次提交的条件只判断：

```java
addQuantity >= 0
```

无法阻止 1001 等超过允许上限的数据。

修复后同时判断：

```java
addQuantity >= 0 && addQuantity <= 1000
```

并完成超过上限的针对性业务测试。

经验：

对于明确的闭区间业务要求，必须同时检查下界和上界。

### 10.3 D05-S03：类名不匹配

首次提交使用：

```java
public class DailySaleSummary
```

与正式文件名 DailySalesSummary.java 不一致。

修改后：

```java
public class DailySalesSummary
```

经验：

Java public 类名必须与源文件名保持一致。

### 10.4 D05-S03：非整数销量没有立即终止

首次提交在非整数分支中设置 saleValid 为 false 并输出错误提示，但缺少 break。

修改后补充：

```java
break;
```

保证非法输入时立即停止销量录入。

针对性 TC07 通过。

经验：

设置错误状态并不自动终止循环；需要根据业务要求明确控制循环退出。

### 10.5 D05-S04：非法人数提示大小写

首次提交：

```text
invalid student count
```

正式要求：

```text
Invalid student count
```

修改后统一两个错误处理分支的输出格式。

重新执行 TC07 和 TC08，两组测试均通过。

经验：

业务逻辑正确不代表输出格式一定正确。正式测试还应关注大小写、空格、换行及小数位数。

### 10.6 平均分精度

使用：

```java
double average = (double) total / studentCount;
```

避免了整数除法截断小数的问题。

使用：

```java
System.out.printf("Average score: %.2f%n", average);
```

统一平均分输出格式。

### 10.7 验收流程优化

从 Day 05 起，采用以下规则：

- 不要求提交独立编译终端证据。
- 仍然检查明显语法错误。
- 测试数量根据业务复杂度确定。
- 仅对实际存在的分支、边界和风险安排必要测试。
- 修改后保留未受影响的历史通过项。
- 针对受到修改影响的代码进行局部复验。
- 不将未提供的测试证据视为已经执行。

## 十一、后端开发应用场景

本日数组知识可以应用于：

- 固定数量的服务器请求量统计。
- 多个设备的温度数据处理。
- 多个时间段的销售数据汇总。
- 固定长度的成绩数据管理。
- 简单的库存批量读取与修改。
- 业务输入范围校验。
- 通过遍历查找最大值与最小值。
- 批量计算数值总和与平均值。

后续会进一步学习方法封装、面向对象、集合与数据库，将这些基础数据处理能力组合成更完整的后端程序。

## 十二、Day 05 最终总结

已完成四个独立 Java 程序：

1. WarehouseStock.java
2. InventoryUpdate.java
3. DailySalesSummary.java
4. ScoreStatistics.java

验收结果：

| 项目 | 结果 |
|---|---|
| 课程验收 | 4/4 |
| Java 编程练习 | 4/4 |
| 静态代码审查 | 64/64 |
| 正式业务测试 | 23/23 |
| 综合程序 | ScoreStatistics.java |
| 综合审查 | 20/20 |
| 综合测试 | 10/10 |
| Markdown 归档 | 完成 |
| Git 归档 | 完成 |

Day 05 已完成一维数组的创建、访问、修改、遍历、输入、累加、极值与平均值统计。

累计学习进度：5/90 天。

下一学习日：Day 06。

学习主题：Java 方法定义、参数、返回值和方法重载。

核心练习：Calculator.java。