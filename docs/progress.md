# Java 90 Days 学习进度

## 1. 基本信息

- 学习计划：Java 90 Days
- 开始日期：2026-10-26
- 学习周期：90 天
- 每日学习时间：2–3 小时
- 主线：Java 后端开发
- 辅线：AI 智能体应用开发
- 当前阶段：Java 基础与面向对象
- 当前已完成：Day 01、Day 02、Day 03、Day 04
- 下一学习日：Day 05
- 最后更新：2026-11-13

## 2. 整体进度

已完成学习日：4 / 90。

整体完成率：约 4.44%。

| 阶段                  | 时间      | 状态   |
|-----------------------|-----------|--------|
| Java 基础与面向对象   | Day 01–21 | 进行中 |
| Java 核心进阶与数据库 | Day 22–35 | 未开始 |
| Spring Boot 后端开发  | Day 36–56 | 未开始 |
| 工程化与 AI 智能体    | Day 57–77 | 未开始 |
| 面试准备与求职冲刺    | Day 78–90 | 未开始 |

## 3. 每日学习进度

| 学习日 | 课程主题                                    | 课程验收      | 状态   |
|--------|---------------------------------------------|---------------|--------|
| Day 01 | Java 基础认知、开发环境、第一个 Java 程序   | 4/4           | 已完成 |
| Day 02 | Java 基本数据类型、变量、常量与基础输入输出 | 4/4，5 个练习 | 已完成 |
| Day 03 | Java 运算符、if/else、switch 与成绩等级判断 | 4/4，4 个练习 | 已完成 |
| Day 04 | Java for、while、break、continue 与循环控制 | 4/4，4 个练习 | 已完成 |

其余学习日根据实际进度逐步添加，不提前标记完成。

## 4. Day 01 详细记录

学习日期：2026-10-26。

| 课程    | 主题               | 状态     |
|---------|--------------------|----------|
| 第 1 课 | Java 基础认知      | 验收通过 |
| 第 2 课 | Java 开发环境配置  | 验收通过 |
| 第 3 课 | 第一个 Java 程序   | 验收通过 |
| 第 4 课 | 综合实操与学习归档 | 验收通过 |

### 已完成内容

- JDK 21 环境检查
- JAVA_HOME 与 Path 验证
- IntelliJ IDEA Project SDK 配置
- Java 基础语法入门
- Java 源文件编译
- Java 字节码文件检查
- Java 命令行运行
- IDEA 运行
- HelloJava.java 编程练习
- 输出错误修改
- Day 01 学习归档

### 已完成练习

`01-java-basics/day01/code/HelloJava.java`

测试结果：编译成功，运行输出符合要求。

### 问题修复

首次运行输出缺少逗号，修改后重新编译并通过正式验收。

### 最终结果

Day 01：全部验收通过。

## 5. Day 02 详细记录

学习日期：2026-11-03。

| 课程    | 主题                        | 状态     |
|---------|-----------------------------|----------|
| 第 1 课 | Java 变量与八种基本数据类型 | 验收通过 |
| 第 2 课 | 变量运算与类型转换          | 验收通过 |
| 第 3 课 | 常量与字符串输出            | 验收通过 |
| 第 4 课 | 综合编程验收                | 验收通过 |

### 已完成内容

- Java 变量声明、初始化与赋值
- Java 八种基本数据类型
- String 与基本数据类型的区别
- Java 变量命名规范
- 算术运算和取余运算
- 整数除法与浮点数除法
- 自动类型转换和强制类型转换
- 复合赋值运算符
- 整数溢出与浮点数精度基础
- final 常量
- 字符串拼接
- print 与 println
- 基础转义字符
- System.in 标准输入
- Scanner 对象及基本输入方法
- nextLine、nextInt 和 nextDouble
- System.out.printf 格式化输出
- %s、%d、%.2f 和 %n
- 包含空格的文本输入
- 多组输入数据测试
- Java 与 Python 的相关区别
- Day 02 学习归档

### 已完成练习

`01-java-basics/day02/code/StudentInfoDemo.java`

`01-java-basics/day02/code/BookOrderCalculator.java`

`01-java-basics/day02/code/StudentProfilePrinter.java`

`01-java-basics/day02/code/CourseStatisticsReport.java`

