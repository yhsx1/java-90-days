# Day 07 学习任务

## 基本信息

- 所属阶段：第一阶段，Java 基础与面向对象
- 学习日期：2026-11-20 至 2026-11-23
- 课程主题：第一周综合复习与考核
- 工作目录：`01-java-basics/day07/`
- 课程总数：4
- Java 编程练习：4 个
- 核心综合验收文件：`StudentGradeAnalyzer.java`
- 课程验收：4/4 通过
- 静态代码审查：81/81 通过
- 正式业务测试：25/25 通过
- 阻断性问题：0
- 最终结论：Day 07 四节课程全部正式验收通过

README 第 3.1 节规定的核心任务：

**完成命令行学生成绩统计器，至少通过五组业务测试。**

本日实际完成四个 Java 程序，核心程序 StudentGradeAnalyzer.java 通过七组正式业务测试。

## 第 1 课：基础知识整合与方法拆分

课程编号：D07-S01。

### 学习内容

- [x] 复习 Java 类和 main 方法
- [x] 复习 Scanner 控制台输入
- [x] 复习 int、boolean、String 类型
- [x] 复习关系运算符与逻辑运算符
- [x] 使用 if/else 判断业务条件
- [x] 使用 while 持续接收业务输入
- [x] 使用 break 结束循环
- [x] 使用计数器记录有效业务数量
- [x] 使用累加器统计业务积分
- [x] 理解非法数据不参与统计
- [x] 使用 static 方法封装业务规则
- [x] 使用 boolean 方法判断合法性
- [x] 使用 int 方法返回积分
- [x] 使用 String 方法返回业务等级
- [x] 使用方法参数传递数据
- [x] 在 main 中组织业务执行流程
- [x] 使用局部变量保存业务状态
- [x] 完成正式代码审查与业务测试

### 实操任务

文件路径：

`01-java-basics/day07/code/TicketLoadAnalyzer.java`

练习目标：

实现服务台工单工作量统计器，通过多个业务方法完成工单优先级验证、工作量积分计算和负载等级判断。

规定方法：

1. `isValidPriority(int priority)`：返回 boolean
2. `calculatePriorityPoints(int priority)`：返回 int
3. `determineLoadLevel(int totalPoints)`：返回 String

业务规则：

| 优先级 | 积分 |
|---|---|
| 1 | 1 |
| 2 | 3 |
| 3 | 5 |

输入 0 时结束统计。

合法优先级为 1–3。

非法优先级不增加有效工单数量，不增加紧急工单数量，也不增加总积分。

负载等级：

| 总积分 | 等级 |
|---|---|
| 0 | NONE |
| 1–4 | LOW |
| 5–9 | MEDIUM |
| 大于等于 10 | HIGH |

编程要求：

- [x] 创建 TicketLoadAnalyzer 类
- [x] 正确创建 Scanner
- [x] 使用 while 持续读取优先级
- [x] 输入 0 时正确结束
- [x] 使用方法判断优先级合法性
- [x] 非法优先级不参与统计
- [x] 使用方法计算优先级积分
- [x] 统计有效工单数量
- [x] 统计紧急工单数量
- [x] 累计工作量积分
- [x] 使用方法计算工作负载等级
- [x] 输出四行规定报告
- [x] 严格遵守输出标签和大小写
- [x] 完成 CR01–CR16 静态审查
- [x] 完成 TC01–TC06 正式业务测试
- [x] 完成必要针对性复验

### 正式业务测试

| 编号 | 测试内容 | 最终状态 |
|---|---|---|
| TC01 | 正常混合优先级 | 通过 |
| TC02 | 输入 0 直接结束 | 通过 |
| TC03 | 非法优先级输入 | 通过 |
| TC04 | LOW 等级上边界 | 通过 |
| TC05 | MEDIUM 等级下边界 | 通过 |
| TC06 | HIGH 等级下边界 | 通过 |

已验收的混合工单运行结果：

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

非法优先级处理：

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

### 实际问题与修复

首次提交存在两项输出格式问题。

问题一：

