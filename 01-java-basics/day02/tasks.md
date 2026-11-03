# Day 02 学习任务

## 基本信息

- 所属阶段：第一阶段，Java 基础与面向对象
- 学习日期：2026-11-03
- 课程主题：Java 基本数据类型、变量、常量与基础输入输出
- 工作目录：`01-java-basics/day02/`
- 课程总数：4
- Java 编程练习：5 个
- 正式验收结果：全部通过

## 第 1 课：Java 变量与八种基本数据类型

### 学习内容

- [x] 变量的含义与作用
- [x] 变量声明、初始化与赋值
- [x] 整数类型：byte、short、int、long
- [x] 浮点类型：float、double
- [x] 字符类型：char
- [x] 布尔类型：boolean
- [x] String 与基本数据类型的区别
- [x] Java 变量命名规范
- [x] Java 与 Python 变量的区别
- [x] 使用 System.out.println 输出变量

### 实操任务

文件路径：

`01-java-basics/day02/code/StudentInfoDemo.java`

练习目标：

独立编写学生基本信息展示程序，掌握变量声明、基本数据类型及变量重新赋值。

- [x] 创建 public class StudentInfoDemo
- [x] 编写 main 方法
- [x] 声明并初始化十个指定变量
- [x] 正确使用八种基本数据类型及 String
- [x] 按照指定格式输出学生基本信息
- [x] 将 studentAge 从 23 修改为 24
- [x] 输出更新后的年龄
- [x] 使用 javac 编译
- [x] 使用 java 命令运行
- [x] 检查输出内容一致性
- [x] 修复代码结构与输出格式问题

### 验收结果

| 编号 | 测试内容             | 结果 |
|------|----------------------|------|
| TC01 | Java 编译            | 通过 |
| TC02 | 生成 .class 文件     | 通过 |
| TC03 | 命令行运行           | 通过 |
| TC04 | 十个变量类型与初始值 | 通过 |
| TC05 | 十一行输出内容一致性 | 通过 |
| TC06 | 变量重新赋值         | 通过 |
| TC07 | 类名与文件名一致     | 通过 |
| TC08 | 代码规范             | 通过 |

首次提交存在重复类定义及输出格式问题，修改后重新编译运行并通过验收。

**课程状态：验收通过**

## 第 2 课：变量运算与类型转换

### 学习内容

- [x] 变量重新赋值
- [x] 加、减、乘、除与取余运算
- [x] 整数除法与浮点数除法
- [x] 复合赋值运算符
- [x] 自增与自减的基本用法
- [x] 自动类型转换
- [x] 强制类型转换
- [x] 数据类型范围与整数溢出
- [x] 浮点数精度问题
- [x] Java 与 Python 数值运算的区别

### 实操任务

文件路径：

`01-java-basics/day02/code/BookOrderCalculator.java`

练习目标：

独立编写校园教材订单计算程序，完成业务金额计算、整数除法、取余、类型转换和变量更新。

- [x] 声明教材单价、数量、运费、优惠及人数变量
- [x] 计算教材小计
- [x] 计算订单总金额
- [x] 计算平均分摊金额
- [x] 使用整数除法计算每人教材数量
- [x] 使用取余运算计算剩余教材数量
- [x] 使用强制类型转换计算平均教材数量
- [x] 使用 += 更新教材数量
- [x] 使用 javac 编译
- [x] 使用 java 命令运行
- [x] 检查计算结果及输出格式
- [x] 修复输出格式问题

### 验收结果

| 编号 | 测试内容           | 结果 |
|------|--------------------|------|
| TC01 | Java 编译          | 通过 |
| TC02 | 命令行运行         | 通过 |
| TC03 | 教材小计计算       | 通过 |
| TC04 | 订单总金额计算     | 通过 |
| TC05 | 平均分摊金额计算   | 通过 |
| TC06 | 整数除法           | 通过 |
| TC07 | 取余运算           | 通过 |
| TC08 | 强制类型转换       | 通过 |
| TC09 | 复合赋值运算       | 通过 |
| TC10 | 九行输出内容一致性 | 通过 |
| TC11 | 代码规范           | 通过 |

主要计算结果：

- 教材小计：316.0
- 订单总金额：308.0
- 平均分摊金额：102.66666666666667
- 整数除法结果：2
- 取余结果：2
- 平均教材数量：2.6666666666666665
- 更新后教材数量：10

首次提交中平均金额输出标签存在多余空格，修改后重新编译运行并通过验收。

**课程状态：验收通过**

## 第 3 课：常量与字符串输出

### 学习内容

