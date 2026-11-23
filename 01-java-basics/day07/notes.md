# Day 07 学习笔记

## 一、基本信息

- 所属阶段：第一阶段，Java 基础与面向对象
- 学习日期：2026-11-20 至 2026-11-23
- 学习主题：第一周综合复习与考核
- 工作目录：`01-java-basics/day07/`
- Java 版本：Eclipse Temurin 21
- IDE：IntelliJ IDEA
- 已完成课程：4/4
- 已完成 Java 程序：4/4
- 静态审查：81/81 通过
- 正式业务测试：25/25 通过
- 核心综合程序：StudentGradeAnalyzer.java
- 全日结果：正式验收通过
- Markdown 归档：完成
- Git 归档：完成

## 二、Java 基础知识综合运用

### 2.1 第一周学习内容回顾

Day 01–06 已完成以下内容：

| 学习日 | 主要知识 |
|---|---|
| Day 01 | Java 开发环境、类、main、输出 |
| Day 02 | 基本数据类型、变量、常量、输入输出 |
| Day 03 | 运算符、if/else、switch |
| Day 04 | for、while、break、continue |
| Day 05 | 数组、一维数组遍历、索引 |
| Day 06 | 方法定义、参数、返回值、方法重载 |

Day 07 的主要目标是将上述知识组合成完整业务程序，而不是重复编写单一语法练习。

综合程序通常需要完成：

1. 读取用户输入。
2. 判断输入是否合法。
3. 保存合法数据。
4. 根据业务规则处理数据。
5. 调用多个方法完成统计。
6. 获取计算结果。
7. 使用规定格式统一输出。
8. 通过真实测试验证程序。

### 2.2 Java 类与 main 方法

当前阶段主要使用类组织程序，通过 main 方法作为程序入口。

基本结构：

```java
public class ProgramName {
    public static void main(String[] args) {
        // 主程序
    }
}
```

main 主要负责程序执行顺序，不应该承担所有重复的业务计算逻辑。

当程序存在可复用的业务功能时，应该将其定义为独立方法。

### 2.3 变量、数据类型与统计状态

常用类型：

- int：学生人数、工单数量、成绩、积分。
- double：平均成绩、平均耗时、百分比。
- boolean：输入合法性或业务条件。
- String：提示信息、业务等级、输出标签。
- int[]：多个整数数据。

计数器用于记录次数：

```java
int count = 0;
count++;
```

累加器用于累计数据：

```java
int total = 0;
total += value;
```

计数器和累加器都必须在合法业务数据确认后更新。

### 2.4 条件判断与业务规则

if/else 可以表达业务规则。

例如：

```java
if (score >= 90) {
    System.out.println("Excellent");
} else if (score >= 60) {
    System.out.println("Passed");
} else {
    System.out.println("Failed");
}
```

编写条件判断时，需要重点检查：

- 分支顺序。
- 边界是否包含。
- 条件是否重复。
- 是否存在没有覆盖的合法情况。
- 非法数据是否会误入合法分支。

### 2.5 循环与状态更新

for 适合处理已知数量的数据。

例如：

```java
for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}
```

while 适合持续执行，直到满足结束条件。

例如：

```java
while (true) {
    // 持续读取输入
}
```

break 用于结束当前循环。

continue 用于跳过本轮剩余语句。

对于输入重试，continue 可以让程序重新开始当前输入检查。

对于有效记录统计，不应在非法输入尚未通过验证时增加记录数量。

## 三、数组与统计处理

### 3.1 数组的作用

数组用于保存同一类型的多个元素。

例如：

```java
int[] scores = {59, 60, 89, 90, 100};
```

数组长度通过 length 获取：

```java
int count = scores.length;
```

数组的有效索引范围是：

```text
0 至 scores.length - 1
```

### 3.2 动态创建数组

当学生人数需要由用户输入时，可以使用：

```java
int[] scores = new int[studentCount];
```

数组长度根据合法人数动态确定。

必须先确认 studentCount 合法，才能创建满足业务需求的数组。

### 3.3 使用循环填充数组

可以通过普通 for 循环依次填入元素：

```java
for (int i = 0; i < scores.length; i++) {
    scores[i] = i * 10;
}
```

本日的正式练习还要求通过 Scanner 读取真实输入数据，而不是使用硬编码数组代替业务输入。

### 3.4 数组遍历方式

普通 for：

```java
for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}
```

增强 for：

```java
for (int score : scores) {
    System.out.println(score);
}
```