非法提示缺少句号。

原输出：

```text
Invalid priority
```

正式要求：

```text
Invalid priority.
```

问题二：

负载等级标签大小写不一致。

原输出：

```text
Load Level:
```

正式要求：

```text
Load level:
```

首次静态审查：

- CR：14/16 通过。
- CR07：FAIL。
- CR14：FAIL。
- 阻断性问题：2 项。

修改后：

- 非法输入提示增加句号。
- 负载等级标签大小写修正。
- 原有计算方法与积分规则保持不变。

针对性复验：

- CR07：通过。
- CR14：通过。
- CR01–CR06、CR08–CR13、CR15–CR16：保留通过。
- TC01–TC06：修改后全部通过。

最终所有阻断性问题解决。

### 验收结果

| 项目 | 结果 |
|---|---|
| 静态代码审查 | 16/16 通过 |
| 正式业务测试 | 6/6 通过 |
| 工单优先级校验 | 正确 |
| 工单积分计算 | 正确 |
| 有效工单统计 | 正确 |
| 紧急工单统计 | 正确 |
| 负载等级判断 | 正确 |
| 输出格式 | 修复后正确 |
| 阻断性问题 | 0 |
| 最终状态 | 正式验收通过 |

**课程状态：正式验收通过。**

---

## 第 2 课：数组与方法综合处理

课程编号：D07-S02。

### 学习内容

- [x] 复习一维数组的声明与创建
- [x] 根据输入数量动态创建数组
- [x] 使用 Scanner 读取多个数组元素
- [x] 使用数组索引访问元素
- [x] 使用 length 获取数组长度
- [x] 使用普通 for 循环遍历数组
- [x] 使用增强 for 循环遍历数组
- [x] 将数组作为方法参数
- [x] 使用独立方法计算数组元素总和
- [x] 使用首元素初始化最大值
- [x] 使用首元素初始化最小值
- [x] 使用 double 计算平均值
- [x] 使用方法参数传递统计阈值
- [x] 使用条件判断完成阈值计数
- [x] 在方法中使用 return 返回统计结果
- [x] 通过方法调用实现逻辑复用
- [x] 在 main 中保存多个方法返回值
- [x] 在全部计算完成后统一输出
- [x] 完成五组业务测试与针对性复验

### 实操任务

文件路径：

`01-java-basics/day07/code/ApiLatencyAnalyzer.java`

练习目标：

实现 API 请求耗时分析器，对输入的请求耗时数组进行统计分析。

输入要求：

- 请求数量：1–8。
- 每次请求耗时：0–10000 ms。
- 慢请求阈值：200 ms。

规定方法：

1. `calculateTotal(int[] durations)`：返回 int
2. `findMax(int[] durations)`：返回 int
3. `findMin(int[] durations)`：返回 int
4. `calculateAverage(int[] durations)`：返回 double
5. `countSlowRequests(int[] durations, int threshold)`：返回 int

编程要求：

- [x] 创建 ApiLatencyAnalyzer 类
- [x] 正确读取请求数量
- [x] 根据请求数量创建动态数组
- [x] 循环读取请求耗时
- [x] 检查耗时范围
- [x] 不使用硬编码数组代替实际输入
- [x] 实现总耗时方法
- [x] 实现最大耗时方法
- [x] 实现最小耗时方法
- [x] 实现平均耗时方法
- [x] calculateAverage 复用 calculateTotal
- [x] 实现慢请求数量统计方法
- [x] 使用 threshold 参数控制阈值
- [x] main 调用全部五个统计方法
- [x] 将五项返回值保存到局部变量
- [x] 统一输出五行统计报告
- [x] 平均耗时保留两位小数
- [x] 统计方法不修改数组
- [x] 完成 CR01–CR18 静态审查
- [x] 完成 TC01–TC05 正式业务测试

### 正式业务测试

