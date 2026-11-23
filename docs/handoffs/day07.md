# Day 07 学习交接记录

## 1. 当前学习进度

- 学习日期：2026-11-20 至 2026-11-23
- 当前学习日：Day 07 / 90
- 当前阶段：第一阶段，Java 基础与面向对象
- 学习主题：第一周综合复习与考核
- 课程验收：4/4 通过
- Java 编程练习：4/4 通过
- 静态代码审查：81/81 通过
- 正式业务测试：25/25 通过
- 核心综合审查：27/27 通过
- 核心综合测试：7/7 通过
- 阻断性问题：0
- Markdown 归档：完成
- Git 归档：完成
- 累计进度：7/90 天
- 下一学习日：Day 08

## 2. 当前项目状态

开发环境：

- 操作系统：Windows
- JDK：Eclipse Temurin 21.0.12.1 LTS
- IDE：IntelliJ IDEA
- Project SDK：temurin-21
- 项目根目录：`E:\Java\java-90-days`
- Module：java-90-days
- Git 分支：main
- GitHub 仓库：https://github.com/yhsx1/java-90-days

已完成 Java 程序：

- `01-java-basics/day07/code/TicketLoadAnalyzer.java`
- `01-java-basics/day07/code/ApiLatencyAnalyzer.java`
- `01-java-basics/day07/code/AccessLogAuditor.java`
- `01-java-basics/day07/code/StudentGradeAnalyzer.java`

以上四个程序均已完成正式代码审查和必要业务测试。

正式项目状态：

- Student Manager Console：尚未正式开始，计划从 Day 08 逐步进入面向对象阶段。
- Campus Assistant Platform：尚未开始，计划在 Day 36–77 开发。

Day 01–06 的历史成果和验收结论保持不变。

## 3. 本日已掌握知识

### Java 基础综合运用

- Java 类与 main 方法
- 基本数据类型
- 变量与常量
- String
- Scanner 输入
- printf 输出
- 关系与逻辑运算符
- if/else 条件判断
- for 循环
- while 循环
- break
- continue
- 计数器
- 累加器
- 数值边界判断

### 数组与数据统计

- int[] 数组
- 数组声明和创建
- 动态创建数组
- 数组 length
- 数组索引
- 普通 for 遍历
- 增强 for 遍历
- 数组参数传递
- 数组返回值
- 总和统计
- 最大值与最小值
- 平均值计算
- 阈值计数
- double 浮点数计算
- 百分比计算

### 方法与业务逻辑拆分

- public static 方法
- 方法定义与调用
- 形式参数与实际参数
- Java 按值传递
- int 返回值
- double 返回值
- boolean 返回值
- String 返回值
- int[] 返回值
- return
- 方法之间的调用
- 方法复用
- 参数化阈值
- 计算与输出职责分离
- main 保存返回值后统一输出

### Scanner 输入校验

- hasNextInt 类型检查
- nextInt 读取整数
- next 消耗非法 token
- 类型错误与范围错误的区别
- while 重试循环
- continue 重新输入
- 参数化范围校验
- 通用输入方法复用
- 输入错误不占用有效记录名额
- 非法输入不污染业务统计

### 综合测试能力

- 正常业务测试
- 最大和最小数量边界
- 数值上下界
- 阈值相等边界
- 全部相同数据
- 非整数输入
- 超范围输入
- 中途输入错误
- 小数精度测试
- 百分比格式测试
- 针对性代码复验
- 必要回归测试

## 4. 本日课程与验收结果

| 课程 | 主题 | 静态审查 | 业务测试 | 状态 |
|---|---|---|---|---|
| D07-S01 | 方法拆分与工单统计 | 16/16 | 6/6 | 通过 |
| D07-S02 | 数组与 API 耗时统计 | 18/18 | 5/5 | 通过 |
| D07-S03 | Scanner 输入校验与门禁审核 | 20/20 | 7/7 | 通过 |
| D07-S04 | 学生成绩综合统计器 | 27/27 | 7/7 | 通过 |
| 合计 | 四节课程 | 81/81 | 25/25 | 全部通过 |

### D07-S01

完成 TicketLoadAnalyzer.java。

实现三个业务方法：

- isValidPriority
- calculatePriorityPoints
- determineLoadLevel

通过 while 实现持续输入。

使用 0 作为结束标记。

非法优先级不参与统计。

首次存在输出标点和标签大小写问题。

修改后 CR07、CR14 及六组业务测试通过。

最终 16/16 静态审查、6/6 业务测试通过。

### D07-S02

完成 ApiLatencyAnalyzer.java。

实现五个数组统计方法：

- calculateTotal
- findMax
- findMin
- calculateAverage
- countSlowRequests

完成总耗时、最大耗时、最小耗时、平均耗时和慢请求数量统计。

calculateAverage 复用 calculateTotal。

首次未按规定将五个统计返回值保存到局部变量。

修改后 CR13 通过，TC01 回归通过。