普通 for 更适合需要使用下标的场景。

增强 for 更适合只读取各元素、不需要下标的统计场景。

### 3.5 数组总和

计算总和时，先初始化累加器：

```java
int total = 0;
```

然后遍历元素进行累加。

总和计算应放在独立方法中，以便其他方法复用。

### 3.6 数组最大值与最小值

在已经确认数组非空时，可以使用第一个元素初始化最大值：

```java
int highest = scores[0];
```

最低值：

```java
int lowest = scores[0];
```

随后遍历数组，不断更新结果。

不建议在一般业务统计中直接将最大值初始化为 0，因为这种做法依赖数据范围，无法适用于所有整数数组。

本日学生人数和请求数量均保证至少为 1，因此首元素初始化是安全的。

### 3.7 数组平均值

平均值公式：

$$
\text{Average} = \frac{\text{Total}}{\text{Count}}
$$

需要注意整数除法。

错误示例：

```java
double average = 5 / 2;
```

结果为 2.0。

正确示例：

```java
double average = (double) 5 / 2;
```

结果为 2.5。

本日要求平均值方法调用总和方法，而不是重复编写一套相同的求和循环。

### 3.8 参数化阈值计数

假设需要统计：

- 成绩大于等于 60 的人数。
- 成绩大于等于 90 的人数。

两项业务的核心逻辑相同，仅阈值不同。

因此可以通过参数控制：

```java
int passed = countAtLeast(scores, 60);
int excellent = countAtLeast(scores, 90);
```

该方式实现了方法复用，避免定义两套重复的数组遍历逻辑。

## 四、Scanner 输入校验与业务流程

### 4.1 直接使用 nextInt 的局限

Scanner.nextInt() 用于读取整数。

例如：

```java
int number = scanner.nextInt();
```

如果下一个输入为普通字符串，nextInt 不能把它转换为整数。

因此需要在读取前进行类型检查。

本日不提前使用 Day 18 才正式学习的异常处理机制。

### 4.2 hasNextInt 的作用

```java
scanner.hasNextInt()
```

用于判断下一个 token 是否能够被读取为 int。

返回 boolean 结果。

hasNextInt 本身不会消耗该 token。

因此，检查通过后仍需要调用 nextInt 读取数值。

### 4.3 next 消耗非法输入

如果用户输入：

```text
abc
```

hasNextInt 返回 false。

如果没有消耗这个 token，下一轮循环可能重复遇到同一个错误输入。

因此可以使用：

```java
scanner.next();
```

消耗非法 token。

### 4.4 区分类型错误和范围错误

非整数输入：

```text
abc
oops
2.5
```

整数但超出范围：

```text
-1
101
```

二者应当分别处理。

类型错误时，应消耗非法 token。

范围错误时，整数已经由 nextInt 消耗，可以直接提示后重试。

### 4.5 while 与 continue 实现输入重试

基本结构：

```java
while (true) {
    System.out.print(prompt);

    if (!scanner.hasNextInt()) {
        scanner.next();
        System.out.println("Invalid integer input.");
        continue;
    }

    int value = scanner.nextInt();

    if (value < min || value > max) {
        System.out.println("Value out of range.");
        continue;
    }

    return value;
}
```

执行逻辑：

1. 显示输入提示。
2. 检查输入类型。
3. 类型错误时消耗 token。
4. 输出错误提示。
5. 使用 continue 重新输入。
6. 类型正确时读取整数。
7. 检查范围。
8. 范围错误时继续重试。
9. 输入合法时返回整数。

这段逻辑已经在 D07-S03 和 D07-S04 中实际应用。

### 4.6 输入错误不占用有效记录名额

假设系统需要读取三条有效访问记录：

```text
1
oops
3
2
```

其中 oops 是非法输入。

最终应统计三条有效记录：

```text
1
3
2
```

非法输入不能被视为一条有效记录。

正确结构是：

- 外层循环管理有效记录数量。
- 输入方法内部循环管理当前记录的重试。
- 只有输入方法返回合法结果后，外层循环才继续下一条记录。

### 4.7 输入方法复用

一个通用整数读取方法可以接收：

- Scanner scanner
- String prompt
- int min
- int max

通过参数指定不同的提示信息和合法范围。

例如：

```java
int count = readBoundedInt(scanner, "Enter count: ", 1, 10);
```

同一个方法也可以用于读取其他业务整数。