- [x] final 关键字
- [x] Java 常量的基本用法
- [x] 变量与常量的区别
- [x] 常量初始化规则
- [x] String 字符串基础
- [x] 字符串拼接
- [x] 数字运算与字符串拼接的区别
- [x] System.out.print
- [x] System.out.println
- [x] 基础转义字符
- [x] Java 变量与常量命名规范

### 实操任务

文件路径：

`01-java-basics/day02/code/StudentProfilePrinter.java`

练习目标：

独立编写学生学籍信息展示程序，使用 final 常量、字符串拼接及两种控制台输出方法。

- [x] 创建 public class StudentProfilePrinter
- [x] 编写 main 方法
- [x] 声明三个 final 常量
- [x] 声明六个学生信息变量
- [x] 使用变量与常量计算剩余学分
- [x] 使用字符串拼接输出学生信息
- [x] 至少使用两次 System.out.print
- [x] 正确使用 System.out.println
- [x] 输出指定的十一行内容
- [x] 使用 javac 编译
- [x] 使用 java 命令运行
- [x] 检查代码规范与输出结果

### 验收结果

| 编号 | 测试内容              | 结果 |
|------|-----------------------|------|
| TC01 | 类名与文件名一致      | 通过 |
| TC02 | Java 编译             | 通过 |
| TC03 | final 常量声明        | 通过 |
| TC04 | 常量类型与初始值      | 通过 |
| TC05 | 学生信息变量          | 通过 |
| TC06 | 剩余学分计算          | 通过 |
| TC07 | System.out.print 使用 | 通过 |
| TC08 | 字符串拼接            | 通过 |
| TC09 | 十一行输出内容一致性  | 通过 |
| TC10 | 代码规范              | 通过 |
| TC11 | 命令行运行            | 通过 |

剩余学分计算结果为 24。

首次提交即通过全部验收要求，无需修改代码。

**课程状态：验收通过**

## 第 4 课：Day 02 综合编程验收

### 实操任务

文件路径：

`01-java-basics/day02/code/CourseStatisticsReport.java`

练习目标：

综合运用基本数据类型、变量、常量、算术运算、类型转换及字符串输出，独立完成校园课程学习统计报告程序。

- [x] 创建 public class CourseStatisticsReport
- [x] 编写 main 方法
- [x] 声明三个 final 固定配置常量
- [x] 声明学生与课程信息变量
- [x] 正确使用 int、long、float、char、boolean、String
- [x] 计算三项课程成绩总分
- [x] 使用强制类型转换计算平均成绩
- [x] 使用取余运算计算成绩余数
- [x] 计算原始剩余学分
- [x] 使用 += 更新累计学分
- [x] 至少使用两次 System.out.print
- [x] 输出完整的十六行统计报告
- [x] 使用 javac 编译
- [x] 使用 java 命令运行
- [x] 检查计算结果及输出一致性
- [x] 修复变量命名和输出方法使用问题
- [x] 通过全部综合测试用例

### 测试用例

| 编号 | 测试内容              | 结果 |
|------|-----------------------|------|
| TC01 | Java 文件与类名一致   | 通过 |
| TC02 | Java 编译             | 通过 |
| TC03 | 命令行运行            | 通过 |
| TC04 | 三个 final 常量       | 通过 |
| TC05 | 学生及课程变量        | 通过 |
| TC06 | 总成绩计算            | 通过 |
| TC07 | 平均成绩计算          | 通过 |
| TC08 | 取余运算              | 通过 |
| TC09 | 剩余学分计算          | 通过 |
| TC10 | 学分复合赋值          | 通过 |
| TC11 | 强制类型转换          | 通过 |
| TC12 | 复合赋值运算符        | 通过 |
| TC13 | System.out.print 使用 | 通过 |
| TC14 | 十六行输出内容一致性  | 通过 |
| TC15 | 代码规范              | 通过 |
| TC16 | 未使用超前语法        | 通过 |

### 最终运行结果

```text
===== Course Statistics Report =====
School: Example University
Student Name: Alice
Student ID: 20260001
Student Age: 23
Course: Java Programming
Course Grade: A
Enrolled: true
Attendance Rate: 96.5
Platform Visits: 3000000000
Total Score: 275
Average Score: 91.66666666666667
Score Remainder: 2
Remaining Credits: 36
Updated Completed Credits: 88
Report Generated Successfully
```

### 验收结果

- javac 编译：成功
- java 运行：成功
- 输出内容：完全匹配
- 总成绩：275
- 平均成绩：91.66666666666667
- 成绩余数：2
- 原始剩余学分：36
- 更新后累计学分：88
- final 常量：正确
- 类型转换：正确
- 复合赋值：正确
- 综合测试用例：16/16 通过

