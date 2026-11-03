# Day 02 学习交接记录

## 1. 当前学习进度

- 日期：2026-11-03
- 当前学习日：Day 02 / 90
- 当前阶段：Java 基础与面向对象
- 课程验收：4/4 通过
- Java 编程练习：5/5 通过
- 累计进度：2/90 天
- 下一学习日：Day 03

## 2. 当前项目状态

开发环境：

- JDK：Eclipse Temurin 21.0.12.1 LTS
- IDE：IntelliJ IDEA
- Project SDK：temurin-21
- 项目根目录：`E:\Java\java-90-days`

已完成练习：

- `01-java-basics/day02/code/StudentInfoDemo.java`
- `01-java-basics/day02/code/BookOrderCalculator.java`
- `01-java-basics/day02/code/StudentProfilePrinter.java`
- `01-java-basics/day02/code/CourseStatisticsReport.java`
- `01-java-basics/day02/code/StudentInfo.java`

状态：五个程序均通过代码审查、编译及命令行运行验收。

已掌握的主要内容：

- Java 八种基本数据类型
- 变量声明、初始化和重新赋值
- 算术运算与取余
- 自动类型转换与强制类型转换
- 复合赋值运算
- final 常量
- String 字符串及拼接
- print、println、printf
- Scanner 标准输入
- nextLine、nextInt、nextDouble
- 基础格式化输出及多组测试

正式项目：

- Student Manager Console：尚未开始，Day 08 启动。
- Campus Assistant Platform：尚未开始，Day 36 启动。

## 3. 文件变更

Day 02 主要文件：

- `01-java-basics/day02/code/StudentInfoDemo.java`：变量与基本数据类型练习。
- `01-java-basics/day02/code/BookOrderCalculator.java`：算术运算与类型转换练习。
- `01-java-basics/day02/code/StudentProfilePrinter.java`：常量与字符串输出练习。
- `01-java-basics/day02/code/CourseStatisticsReport.java`：课程成绩与学分统计练习。
- `01-java-basics/day02/code/StudentInfo.java`：学生信息输入与格式化输出练习。
- `01-java-basics/day02/tasks.md`：每日任务记录。
- `01-java-basics/day02/notes.md`：学习笔记。
- `docs/progress.md`：整体学习进度。
- `docs/handoffs/day02.md`：跨天学习交接。
- `README.md`：仓库学习进度与记录索引。

Day 01 历史文件保留不变。

`.class`、IDE 缓存和编译输出不纳入 Git 版本管理。

## 4. 测试与问题

已通过：

- StudentInfoDemo.java 编译与运行。
- BookOrderCalculator.java 编译与运行。
- StudentProfilePrinter.java 编译与运行。
- CourseStatisticsReport.java 编译与运行。
- StudentInfo.java 编译与运行。
- Day 02 四节课程正式验收。
- CourseStatisticsReport.java 综合编程 TC01–TC16 全部通过。
- StudentInfo.java 输入输出 TC01–TC15 全部通过。

CourseStatisticsReport.java 最终输出：

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

StudentInfo.java 第一组运行结果：

```text
Enter student name: Alice
Enter student age: 23
Enter student score: 89.756
===== Student Information =====
Name: Alice
Age: 23
Score: 89.76
```

StudentInfo.java 第二组运行结果：

```text
Enter student name: Alice Smith
Enter student age: 20
Enter student score: 100
===== Student Information =====
Name: Alice Smith
Age: 20
Score: 100.00
```

已修复问题：

- 重复定义 Java 类。
- 输出标签存在多余冒号或空格。
- 更新后年龄的输出标签不正确。
- scoreRemainder 变量命名错误。
- System.out.print 调用次数不足。

StudentInfo.java 首次提交即通过全部测试，无须修改。

当前没有已知的 Java 程序功能故障。

## 5. Git 状态

- 本地 Git 仓库：已建立。
- GitHub 远程仓库：已创建。
- 仓库名称：`java-90-days`。
- 当前主要分支：`main`。
- Day 01 Git 提交及推送：已完成。
- Day 02 历史提交及推送：已完成。
- 已确认的 Day 02 历史提交：`d29df72`。
- Day 02 五个 Java 程序：均已通过正式验收。
- 当日学习记录：已整理。

## 6. 下一天任务

Day 03 主题：

**Java 运算符、if/else、switch 与成绩等级判断。**

计划课程：

1. 关系运算符、逻辑运算符与布尔表达式。
2. if/else 多分支条件判断。
3. switch 多分支选择。
4. GradeJudge.java 综合编程与边界测试。

当天核心验收文件：

`01-java-basics/day03/code/GradeJudge.java`

工作目录：

`01-java-basics/day03/`

需要继承：

- `README.md`
- `docs/progress.md`
- `docs/handoffs/day02.md`
- `01-java-basics/day02/tasks.md`
- `01-java-basics/day02/notes.md`
- `01-java-basics/day02/code/` 中的五个 Java 程序

教学要求：

- 每次只讲一节课。
- 一课一练，逐课验收。
- 路线图指定的 Java 文件作为当天核心综合验收文件。
- 每节课程可安排适量小练习，不强制新建独立 Java 文件。
- Day 01–77 禁止理论问答。
- 代码独立编写，提交后检查。
- 所有提交环节提供交互式提交框。
- Markdown 文件直接生成，无需提交正文检查。
- 每日 Markdown 章节组织保持与前一天一致。
- 不重复创建已有项目。
- 每天学习时间控制在 2–3 小时。
- 不提前学习 Day 04 的循环内容。

**Day 02 已完成，允许开始 Day 03。**