这使类型判断、范围判断和错误恢复保持统一。

### 4.8 当前阶段的输入处理边界

D07-S03 和 D07-S04 的正式测试均提供足够输入。

当前实现主要针对：

- 非整数 token。
- 超范围整数。
- 持续重试。
- 合法业务数据统计。

对于输入流结束、文件 EOF 和异常捕获，后续课程再系统学习。

## 五、方法定义、参数与返回值综合

### 5.1 方法职责划分

完整业务程序可以分为三个部分：

1. 输入处理。
2. 业务计算。
3. 结果输出。

例如：

- readBoundedInt 负责输入验证。
- calculateTotal 负责求和。
- main 负责组织调用和输出。

这样的职责划分使程序更容易阅读、测试和维护。

### 5.2 方法参数

方法可以接收不同类型的参数：

```java
public static int calculatePoints(int code) {
    return code * 2;
}
```

调用时：

```java
int points = calculatePoints(3);
```

也可以接收数组：

```java
public static int calculateTotal(int[] values)
```

### 5.3 数组参数传递

Java 始终按值传递参数。

对于数组，方法接收的是数组引用值的副本。

因此，方法能够通过参数读取调用方数组对象的元素。

统计方法应当只读取数据，不修改原始数组。

### 5.4 返回基本类型

常见返回类型包括：

- int
- double
- boolean

例如：

```java
public static boolean isValid(int value) {
    return value >= 0;
}
```

### 5.5 返回 String

当方法需要返回业务等级时，可以使用 String：

```java
public static String getStatus(int value) {
    if (value > 0) {
        return "ACTIVE";
    }

    return "INACTIVE";
}
```

本日工单负载等级和门禁风险等级都使用了 String 返回值。

### 5.6 返回数组

Java 方法可以返回 int[]。

例如：

```java
public static int[] createValues(int count) {
    return new int[count];
}
```

D07-S04 的 readScores 方法不仅创建数组，还负责读取全部有效成绩，最后将完整数组返回 main。

### 5.7 方法之间的调用

方法可以调用其他方法。

本日典型例子：

```java
public static double calculateAverage(int[] scores) {
    return (double) calculateTotal(scores) / scores.length;
}
```

calculateAverage 不再重复求和逻辑，而是直接复用 calculateTotal。

### 5.8 main 保存方法返回值

正式程序需要将计算结果保存到局部变量。

例如：

```java
int total = calculateTotal(scores);
double average = calculateAverage(scores);
```

然后统一输出：

```java
System.out.printf("Total: %d%n", total);
System.out.printf("Average: %.2f%n", average);
```

这样更容易区分计算和展示过程，也符合 D07-S02、D07-S04 的正式结构要求。

## 六、浮点数、阈值与百分比

### 6.1 整数除法

两个 int 相除时，结果会按整数除法计算。

例如：

```java
double result = 7 / 2;
```

结果为 3.0，而不是 3.5。

应明确引入浮点数运算：

```java
double result = (double) 7 / 2;
```

### 6.2 平均分计算

平均分：

$$
\text{Average} = \frac{\text{Total Score}}{\text{Student Count}}
$$

本日通过 double 计算平均分，并使用 printf 输出两位小数。

### 6.3 及格人数与优秀人数

本日规定：

- 成绩大于等于 60 为及格。
- 成绩大于等于 90 为优秀。

边界值 60 和 90 都应计入对应统计。

优秀学生同时属于及格学生。

### 6.4 及格率公式

$$
\text{Pass Rate} = \frac{\text{Passed Count}}{\text{Student Count}} \times 100
$$

例如：

$$
\frac{2}{3}\times100=66.666\ldots
$$

最终输出：

```text
66.67%
```

### 6.5 比例值与百分比数值

比例值：

```text
0.666666...
```

百分比数值：

```text
66.666666...
```

两者并不相同。

D07-S04 要求 calculatePassRate 方法直接返回百分比数值，而不是将比例值交给 main 再转换。

### 6.6 printf 小数格式

```java
System.out.printf("%.2f%n", value);
```

表示保留两位小数。

输出百分号时：

```java
System.out.printf("%.2f%%%n", value);
```

其中：

- %.2f：格式化 double。
- %%：输出百分号。
- %n：输出换行。

### 6.7 方法职责与计算语义

方法不仅需要返回类型正确，还需要返回符合业务定义的数值。

例如，名为 calculatePassRate 的方法如果约定返回百分比，那么调用方应直接获得百分比数值。