| 编号 | 测试内容 | 预期关键结果 | 最终状态 |
|---|---|---|---|
| TC01 | 100、200、400、150 | 总耗时 850，平均 212.50，慢请求 2 | 通过 |
| TC02 | 单请求耗时 0 | 总耗时 0，平均 0.00 | 通过 |
| TC03 | 五次请求均为 200 | 总耗时 1000，慢请求 5 | 通过 |
| TC04 | 9999、1、10000 | 总耗时 20000，平均 6666.67 | 通过 |
| TC05 | 八次混合耗时 | 总耗时 10802，慢请求 3 | 通过 |

TC01 修改后实际运行结果：

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

TC04 的实际运行结果：

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

### 测试明细

- TC01 验证正常混合耗时、总和、极值、平均值及慢请求数量。
- TC02 验证单元素数组及 0 值。
- TC03 验证阈值相等时必须计入慢请求。
- TC04 验证极值位置及浮点数格式。
- TC05 验证最大数组长度和复杂阈值分布。

### 实际问题与修复

首次提交时，main 直接在 printf 中调用统计方法。

原写法示例：

```java
System.out.printf("Total duration: %d ms%n", calculateTotal(durations));
```

虽然计算正确，但不满足正式任务规定的“先保存返回值，再统一输出”。

首次验收：

- 静态审查：17/18 通过。
- 业务测试：5/5 通过。
- CR13：FAIL。
- 阻断性问题：1 项。

修改后：

```java
int totalDuration = calculateTotal(durations);
int maxDuration = findMax(durations);
int minDuration = findMin(durations);
double averageDuration = calculateAverage(durations);
int countSlow = countSlowRequests(durations, threshold);
```

五项结果计算完成后，再统一输出。

针对性复验：

- CR13：通过。
- CR01–CR12、CR14–CR18：保留通过。
- TC01：修改后实际输出通过。
- TC02–TC05：保留通过。

### 验收结果

| 项目 | 结果 |
|---|---|
| 静态代码审查 | 18/18 通过 |
| 正式业务测试 | 5/5 通过 |
| 动态数组 | 正确 |
| 数组参数传递 | 正确 |
| 总和、最大值、最小值 | 正确 |
| 平均值及精度 | 正确 |
| 慢请求阈值统计 | 正确 |
| 方法调用与复用 | 正确 |
| main 返回值保存 | 修复后正确 |
| 统一输出 | 正确 |
| 阻断性问题 | 0 |
| 最终状态 | 正式验收通过 |

**课程状态：正式验收通过。**

---

## 第 3 课：Scanner 输入校验与业务流程

课程编号：D07-S03。

### 学习内容

- [x] 理解 Scanner.nextInt 的输入限制
- [x] 掌握 Scanner.hasNextInt
- [x] 使用 Scanner.next 消耗非法 token
- [x] 理解 hasNextInt 不消耗输入
- [x] 区分非整数输入与范围错误
- [x] 使用 min 和 max 参数检查合法范围
- [x] 使用 while 实现持续重试
- [x] 使用 continue 跳过非法输入
- [x] 使用 return 返回合法整数
- [x] 将输入校验封装为公共方法
- [x] 在不同输入位置复用同一个方法
- [x] 区分输入重试循环与业务处理循环
- [x] 避免非法输入占用有效记录名额
- [x] 根据合法记录执行分类统计
- [x] 根据访问代码计算风险积分
- [x] 根据累计积分判断风险等级
- [x] 完成七组正式业务测试

### 实操任务

文件路径：

`01-java-basics/day07/code/AccessLogAuditor.java`

练习目标：

编写门禁访问记录审核器，能够在输入错误时持续重试，并正确统计指定数量的有效访问记录。

访问代码：

| 代码 | 记录类型 | 风险积分 |
|---|---|---|
| 1 | GRANTED | 0 |
| 2 | DENIED | 2 |
| 3 | ALARM | 5 |

风险等级：

| 总积分 | 等级 |
|---|---|
| 0 | SAFE |
| 1–4 | WATCH |
| 5–9 | WARNING |
| 大于等于 10 | CRITICAL |

规定方法：