最终 18/18 静态审查、5/5 业务测试通过。

### D07-S03

完成 AccessLogAuditor.java。

实现三个业务方法：

- readBoundedInt
- calculateRiskPoints
- determineRiskLevel

通过 hasNextInt、next 和 continue 实现输入检查与重试。

使用通用输入方法处理不同范围的数据。

非法输入不会占用有效记录名额。

首次提交全部通过。

最终 20/20 静态审查、7/7 业务测试通过。

### D07-S04

完成 StudentGradeAnalyzer.java。

实现八个自定义方法：

- readBoundedInt
- readScores
- calculateTotal
- findHighest
- findLowest
- calculateAverage
- countAtLeast
- calculatePassRate

完成：

- 人数输入检查。
- 成绩输入重试。
- 动态成绩数组。
- 成绩数组返回。
- 总分、最高分、最低分和平均分。
- 及格与优秀人数统计。
- 百分比及格率。
- 返回值保存与统一输出。

首次实现中，calculatePassRate 返回比例值，不符合返回百分比数值的规定。

修改后 CR22 复验通过，TC05 回归通过。

最终 27/27 静态审查、7/7 业务测试通过。

## 5. 当前文件结构

```text
java-90-days/
├── README.md
├── 01-java-basics/
│   ├── day01/
│   ├── day02/
│   ├── day03/
│   ├── day04/
│   ├── day05/
│   ├── day06/
│   └── day07/
│       ├── code/
│       │   ├── TicketLoadAnalyzer.java
│       │   ├── ApiLatencyAnalyzer.java
│       │   ├── AccessLogAuditor.java
│       │   └── StudentGradeAnalyzer.java
│       ├── tasks.md
│       └── notes.md
└── docs/
    ├── progress.md
    └── handoffs/
        ├── day01.md
        ├── day02.md
        ├── day03.md
        ├── day04.md
        ├── day05.md
        ├── day06.md
        └── day07.md
```

Day 01–06 的课程代码、学习记录和历史验收结论均保持不变。

Day 07 四个 Java 程序及五份 Markdown 学习记录均已整理。

## 6. 实际问题与修复经验

### D07-S01

问题一：非法输入提示缺少句号。

首次输出：

```text
Invalid priority
```

正式要求：

```text
Invalid priority.
```

问题二：负载等级标签大小写错误。

首次输出：

```text
Load Level:
```

正式要求：

```text
Load level:
```

修复结果：

- CR07 复验通过。
- CR14 复验通过。
- TC01–TC06 全部通过。
- 最终 16/16、6/6。

经验：

固定格式的输出内容必须严格匹配业务要求。

### D07-S02

问题：main 直接在 printf 中调用统计方法，没有先保存返回值。

首次审查结果：

- CR：17/18。
- TC：5/5。
- CR13 未通过。

修改后：

```java
int totalDuration = calculateTotal(durations);
int maxDuration = findMax(durations);
int minDuration = findMin(durations);
double averageDuration = calculateAverage(durations);
int countSlow = countSlowRequests(durations, threshold);
```

再使用对应变量统一输出。

复验结果：

- CR13 通过。
- 其他 CR 保留通过。
- TC01 回归通过。
- TC02–TC05 保留通过。
- 最终 18/18、5/5。

经验：

方法返回值的正确使用也是程序结构性要求的一部分。

### D07-S03

首次提交全部通过。

输入校验核心代码：

```java
if (!scanner.hasNextInt()) {
    scanner.next();
    System.out.println("Invalid integer input.");
    continue;
}
```

正确消耗非法 token 并重新输入。

输入方法仅返回合法数据。

外层业务循环只在取得合法数据后推进。

最终 20/20、7/7。

经验：

业务输入不仅需要检查错误，还需要保证错误发生后程序可以恢复。

非阻断性建议：

- 减少不必要的初始赋值。
- 统一运算符空格。
- 按需关闭 Scanner。

### D07-S04

问题：calculatePassRate 返回比例而不是百分比数值。

首次实现：

```java
public static double calculatePassRate(int passedCount, int studentCount) {
    return (double) passedCount / studentCount;
}
```

首次审查：

- CR：26/27。
- TC：7/7。
- CR22 未通过。

修改后：

```java
public static double calculatePassRate(int passedCount, int studentCount) {
    return (double) passedCount / studentCount * 100;
}
```

main 直接输出：

```java
System.out.printf("Pass rate: %.2f%%%n", passRete);
```

复验结果：

- CR22 通过。
- TC05 回归通过。
- 其他 CR 与 TC 保留通过。
- 最终 27/27、7/7。

经验：

应明确区分方法返回值的业务含义和调用方的输出格式化职责。

目前不存在已知阻断性 Java 代码问题。

## 7. 验收规则

继续执行以下规则：