不应让方法返回比例，再由 main 承担业务换算。

## 七、第一周综合程序的组织方式

### 7.1 工单工作量分析器

TicketLoadAnalyzer.java 主要练习：

- 业务合法性判断。
- while 持续输入。
- break 终止。
- 计数和积分累计。
- 多个方法拆分业务规则。
- String 等级返回值。

### 7.2 API 请求耗时分析器

ApiLatencyAnalyzer.java 主要练习：

- 动态数组。
- 数组参数。
- 数组遍历。
- 总和与极值。
- 平均值。
- 参数化阈值统计。
- 方法复用。
- 返回值保存。

### 7.3 门禁访问记录审核器

AccessLogAuditor.java 主要练习：

- Scanner 输入检查。
- 非法 token 消耗。
- 范围判断。
- 错误重试。
- 通用方法复用。
- 有效记录计数。
- 业务风险计算。

### 7.4 学生成绩统计器

StudentGradeAnalyzer.java 是最终综合程序。

它整合前三节的能力：

- 输入验证。
- 动态数组。
- 数组返回值。
- 多个统计方法。
- 方法复用。
- 浮点数平均值。
- 阈值计数。
- 百分比计算。
- 统一输出。
- 多场景测试。

### 7.5 相比 Day 05 的提升

Day 05 的 ScoreStatistics.java 主要围绕数组的基础使用开展训练。

Day 07 的 StudentGradeAnalyzer.java 在此基础上增加了：

- 独立输入方法。
- 错误重试。
- 数组读取方法。
- 数组返回值。
- 多个独立统计方法。
- 方法参数化复用。
- 明确的计算和输出职责。
- 及格与优秀人数统计。
- 百分比计算。
- 更完整的边界与非法输入测试。

因此 Day 07 是第一周知识的综合考核，而不是 Day 05 的简单重复。

## 八、Java 与 Python 的对比

### 8.1 基础变量

Python：

```python
count = 5
average = 79.6
```

Java：

```java
int count = 5;
double average = 79.6;
```

Java 变量需要明确声明类型。

### 8.2 数组与列表

Python：

```python
scores = [60, 90, 100]
```

Java：

```java
int[] scores = {60, 90, 100};
```

Java 数组长度固定，元素具有统一类型。

### 8.3 函数与方法

Python：

```python
def add(a, b):
    return a + b
```

Java：

```java
public static int add(int a, int b) {
    return a + b;
}
```

Java 方法需要声明参数类型和返回类型。

### 8.4 循环

Python：

```python
for score in scores:
    print(score)
```

Java：

```java
for (int score : scores) {
    System.out.println(score);
}
```

### 8.5 输入类型检查

Python 通常使用 input 读取字符串，再进行类型转换。

Java Scanner 可以使用：

```java
scanner.hasNextInt()
```

预先判断下一个 token 是否能够读取为 int。

### 8.6 格式化输出

Python：

```python
print(f"{average:.2f}")
```

Java：

```java
System.out.printf("%.2f%n", average);
```

两种语言都可以实现两位小数输出，但具体语法不同。

## 九、最终验收通过的 Java 源码

以下四个程序均为 Day 07 最终正式验收通过的版本。

保留原有业务逻辑、方法签名、变量名称和输出内容。

### 9.1 TicketLoadAnalyzer.java

文件路径：

`01-java-basics/day07/code/TicketLoadAnalyzer.java`

```java
import java.util.Scanner;

public class TicketLoadAnalyzer {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 初始化统计变量
        int validTicket = 0;
        int urgentTicket = 0;
        int totalPoints = 0;

        // 循环统计
        int priority;
        while (true) {
            System.out.print("Enter ticket priority (1-3, 0 to finish): ");
            priority = scanner.nextInt();

            if (priority != 0) {
                if (isValidPriority(priority)) {
                    validTicket++;
                    totalPoints += calculatePriorityPoints(priority);

                    if (priority == 3) {
                        urgentTicket++;
                    }
                } else {
                    System.out.println("Invalid priority.");
                }
            } else {
                break;
            }
        }

        // 计算负载等级
        String loadLevel = determineLoadLevel(totalPoints);

        // 输出统计结果
        System.out.printf("Valid tickets: %d%n", validTicket);
        System.out.printf("Urgent tickets: %d%n", urgentTicket);
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Load level: %s%n", loadLevel);
    }

    // 优先级合法性判断
    public static boolean isValidPriority(int priority) {
        return priority >= 1 && priority <= 3;
    }

    // 合法优先级转换为对应积分
    public static int calculatePriorityPoints(int priority) {
        if (priority == 1) {
            return 1;
        } else if (priority == 2) {
            return 3;
        } else {
            return 5;
        }
    }

    // 计算工作负载等级
    public static String determineLoadLevel(int totalPoints) {
        if (totalPoints == 0) {
            return "NONE";
        } else if (totalPoints >= 1 && totalPoints <= 4) {
            return "LOW";
        } else if (totalPoints >= 5 && totalPoints <= 9) {
            return "MEDIUM";
        } else {
            return "HIGH";
        }
    }
}
```