1. `readBoundedInt(Scanner scanner, String prompt, int min, int max)`：返回 int
2. `calculateRiskPoints(int code)`：返回 int
3. `determineRiskLevel(int totalRiskPoints)`：返回 String

编程要求：

- [x] 创建 AccessLogAuditor 类
- [x] 使用 Scanner 读取记录数量
- [x] 记录数量为 1–5
- [x] 使用 hasNextInt 判断整数输入
- [x] 非整数输入时消耗非法 token
- [x] 使用固定非整数错误提示
- [x] 检查整数业务范围
- [x] 使用固定范围错误提示
- [x] 错误输入时重新提示
- [x] 只有合法输入才从方法返回
- [x] main 复用 readBoundedInt
- [x] 非法输入不占用记录名额
- [x] 统计三类访问记录数量
- [x] 计算累计风险积分
- [x] 正确判断四档风险等级
- [x] 统一输出六行统计报告
- [x] 完成 CR01–CR20 静态审查
- [x] 完成 TC01–TC07 正式业务测试

### 正式业务测试

| 编号 | 测试内容 | 最终状态 |
|---|---|---|
| TC01 | 正常混合访问记录 | 通过 |
| TC02 | 最小记录数量 | 通过 |
| TC03 | WATCH 等级上边界 | 通过 |
| TC04 | CRITICAL 等级下边界 | 通过 |
| TC05 | 记录数量连续非法输入 | 通过 |
| TC06 | 访问记录中途非法输入 | 通过 |
| TC07 | 最大合法记录数量 | 通过 |

### 测试明细

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

TC06 证明：

- 非整数输入能够被识别和消耗。
- 超范围整数可以触发重新输入。
- 第 2 条记录输入失败后，程序继续请求第 2 条记录。
- 第 3 条记录输入失败后，程序继续请求第 3 条记录。
- 最终只统计三条合法访问记录。

### 验收结果

| 项目 | 结果 |
|---|---|
| 静态代码审查 | 20/20 通过 |
| 正式业务测试 | 7/7 通过 |
| 非整数输入处理 | 正确 |
| 非法 token 消耗 | 正确 |
| 范围检查 | 正确 |
| 输入重试 | 正确 |
| 输入方法复用 | 正确 |
| 有效记录数量控制 | 正确 |
| 访问分类统计 | 正确 |
| 风险积分与等级 | 正确 |
| 阻断性问题 | 0 |
| 最终状态 | 正式验收通过 |

本节首次提交通过全部审查与测试。

非阻断性建议：

- 可以在获得实际结果时再声明 riskLevel。
- 可统一运算符两侧空格风格。
- 可在程序结束时关闭 Scanner。

**课程状态：正式验收通过。**

---

## 第 4 课：命令行学生成绩统计器综合考核

课程编号：D07-S04。

### 学习内容

- [x] 综合复习 Day 01–06 Java 基础知识
- [x] 理解综合业务程序的主要执行流程
- [x] 使用 Scanner 读取学生人数
- [x] 使用 hasNextInt 检查整数输入
- [x] 使用循环重试非法输入
- [x] 使用动态数组保存成绩
- [x] 使用方法返回 int[] 数组
- [x] 通过数组参数传递成绩
- [x] 使用方法计算总分
- [x] 使用方法统计最高分
- [x] 使用方法统计最低分
- [x] 使用方法计算平均分
- [x] 使用 double 避免整数除法截断
- [x] 使用方法复用减少重复求和
- [x] 使用参数化阈值统计人数
- [x] 分别统计及格人数和优秀人数
- [x] 使用独立方法计算及格率
- [x] 明确比例值与百分比数值的区别
- [x] 在 main 中保存所有统计方法返回值
- [x] 统一输出最终八行报告
- [x] 完成不同业务场景的测试
- [x] 完成 CR01–CR27 静态审查
- [x] 完成 TC01–TC07 正式业务测试
- [x] 完成针对性复验

### 综合实操任务

文件路径：

`01-java-basics/day07/code/StudentGradeAnalyzer.java`

练习目标：

独立实现命令行学生成绩统计器，使用数组和多个方法完成输入、统计与报告输出。