`01-java-basics/day02/code/StudentInfo.java`

测试结果：

- 五个 Java 程序均通过代码审查。
- 五个程序均完成本地编译与运行验收。
- 最终输出符合各练习要求。
- CourseStatisticsReport.java 综合测试 TC01–TC16 全部通过。
- StudentInfo.java 综合测试 TC01–TC15 全部通过。
- StudentInfo.java 完成两组不同输入的测试。
- Scanner 标准输入与 printf 格式化输出正确。

### 问题修复

第 1 课：

- 重复类定义。
- 输出内容多余冒号。
- 更新后年龄的输出标签错误。

第 2 课：

- Average Amount 输出标签存在多余空格。

第 3 课：

- 首次提交通过，无须修改。

第 4 课：

- 余数变量命名错误。
- System.out.print 调用次数不足。

StudentInfo.java：

- 首次提交通过，无须修改。

以上实际发现的问题均已修复，所有练习通过正式验收。

### 最终结果

Day 02：4/4 课程、5/5 编程练习全部验收通过。

## 6. Day 03 详细记录

学习日期：2026-11-05 至 2026-11-08。

| 课程    | 主题                               | 状态     |
|---------|------------------------------------|----------|
| 第 1 课 | 关系运算符、逻辑运算符与布尔表达式 | 验收通过 |
| 第 2 课 | if/else 条件判断                   | 验收通过 |
| 第 3 课 | switch 多分支选择                  | 验收通过 |
| 第 4 课 | GradeJudge.java 综合编程与边界测试 | 验收通过 |

### 已完成内容

- Java 六种关系运算符
- boolean 表达式
- 逻辑与 &&、逻辑或 ||、逻辑非 !
- 逻辑运算真值规则
- && 和 || 短路求值
- 运算符优先级
- 多条件业务判断
- Java 流程控制概念
- if 单分支
- if/else 双分支
- else if 多分支
- 条件执行顺序
- 数值区间与边界判断
- 条件遮蔽与条件遗漏
- 花括号与代码块
- switch 固定值匹配
- case、break、default
- 传统 switch 贯穿
- Java 21 箭头式 switch 基础
- switch 与 if/else 的区别
- Java 与 Python 条件分支区别
- Scanner 与分支控制综合应用
- 正常值、非法值和边界值测试
- Day 03 核心综合编程验收

### 已完成练习

`01-java-basics/day03/code/LibraryAccessCheck.java`

`01-java-basics/day03/code/ShippingFeeCalculator.java`

`01-java-basics/day03/code/OrderStatusChecker.java`

`01-java-basics/day03/code/GradeJudge.java`

测试结果：

- 四个 Java 程序均通过代码审查。
- 四个程序均完成本地编译与运行验收。
- 最终输出符合各练习要求。
- LibraryAccessCheck.java：TC01–TC12 全部通过，六组业务测试全部通过。
- ShippingFeeCalculator.java：TC01–TC15 全部通过，十组业务测试全部通过。
- OrderStatusChecker.java：TC01–TC15 全部通过，八组业务测试全部通过。
- GradeJudge.java：AC01–AC20 全部通过。
- GradeJudge.java：TC01–TC24 全部通过。
- 累计 48 组业务测试全部通过。
- 成绩等级、非法输入和小数边界处理正确。

### 问题修复

第 1 课：

- LibraryAccessCheck.java 首次提交遗漏 accountActive 条件。
- 修改最终借阅资格表达式。
- 六组测试复验全部通过。

第 2 课：

- ShippingFeeCalculator.java 首次提交通过。
- 记录冗余条件与代码格式优化建议。

第 3 课：

- OrderStatusChecker.java 首次提交的 default 输出多余内容。
- 第一次修改后的 Unknown order status 仍与要求不一致。
- 最终修改为 Invalid order status。
- 三组非法状态复验通过。

第 4 课：

- GradeJudge.java 首次提交通过。
- 记录重复合法性判断、非法成绩继续执行 switch 和空 default 的优化建议。
- 24 组成绩测试全部通过。

以上实际发现的问题均已解决，不存在阻断性功能问题。

### 最终结果

Day 03：4/4 课程、4/4 编程练习全部验收通过。

## 7. Day 04 详细记录