正式验收结果：

- CR01–CR16：16/16。
- TC01–TC06：6/6。
- 阻断性问题：0。

已记录的混合工单运行输出：

```text
Enter ticket priority (1-3, 0 to finish): 1
Enter ticket priority (1-3, 0 to finish): 2
Enter ticket priority (1-3, 0 to finish): 3
Enter ticket priority (1-3, 0 to finish): 0
Valid tickets: 3
Urgent tickets: 1
Total points: 9
Load level: MEDIUM
```

已记录的非法优先级运行输出：

```text
Enter ticket priority (1-3, 0 to finish): -1
Invalid priority.
Enter ticket priority (1-3, 0 to finish): 4
Invalid priority.
Enter ticket priority (1-3, 0 to finish): 2
Enter ticket priority (1-3, 0 to finish): 0
Valid tickets: 1
Urgent tickets: 0
Total points: 3
Load level: LOW
```

### 9.2 ApiLatencyAnalyzer.java

文件路径：

`01-java-basics/day07/code/ApiLatencyAnalyzer.java`

```java
import java.util.Scanner;

public class ApiLatencyAnalyzer {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 请求耗时阈值
        final int threshold = 200;

        // 获取请求数量
        System.out.print("Enter request count (1-8): ");
        int count = scanner.nextInt();

        // 请求数量合法性判断并创建请求耗时数组
        if (count >= 1 && count <= 8) {
            int duration;
            boolean durationValid = true;
            int[] durations = new int[count];

            // 获取请求耗时
            for (int i = 0; i < count; i++) {
                System.out.printf("Enter duration for request %d (0-10000 ms): ", i + 1);
                duration = scanner.nextInt();

                if (duration >= 0 && duration <= 10000) {
                    durations[i] = duration;
                } else {
                    durationValid = false;
                    System.out.println("Invalid duration");
                    break;
                }
            }

            // 统计信息计算与输出
            if (durationValid) {
                int totalDuration = calculateTotal(durations);
                int maxDuration = findMax(durations);
                int minDuration = findMin(durations);
                double averageDuration = calculateAverage(durations);
                int countSlow = countSlowRequests(durations, threshold);

                System.out.printf("Total duration: %d ms%n", totalDuration);
                System.out.printf("Maximum duration: %d ms%n", maxDuration);
                System.out.printf("Minimum duration: %d ms%n", minDuration);
                System.out.printf("Average duration: %.2f ms%n", averageDuration);
                System.out.printf("Slow requests (>= 200 ms): %d%n", countSlow);
            }
        } else {
            System.out.println("Invalid count");
        }
    }

    // 计算总耗时
    public static int calculateTotal(int[] durations) {
        int total = 0;

        for (int duration : durations) {
            total += duration;
        }

        return total;
    }

    // 统计最大耗时
    public static int findMax(int[] durations) {
        int max = durations[0];

        for (int duration : durations) {
            if (duration > max) {
                max = duration;
            }
        }

        return max;
    }

    // 统计最小耗时
    public static int findMin(int[] durations) {
        int min = durations[0];

        for (int duration : durations) {
            if (duration < min) {
                min = duration;
            }
        }

        return min;
    }

    // 计算平均耗时
    public static double calculateAverage(int[] durations) {
        int total = calculateTotal(durations);

        return (double) total / durations.length;
    }

    // 统计达到或超过阈值的请求数量
    public static int countSlowRequests(int[] durations, int threshold) {
        int count = 0;

        for (int duration : durations) {
            if (duration >= threshold) {
                count++;
            }
        }

        return count;
    }
}
```

正式验收结果：

- CR01–CR18：18/18。
- TC01–TC05：5/5。
- 阻断性问题：0。

TC01 修改后实际运行输出：