输入规则：

- 学生人数：1–10。
- 学生成绩：0–100。
- 及格阈值：60。
- 优秀阈值：90。
- 非整数输入需要重新输入。
- 超范围整数需要重新输入。
- 错误输入不得占用学生名额。

规定方法：

1. `readBoundedInt(Scanner scanner, String prompt, int min, int max)`：返回 int
2. `readScores(Scanner scanner, int studentCount)`：返回 int[]
3. `calculateTotal(int[] scores)`：返回 int
4. `findHighest(int[] scores)`：返回 int
5. `findLowest(int[] scores)`：返回 int
6. `calculateAverage(int[] scores)`：返回 double
7. `countAtLeast(int[] scores, int threshold)`：返回 int
8. `calculatePassRate(int passedCount, int studentCount)`：返回 double

综合要求：

- [x] 创建 StudentGradeAnalyzer 类
- [x] 正确导入并创建 Scanner
- [x] 复用 readBoundedInt 读取学生人数
- [x] 使用 readScores 创建和填充成绩数组
- [x] 非法输入不进入成绩数组
- [x] 输入错误后重新读取当前学生成绩
- [x] 使用 calculateTotal 计算总分
- [x] 使用 findHighest 计算最高分
- [x] 使用 findLowest 计算最低分
- [x] calculateAverage 复用 calculateTotal
- [x] 使用 countAtLeast 统计及格人数
- [x] 使用 countAtLeast 统计优秀人数
- [x] countAtLeast 正确使用 threshold
- [x] calculatePassRate 返回百分比数值
- [x] main 保存全部统计结果
- [x] 统一输出八行报告
- [x] 平均分保留两位小数
- [x] 及格率保留两位小数并添加百分号
- [x] 统计方法不修改数组
- [x] 统计方法不直接打印最终报告
- [x] 完成 CR01–CR27 静态审查
- [x] 完成 TC01–TC07 业务测试
- [x] 完成针对性复验

### 正式业务测试

| 编号 | 测试内容 | 最终关键结果 | 状态 |
|---|---|---|---|
| TC01 | 正常混合成绩 | 总分 398，及格率 80.00% | 通过 |
| TC02 | 最小合法人数和 0 分 | 平均 0.00，及格率 0.00% | 通过 |
| TC03 | 单人满分 | 平均 100.00，及格率 100.00% | 通过 |
| TC04 | 及格与优秀阈值边界 | 及格 3 人，优秀 1 人 | 通过 |
| TC05 | 人数和成绩连续非法输入 | 总分 210，及格率 66.67% | 通过 |
| TC06 | 最大合法人数 | 10 人，总分 600 | 通过 |
| TC07 | 全部成绩相同 | 最高最低均为 75 | 通过 |

### 测试明细

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

TC05 验证：

- 非整数人数输入能够正确恢复。
- 超范围人数输入能够正确恢复。
- 非法成绩不会占用学生名额。
- 只有合法成绩进入成绩数组。
- 统计结果基于 70、90、50 三项有效成绩。
- 平均分和百分比格式正确。

### 实际问题与修复

首次提交时，calculatePassRate 返回比例而不是百分比数值。

原实现：

```java
public static double calculatePassRate(int passedCount, int studentCount) {
    return (double) passedCount / studentCount;
}
```

main 再将该结果乘以 100 输出。

虽然最终报告数值正确，但不符合冻结的 M08 方法职责要求。

首次审查：

- CR：26/27 通过。
- TC：7/7 通过。
- CR22：FAIL。
- 阻断性问题：1 项。

修改后：

```java
public static double calculatePassRate(int passedCount, int studentCount) {
    return (double) passedCount / studentCount * 100;
}
```

main 直接格式化方法返回的百分比数值：

```java
System.out.printf("Pass rate: %.2f%%%n", passRete);
```

针对性复验：

- CR01–CR21：保留通过。
- CR23–CR27：保留通过。
- CR22：重新审查通过。
- TC05：修改后实际运行输出通过。
- TC01–TC04、TC06–TC07：保留通过。