学习日期：2026-11-09 至 2026-11-13。

| 课程    | 主题                                   | 状态     |
|---------|----------------------------------------|----------|
| 第 1 课 | for 循环                               | 验收通过 |
| 第 2 课 | while 循环                             | 验收通过 |
| 第 3 课 | break、continue 与嵌套循环基础         | 验收通过 |
| 第 4 课 | NumberPractice.java 综合编程与边界测试 | 验收通过 |

### 已完成内容

- 循环结构的基本概念
- for 循环语法
- 初始化表达式、条件表达式和更新表达式
- 循环体与代码块
- for 循环执行顺序
- 循环变量变化过程
- 循环次数计算
- 循环上下界
- 从 0 开始与从 1 开始的循环
- for 循环计数与累加
- 取余运算与条件筛选
- while 循环语法
- while 条件判断及执行顺序
- 循环变量初始化和状态更新
- while 终止条件
- 非预期无限循环的原因
- 使用 boolean 状态控制循环
- while 与 for 的区别
- break 提前结束循环
- continue 跳过当前轮次
- break 与 continue 的区别
- continue 与循环变量更新
- 嵌套循环结构
- 外层循环和内层循环
- 嵌套循环执行顺序
- 嵌套循环执行次数
- break 和 continue 的作用层级
- Java 与 Python 循环语法比较
- Scanner 与循环综合应用
- 输入合法性校验
- 整数求和与状态重置
- 下三角九九乘法表
- 输出空格、换行及格式控制
- 正常值、非法值及边界值测试
- Day 04 核心综合编程验收

### 已完成练习

`01-java-basics/day04/code/ForPractice.java`

`01-java-basics/day04/code/InventoryPractice.java`

`01-java-basics/day04/code/ShelfScanPractice.java`

`01-java-basics/day04/code/NumberPractice.java`

测试结果：

- 四个 Java 程序均通过正式代码审查。
- 四个程序均有用户报告的成功编译状态及符合要求的实际运行记录。
- ForPractice.java：12/12 审查通过，6/6 组业务测试通过。
- InventoryPractice.java：12/12 审查通过，8/8 组业务测试通过。
- ShelfScanPractice.java：15/15 审查通过，8/8 组正式业务测试通过。
- ShelfScanPractice.java：6/6 组针对性复验通过。
- NumberPractice.java：CR01–CR20 全部通过。
- NumberPractice.java：TC01–TC12 全部通过。
- 本日累计原定业务测试 34/34 通过。
- 循环求和、九九乘法表和多轮输入控制正确。
- 非法输入、边界值及退出流程处理正确。

### 问题修复

第 1 课：

- ForPractice.java 首次提交即通过。
- 记录 Scanner 资源关闭和计数变量作用域优化建议。

第 2 课：

- InventoryPractice.java 首次提交使用 break 退出 while，不符合本课自然终止的要求。
- 新增 boolean continueFlag 状态变量。
- 使用 stock > 0 && continueFlag 作为循环条件。
- 删除 break，实现通过状态更新自然终止。
- 第一次针对性复验 4/4 通过，最终审查 12/12 通过。

第 3 课：

- ShelfScanPractice.java 首次提交缺少完整输入范围检查。
- 新增 rowsValid、columnsValid、targetColumnValid。
- 使用 && 组合合法性判断。
- 修复非法行数、列数及目标列处理。
- 第一次针对性复验 6/6 通过，最终审查 15/15 通过。

第 4 课：

- NumberPractice.java 首次提交未使用 break 退出。
- 求和输出固定显示字母 N，没有替换为实际输入值。
- 九九乘法表缺少标题，行末存在多余空格。
- 使用 while(true) 与 break 实现主动退出。
- 使用 printf 动态输出 N 和 total。
- 补充 Multiplication Table 标题。
- 使用循环变量判断表达式之间的空格及换行。
- 第一次修改后完成十二组综合测试。
- 最终 CR01–CR20 全部通过。
- 最终 TC01–TC12 全部通过。

本日实际发现的阻断性问题均已修复，四个 Java 程序全部正式验收通过。

### 最终结果

Day 04：4/4 课程、4/4 编程练习全部验收通过。

## 8. 开发环境状态