1. 每次只学习一节课程。
2. 当前课程通过后才开始下一节。
3. 练习由学习者独立完成。
4. 提交完整 Java 源码及必要实际运行结果。
5. 进行明确的 CR 静态代码审查。
6. 根据实际业务分支安排必要 TC。
7. 不要求单独提交 javac 编译终端记录。
8. 明显语法错误仍属于未通过项目。
9. 不机械增加测试数量。
10. 保留已经通过的历史审查项目和业务测试。
11. 对实际修改部分进行针对性复验。
12. 修改公共逻辑时安排必要回归测试。
13. 未提交的测试不得虚构通过。
14. Day 01–77 不安排独立理论问答或模拟面试。
15. 全部课程通过后统一整理 Markdown。
16. Git 提交与推送必须通过真实操作验收。
17. 每日归档正文统一按照 Git 归档已完成的预期状态编写。
18. README 第 3.1 节是逐日课程安排的正式依据。
19. 不提前提供正式练习完整答案。
20. 已完成学习日的课程不重复审查。

## 8. Git 与 GitHub 归档

- 本地仓库：`E:\Java\java-90-days`
- GitHub：https://github.com/yhsx1/java-90-days
- 分支：main
- Day 01：历史 Git 归档完成
- Day 02：历史 Git 归档完成，已确认提交 `d29df72`
- Day 03：历史 Git 归档完成，已确认提交 `ed7f5d4`
- Day 04：历史 Git 归档完成，已确认提交 `8f1758fffbeb9104db89abeec5876d106f3ebcd7`
- Day 05：历史 Git 归档完成，具体 SHA 以真实 Git 日志为准
- Day 06：历史 Git 归档完成，具体 SHA 以真实 Git 日志为准
- Day 07：学习记录按照 Git 归档完成的最终状态编写
- `.class` 文件及 IDEA 缓存：不纳入版本管理

Day 07 归档内容：

四个 Java 程序：

1. TicketLoadAnalyzer.java
2. ApiLatencyAnalyzer.java
3. AccessLogAuditor.java
4. StudentGradeAnalyzer.java

五个 Markdown 文件：

1. `01-java-basics/day07/tasks.md`
2. `01-java-basics/day07/notes.md`
3. `docs/progress.md`
4. `docs/handoffs/day07.md`
5. `README.md`

正式验收：

- 课程：4/4。
- Java 文件：4/4。
- 静态审查：81/81。
- 业务测试：25/25。
- 核心综合审查：27/27。
- 核心综合测试：7/7。
- 阻断性问题：0。

Git 提交说明：

`feat(day07): complete Java fundamentals review and grade analyzer`

Day 07 Git 归档按照完成后的预期状态整理。

具体 Commit SHA 以真实 Git 历史为准，不预先编造。

## 9. 下一学习日：Day 08

正式课程主题：

**类、对象、字段与成员方法**

README 第 3.1 节规定：

`Student.java`，创建多个学生对象。

### Day 08 目标

主要学习：

- Java 类的定义。
- 类与对象的关系。
- class 关键字。
- 对象的创建。
- new 关键字。
- 对象引用变量。
- 实例字段。
- 成员方法。
- 使用对象访问字段。
- 使用对象调用成员方法。
- 创建多个 Student 对象。
- 观察不同对象的实例状态。
- 区分 static 方法与实例方法。

### Day 08 学习要求

- 继承 Day 01–07 全部正式验收成果。
- 不重新要求提交历史 Java 源码或测试。
- 以 README 第 3.1 节为唯一逐日课程路线依据。
- Day 08 是面向对象编程的起点。
- 理论教学必须完整并循序渐进。
- 保持一课一练、逐课验收。
- 正式练习由学习者独立完成。
- 不提前提供正式练习的完整答案。
- 使用交互式区域提交源码及实际输出。
- 冻结必要 CR 和 TC 标准。
- 严格区分 PASS、FAIL 和待验收。
- 历史通过项不重复验收。
- 对修改部分进行针对性复验。
- 不要求 javac 编译终端证据。
- 不提前安排 Day 09 的构造方法、this、封装及 getter/setter 综合任务。
- 不安排独立理论问答、选择题或模拟面试。
- 全部课程通过后，再统一整理 Markdown 与 Git 归档。

Day 07 已完成课程验收及预期最终状态归档，可以进入 Day 08。

## 10. 最终交接结论

Day 07 四节课程全部正式验收通过。

已完成四个独立 Java 程序。

静态代码审查：81/81。

正式业务测试：25/25。

核心综合文件 StudentGradeAnalyzer.java：

- CR01–CR27 全部通过。
- TC01–TC07 全部通过。
- CR22 针对性复验通过。
- TC05 回归测试通过。
- 无阻断性问题。

累计学习进度更新为 **7/90 天**。

Day 07 Markdown 学习记录已整理，并按照 Git 归档完成的预期最终状态编写。

下一学习日：**Day 08**。

下一学习主题：**类、对象、字段与成员方法**。

核心任务：`Student.java`，创建多个学生对象。

Day 08 必须继承 Day 01–07 的完整课程成果和正式验收记录。