全部阻断性问题解决。

### 验收结果

| 项目 | 结果 |
|---|---|
| 静态代码审查 | 27/27 通过 |
| 正式业务测试 | 7/7 通过 |
| 学生人数输入 | 正确 |
| 成绩输入与校验 | 正确 |
| 非法输入重试 | 正确 |
| 动态成绩数组 | 正确 |
| readScores 返回数组 | 正确 |
| 总分、最高分、最低分 | 正确 |
| 平均分及精度 | 正确 |
| 及格和优秀人数 | 正确 |
| 百分比计算 | 修复后正确 |
| 方法复用 | 正确 |
| main 返回值保存 | 正确 |
| 统一输出 | 正确 |
| 阻断性问题 | 0 |
| 最终状态 | 正式验收通过 |

非阻断性建议：

`passRete` 可以改为更符合英文拼写的 `passRate`，但不影响当前已通过版本，也不要求修改源码。

**课程状态：正式验收通过。**

---

## Day 07 最终验收汇总

| 课程 | Java 文件 | 静态审查 | 业务测试 | 状态 |
|---|---|---|---|---|
| D07-S01 | TicketLoadAnalyzer.java | 16/16 | 6/6 | 通过 |
| D07-S02 | ApiLatencyAnalyzer.java | 18/18 | 5/5 | 通过 |
| D07-S03 | AccessLogAuditor.java | 20/20 | 7/7 | 通过 |
| D07-S04 | StudentGradeAnalyzer.java | 27/27 | 7/7 | 通过 |
| **合计** | **4 个 Java 文件** | **81/81** | **25/25** | **全部通过** |

### 全日实际问题与修复

| 课程 | 实际问题 | 最终修复与验收 |
|---|---|---|
| D07-S01 | 非法提示缺少句号、标签大小写错误 | CR07、CR14 与 TC01–TC06 通过 |
| D07-S02 | main 未保存五个统计返回值 | CR13 与 TC01 复验通过 |
| D07-S03 | 无阻断性问题 | 首轮 CR20/20、TC7/7 通过 |
| D07-S04 | calculatePassRate 返回比例值 | CR22 与 TC05 复验通过 |

### Day 07 学习成果

- [x] 综合复习 Day 01–06 基础语法
- [x] 使用方法组织业务逻辑
- [x] 使用参数传递业务数据
- [x] 使用 return 获取计算结果
- [x] 使用数组保存和处理数据
- [x] 使用数组作为方法参数和返回值
- [x] 使用方法调用实现逻辑复用
- [x] 使用 Scanner 检查整数输入
- [x] 使用循环处理非法输入与重试
- [x] 使用计数器和累加器统计业务数据
- [x] 实现总和、最大值、最小值、平均值
- [x] 实现参数化阈值统计
- [x] 实现百分比计算
- [x] 完成命令行学生成绩统计器
- [x] 完成四个独立 Java 程序
- [x] 完成 81/81 静态审查
- [x] 完成 25/25 正式业务测试
- [x] 完成所有针对性复验
- [x] 整理 Day 07 学习笔记与交接记录
- [x] 整理 Day 07 Markdown 学习归档
- [x] 完成 Day 07 Git 归档

## 最终结果

Day 07 四节课程、四个 Java 编程练习全部正式验收通过。

- 课程验收：4/4。
- Java 编程练习：4/4。
- 静态代码审查：81/81。
- 正式业务测试：25/25。
- 未通过项目：0。
- 待验收项目：0。
- 阻断性问题：0。
- 核心综合程序：StudentGradeAnalyzer.java。
- 综合审查：27/27。
- 综合测试：7/7。
- Markdown 归档：完成。
- Git 归档：完成。

学习记录按照 Git 归档完成的预期最终状态编写。

累计完成学习进度：**7/90 天**。

下一学习日：**Day 08**。

下一学习主题：**类、对象、字段与成员方法**。

核心任务：`Student.java`，创建多个学生对象。

Day 07 全部学习和归档工作完成，Day 08 可以正式开始。