```text
Enter request count (1-8): 4
Enter duration for request 1 (0-10000 ms): 100
Enter duration for request 2 (0-10000 ms): 200
Enter duration for request 3 (0-10000 ms): 400
Enter duration for request 4 (0-10000 ms): 150
Total duration: 850 ms
Maximum duration: 400 ms
Minimum duration: 100 ms
Average duration: 212.50 ms
Slow requests (>= 200 ms): 2
```

TC04 实际运行输出：

```text
Enter request count (1-8): 3
Enter duration for request 1 (0-10000 ms): 9999
Enter duration for request 2 (0-10000 ms): 1
Enter duration for request 3 (0-10000 ms): 10000
Total duration: 20000 ms
Maximum duration: 10000 ms
Minimum duration: 1 ms
Average duration: 6666.67 ms
Slow requests (>= 200 ms): 2
```

### 9.3 AccessLogAuditor.java

文件路径：

`01-java-basics/day07/code/AccessLogAuditor.java`

```java
import java.util.Scanner;

public class AccessLogAuditor {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 初始化统计变量
        int processedRecords = 0;
        int grantedRecords = 0;
        int deniedRecords = 0;
        int alarmRecords = 0;
        int totalRiskPoints = 0;
        String riskLevel = "";

        // 读取访问记录数量
        int recordCount = readBoundedInt(scanner, "Enter record count (1-5): ", 1, 5);

        // 逐条读取访问结果
        for (int i = 0; i < recordCount; i++) {
            int code = readBoundedInt(scanner, String.format("Enter access result for record %d (1-3): ", i + 1), 1, 3);

            // 更新统计变量
            processedRecords++;
            if (code == 1) {
                grantedRecords++;
            } else if (code == 2) {
                deniedRecords++;
            } else {
                alarmRecords++;
            }
            totalRiskPoints += calculateRiskPoints(code);
        }

        // 更新访问风险等级
        riskLevel = determineRiskLevel(totalRiskPoints);

        // 结果输出
        System.out.printf("Processed records: %d%n", processedRecords);
        System.out.printf("Granted records: %d%n", grantedRecords);
        System.out.printf("Denied records: %d%n", deniedRecords);
        System.out.printf("Alarm records: %d%n", alarmRecords);
        System.out.printf("Total risk points: %d%n", totalRiskPoints);
        System.out.printf("Risk level: %s%n", riskLevel);
    }

    // 输入、检查并返回合法整数
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

    // 风险积分计算
    public static int calculateRiskPoints(int code) {
        int riskPoints;

        if (code == 1) {
            riskPoints = 0;
        } else if (code == 2) {
            riskPoints = 2;
        } else {
            riskPoints = 5;
        }

        return riskPoints;
    }

    // 风险等级判断
    public static String determineRiskLevel(int totalRiskPoints) {
        String riskLevel;

        if (totalRiskPoints == 0) {
            riskLevel = "SAFE";
        } else if (totalRiskPoints >= 1 && totalRiskPoints <= 4) {
            riskLevel = "WATCH";
        } else if (totalRiskPoints >=5 && totalRiskPoints <= 9) {
            riskLevel = "WARNING";
        } else {
            riskLevel = "CRITICAL";
        }

        return riskLevel;
    }
}
```

正式验收结果：

- CR01–CR20：20/20。
- TC01–TC07：7/7。
- 阻断性问题：0。

TC05 实际运行输出：

```text
Enter record count (1-5): abc
Invalid integer input.
Enter record count (1-5): 0
Value out of range.
Enter record count (1-5): 7
Value out of range.
Enter record count (1-5): 2
Enter access result for record 1 (1-3): 1
Enter access result for record 2 (1-3): 2
Processed records: 2
Granted records: 1
Denied records: 1
Alarm records: 0
Total risk points: 2
Risk level: WATCH
```

TC06 实际运行输出：

```text
Enter record count (1-5): 3
Enter access result for record 1 (1-3): 1
Enter access result for record 2 (1-3): oops
Invalid integer input.
Enter access result for record 2 (1-3): 4
Value out of range.
Enter access result for record 2 (1-3): 3
Enter access result for record 3 (1-3): -1
Value out of range.
Enter access result for record 3 (1-3): 2
Processed records: 3
Granted records: 1
Denied records: 1
Alarm records: 1
Total risk points: 7
Risk level: WARNING
```

### 9.4 StudentGradeAnalyzer.java

文件路径：

`01-java-basics/day07/code/StudentGradeAnalyzer.java`