| 组件            | 当前状态                           |
|-----------------|------------------------------------|
| Windows         | 已确认使用 Windows，具体版本未记录 |
| JDK             | Temurin 21.0.12.1 LTS              |
| javac           | 21.0.12.1                          |
| IntelliJ IDEA   | 已安装、已配置 JDK 21              |
| Java 项目模块   | java-90-days                       |
| Maven           | 尚未验证                           |
| Git             | 已安装并正常使用                   |
| GitHub 远程仓库 | 已创建并完成历史提交               |
| MySQL           | 尚未开始学习                       |
| Redis           | 尚未开始学习                       |
| Spring Boot     | 尚未开始学习                       |

## 9. 正式项目进度

### Student Manager Console

- 路径：`projects/student-manager-console/`
- 计划周期：Day 08–35
- 当前状态：尚未开始
- 当前版本：无
- 已完成功能：无
- 待开发功能：学生 CRUD、成绩统计、面向对象分层、集合、文件 IO、JDBC、MySQL 等

### Campus Assistant Platform

- 路径：`projects/campus-assistant-platform/`
- 计划周期：Day 36–77
- 当前状态：尚未开始
- 当前版本：无
- 已完成功能：无
- 待开发功能：课程管理、选课、认证授权、缓存、并发控制、AI 助手、RAG 和工具调用等

## 10. 阶段综合验收计划

| 日期   | 验收主题          | 状态   |
|--------|-------------------|--------|
| Day 21 | Java 基础项目     | 未开始 |
| Day 35 | Java 核心与数据库 | 未开始 |
| Day 56 | Spring Boot 后端  | 未开始 |
| Day 77 | 工程化与 AI 集成  | 未开始 |
| Day 90 | 求职能力综合验收  | 未开始 |

## 11. 教学规范

### Day 01–77

- 不安排理论问答。
- 不安排选择题、判断题或填空题。
- 不安排面试模拟。
- 不要求背诵 Java 八股文。
- 通过编程、测试、运行结果和项目实操完成验收。

### Day 78–90

集中进行理论问答、算法、项目答辩和模拟面试。

### 日常教学流程

知识讲解 → 示例演示 → 独立实操 → 提交代码 → 代码检查 → 提示修改 → 正式验收。

### 文件管理

- 每天创建独立练习目录。
- Markdown 文件由导师提供完整内容。
- Markdown 正文不需要提交检查。
- 代码及运行结果需要提交正式验收。
- 所有涉及提交的环节均提供交互式提交框。
- 每天完成后生成交接记录。
- 每天使用新的学习会话。
- 正式项目持续迭代，不重复创建。
- 路线图指定的 Java 文件为当天核心综合验收产物。
- 每课可安排针对性小练习，不强制每课创建独立 Java 文件。
- 每天以完成核心知识点和综合任务为准，不单纯追求练习数量。

## 12. Git 与 GitHub

- 本地 Git 仓库：已建立
- GitHub 远程仓库：已创建
- GitHub 地址：https://github.com/yhsx1/java-90-days
- 仓库名称：java-90-days
- 当前主要分支：main
- Day 01 Git 提交及推送：完成
- Day 02 已确认的历史提交：`d29df72`
- Day 02 五个 Java 练习：全部验收通过
- Day 03 四个 Java 练习：全部验收通过
- Day 03 综合测试：48/48 通过
- Day 03 已验收 Git 提交：`ed7f5d4`
- Day 03 GitHub 推送：已验收通过
- Day 04 四个 Java 练习：全部验收通过
- Day 04 综合测试：NumberPractice.java CR01–CR20、TC01–TC12 全部通过
- Day 04 累计业务测试：34/34 通过
- Day 04 Markdown 学习记录：已归档
- Day 04 Git 提交与推送：完成

## 13. 下一步计划

Day 05 学习：

**Java 数组、一维数组遍历、索引。**

计划内容：

1. 一维数组的概念与基本结构。
2. 数组声明、创建与初始化。
3. 数组索引与数组长度。
4. 使用循环遍历数组。
5. 数组访问边界与常见错误。
6. ScoreStatistics.java 综合编程与测试。

Day 05 核心练习：

`01-java-basics/day05/code/ScoreStatistics.java`

Day 05 工作目录：

`01-java-basics/day05/`

Day 05 尚未开始。