首次提交中，余数变量命名错误，且未满足至少两次使用 System.out.print 的要求。

修改后重新编译运行，全部测试用例通过。

**课程状态：验收通过**

## 第 5 项练习：学生信息输入与格式化输出

### 学习内容

- [x] Java 标准输入流 System.in
- [x] 导入 java.util.Scanner
- [x] 创建 Scanner 对象
- [x] 使用 nextLine() 读取整行文本
- [x] 使用 nextInt() 读取整数
- [x] 使用 nextDouble() 读取浮点数
- [x] 使用 System.out.printf 格式化输出
- [x] 使用 %s 输出字符串
- [x] 使用 %d 输出整数
- [x] 使用 %.2f 保留两位小数
- [x] 使用 %n 控制换行
- [x] Java 与 Python 输入输出方式对比

### 实操任务

文件路径：

`01-java-basics/day02/code/StudentInfo.java`

练习目标：

独立编写学生信息输入程序，从键盘读取姓名、年龄和分数，并使用 printf 按指定格式输出。

- [x] 创建 public class StudentInfo
- [x] 编写 main 方法
- [x] 正确导入 java.util.Scanner
- [x] 创建 Scanner 对象并关联 System.in
- [x] 显示姓名、年龄和分数输入提示
- [x] 使用 nextLine() 读取学生姓名
- [x] 使用 nextInt() 读取学生年龄
- [x] 使用 nextDouble() 读取学生分数
- [x] 使用 String、int 和 double 保存输入数据
- [x] 使用 printf 输出学生信息
- [x] 使用 %.2f 保留分数两位小数
- [x] 使用 %n 控制换行
- [x] 使用 javac 编译
- [x] 使用 java 命令运行
- [x] 完成两组不同输入数据的测试
- [x] 验证包含空格的姓名能够完整读取
- [x] 验证分数格式化结果符合要求

### 测试用例

| 编号 | 测试内容              | 结果 |
|------|-----------------------|------|
| TC01 | 文件名与类名一致      | 通过 |
| TC02 | 正确导入 Scanner      | 通过 |
| TC03 | nextLine() 读取姓名   | 通过 |
| TC04 | nextInt() 读取年龄    | 通过 |
| TC05 | nextDouble() 读取分数 | 通过 |
| TC06 | %s 格式化姓名         | 通过 |
| TC07 | %d 格式化年龄         | 通过 |
| TC08 | %.2f 格式化分数       | 通过 |
| TC09 | %n 控制换行           | 通过 |
| TC10 | 第一组正常数据测试    | 通过 |
| TC11 | 包含空格的姓名读取    | 通过 |
| TC12 | 100.00 分数格式测试   | 通过 |
| TC13 | Java 编译             | 通过 |
| TC14 | Java 正常运行         | 通过 |
| TC15 | 代码规范              | 通过 |

### 最终运行结果

第一组输入：

- 姓名：Alice
- 年龄：23
- 分数：89.756

实际输出：

```text
Enter student name: Alice
Enter student age: 23
Enter student score: 89.756
===== Student Information =====
Name: Alice
Age: 23
Score: 89.76
```

第二组输入：

- 姓名：Alice Smith
- 年龄：20
- 分数：100

实际输出：

```text
Enter student name: Alice Smith
Enter student age: 20
Enter student score: 100
===== Student Information =====
Name: Alice Smith
Age: 20
Score: 100.00
```

### 验收结果

- javac 编译：成功，退出码为 0
- java 运行：成功
- Scanner 使用：正确
- 字符串输入：正确
- 整数输入：正确
- 浮点数输入：正确
- printf 格式化输出：正确
- 第一组测试：通过
- 第二组测试：通过
- 综合测试用例：15/15 通过

首次提交即通过全部验收要求，无需修改代码。

**练习状态：验收通过**

## Day 02 最终总结

| 项目          | 结果                                              |
|---------------|---------------------------------------------------|
| 完成课程      | 4 / 4                                             |
| 课程验收      | 全部通过                                          |
| Java 编程练习 | 5 个                                              |
| 编译运行      | 成功                                              |
| 代码修复      | 类定义、输出格式、变量命名和输出方法使用问题      |
| 综合测试      | CourseStatisticsReport：16/16；StudentInfo：15/15 |
| 基础输入输出  | Scanner、printf 通过验收                          |
| 学习记录      | 已整理                                            |
| Git 历史提交  | 已完成                                            |
| 正式项目开发  | 未开始                                            |
| 下一学习日    | Day 03                                            |

**Day 02 正式综合验收：通过**