```java
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
```

正式验收结果：

- CR01–CR27：27/27。
- TC01–TC07：7/7。
- 阻断性问题：0。

TC01 实际运行输出：

```text
Enter student count (1-10): 5
Enter score for student 1 (0-100): 59
Enter score for student 2 (0-100): 60
Enter score for student 3 (0-100): 89
Enter score for student 4 (0-100): 90
Enter score for student 5 (0-100): 100
Student count: 5
Total score: 398
Highest score: 100
Lowest score: 59
Average score: 79.60
Passed students: 4
Excellent students: 2
Pass rate: 80.00%
```

TC05 修改后实际运行输出：

```text
Enter student count (1-10): abc
Invalid integer input.
Enter student count (1-10): 0
Value out of range.
Enter student count (1-10): 11
Value out of range.
Enter student count (1-10): 3
Enter score for student 1 (0-100): -1
Value out of range.
Enter score for student 1 (0-100): 70
Enter score for student 2 (0-100): 101
Value out of range.
Enter score for student 2 (0-100): 90
Enter score for student 3 (0-100): oops
Invalid integer input.
Enter score for student 3 (0-100): 50
Student count: 3
Total score: 210
Highest score: 90
Lowest score: 50
Average score: 70.00
Passed students: 2
Excellent students: 1
Pass rate: 66.67%
```

TC06 实际运行输出：

```text
Enter student count (1-10): 10
Enter score for student 1 (0-100): 0
Enter score for student 2 (0-100): 100
Enter score for student 3 (0-100): 60
Enter score for student 4 (0-100): 90
Enter score for student 5 (0-100): 59
Enter score for student 6 (0-100): 89
Enter score for student 7 (0-100): 61
Enter score for student 8 (0-100): 99
Enter score for student 9 (0-100): 1
Enter score for student 10 (0-100): 41
Student count: 10
Total score: 600
Highest score: 100
Lowest score: 0
Average score: 60.00
Passed students: 6
Excellent students: 3
Pass rate: 60.00%
```

## 十、实际错误与修复经验

### 10.1 D07-S01：输出提示与标签格式

首次提交存在两项输出格式问题。

非法优先级提示缺少句号：

```text
Invalid priority
```

修改为：

```text
Invalid priority.
```

负载等级标签原大小写不符合要求：

```text
Load Level:
```

修改为：

```text
Load level:
```

最终：

- CR07 复验通过。
- CR14 复验通过。
- TC01–TC06 全部通过。
- 静态审查 16/16。
- 业务测试 6/6。

经验：

程序输出字符串本身是业务接口的一部分。

业务计算正确，也需要保证标签、大小写、空格和标点符合规定。

### 10.2 D07-S02：main 未按要求保存返回值

首次代码直接在 printf 中调用统计方法：

```java
System.out.printf("Total duration: %d ms%n", calculateTotal(durations));
```

该写法在 Java 语法上正确，输出结果也正确。

但不符合正式任务规定的“先保存返回值，再统一输出”。

修改后：

```java
int totalDuration = calculateTotal(durations);
int maxDuration = findMax(durations);
int minDuration = findMin(durations);
double averageDuration = calculateAverage(durations);
int countSlow = countSlowRequests(durations, threshold);
```

随后统一输出五项统计结果。

最终：

- CR13 复验通过。
- TC01 回归通过。
- 其他历史通过项保留。
- 静态审查 18/18。
- 业务测试 5/5。

经验：

程序最终输出正确，不代表所有结构性要求都满足。

方法返回值保存有助于明确计算与输出的职责。

### 10.3 D07-S03：输入错误恢复

本节首次提交全部通过。

核心处理方式：

```java
if (!scanner.hasNextInt()) {
    scanner.next();
    System.out.println("Invalid integer input.");
    continue;
}
```

通过消耗非法 token，避免重复检查同一个错误输入。

通过内层输入循环，保证错误输入不占用有效记录名额。

最终：

- 静态审查 20/20。
- 业务测试 7/7。

经验：

输入校验不仅需要发现错误，还要考虑如何恢复正常业务流程。

### 10.4 D07-S03：非阻断性代码建议

可以适当减少不必要的初始赋值。

可以统一空格风格。

可以在程序结束时关闭 Scanner。

这些建议均不影响已通过的正式源码，不需要为了非阻断性优化重新安排测试。

### 10.5 D07-S04：及格率返回值语义不符合要求

首次实现：

```java
public static double calculatePassRate(int passedCount, int studentCount) {
    return (double) passedCount / studentCount;
}
```

该方法返回 0–1 的比例。

main 再乘以 100 才得到百分比。

虽然最终报告正确，但本节规定该方法应直接返回百分比数值。

因此 CR22 未通过。

修改后：

```java
public static double calculatePassRate(int passedCount, int studentCount) {
    return (double) passedCount / studentCount * 100;
}
```

main 直接输出返回值：

```java
System.out.printf("Pass rate: %.2f%%%n", passRete);
```

最终：

- CR22 复验通过。
- TC05 回归输出 66.67%。
- 其他已通过 CR 和 TC 保留。
- 静态审查 27/27。
- 业务测试 7/7。

经验：

方法返回值不仅需要数据类型正确，还需要符合业务含义。

### 10.6 D07-S04：方法复用与综合设计

核心程序的复用关系：

- readScores 复用 readBoundedInt。
- calculateAverage 复用 calculateTotal。
- countAtLeast 使用两个不同阈值。

main 负责：

- 输入流程。
- 调用统计方法。
- 保存返回值。
- 统一输出。

统计方法不修改成绩数组，也不直接输出最终报告。

经验：

方法拆分应基于明确职责，避免在 main 中重复实现相同计算逻辑。

## 十一、实际后端开发中的应用

### 11.1 输入参数校验

未来 REST API 需要验证客户端提交的参数。

当前 Scanner 输入校验帮助建立以下思路：

1. 检查参数类型。
2. 检查参数范围。
3. 阻止无效数据进入业务处理。
4. 将错误情况与正常流程分开。

### 11.2 Service 业务方法

未来 Java 后端通常会将业务计算放入 Service 层。

当前静态方法训练了：

- 独立业务逻辑。
- 参数传递。
- 返回值设计。
- 方法复用。
- 计算逻辑与输出逻辑分离。

### 11.3 统计类业务

本日完成的工单积分、请求耗时和学生成绩统计体现了常见的数据分析模式。

包括：

- 计数。
- 累加。
- 最小值和最大值。
- 平均值。
- 条件计数。
- 百分比。
- 业务等级判断。

未来这些统计逻辑可能应用于接口监控、订单分析、用户数据统计等场景。

### 11.4 可复用输入逻辑

readBoundedInt 将输入提示、类型检查、范围判断和错误重试统一封装。

未来学习方法设计、面向对象封装和参数校验时，可以继续借鉴这种职责划分思路。

### 11.5 业务测试与边界意识

本日测试覆盖：

- 正常业务数据。
- 最小和最大数量。
- 数值极值。
- 阈值边界。
- 相同数据。
- 非整数输入。
- 超范围输入。
- 中途出错。
- 浮点数精度。

这些测试思路能够迁移到之后的 JUnit 单元测试和接口测试。

## 十二、Day 07 最终总结

| 项目 | 最终结果 |
|---|---|
| 课程总数 | 4 |
| 完成课程 | 4/4 |
| Java 编程练习 | 4/4 |
| 静态代码审查 | 81/81 |
| 正式业务测试 | 25/25 |
| 核心综合程序 | StudentGradeAnalyzer.java |
| 核心综合审查 | 27/27 |
| 核心综合测试 | 7/7 |
| 阻断性问题 | 0 |
| 课程状态 | 全部正式验收通过 |
| Markdown 归档 | 完成 |
| Git 归档 | 完成 |

本日已经掌握：

- 第一周 Java 基础语法综合应用。
- 使用方法组织业务逻辑。
- 使用数组参数和返回值。
- 数组动态创建与遍历。
- 统计总和、极值和平均值。
- 方法之间的调用与复用。
- Scanner 非整数输入检查。
- 非法 token 消耗。
- 输入错误重试。
- 参数化范围判断。
- 有效记录数量管理。
- 参数化阈值统计。
- 百分比计算与两位小数输出。
- 方法返回值保存与统一输出。
- 正常、边界及非法输入业务测试。
- 针对性修改与复验。

Day 07 已完成 README 第 3.1 节规定的第一周综合考核。

学习记录按照 Git 归档完成的预期最终状态整理。

累计完成学习进度：**7/90 天**。

下一学习日：**Day 08**。

学习主题：**类、对象、字段与成员方法**。

核心任务：`Student.java`，创建多个学生对象。

Day 08 将开始 Java 面向对象编程的正式学习。