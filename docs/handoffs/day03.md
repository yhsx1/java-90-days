# Day 03 学习交接记录

## 1. 当前学习进度

- 日期：2026-11-08
- 当前学习日：Day 03 / 90
- 当前阶段：Java 基础与面向对象
- 课程验收：4/4 通过
- Java 编程练习：4/4 通过
- 业务测试：48/48 通过
- 累计进度：3/90 天
- 下一学习日：Day 04

## 2. 当前项目状态

开发环境：

- JDK：Eclipse Temurin 21.0.12.1 LTS
- IDE：IntelliJ IDEA
- Project SDK：temurin-21
- 项目根目录：`E:\Java\java-90-days`
- Module：java-90-days

已完成练习：

- `01-java-basics/day03/code/LibraryAccessCheck.java`
- `01-java-basics/day03/code/ShippingFeeCalculator.java`
- `01-java-basics/day03/code/OrderStatusChecker.java`
- `01-java-basics/day03/code/GradeJudge.java`

状态：四个程序均通过代码审查、编译记录及实际运行输出验收。

已掌握的主要内容：

- Java 关系运算符
- boolean 表达式
- 逻辑与 &&、逻辑或 ||、逻辑非 !
- 短路求值
- 运算符优先级
- if 单分支
- if/else 双分支
- else if 多分支
- 条件执行顺序
- 数值区间判断
- 非法数据处理
- switch、case、break、default
- 传统 switch 贯穿
- Java 21 箭头式 switch 基础
- Java 与 Python 条件分支对比
- 边界值与异常业务状态测试

正式项目：

- Student Manager Console：尚未开始，Day 08 启动。
- Campus Assistant Platform：尚未开始，Day 36 启动。

## 3. 文件变更

Day 03 主要文件：

- `01-java-basics/day03/code/LibraryAccessCheck.java`：关系运算符与逻辑表达式练习。
- `01-java-basics/day03/code/ShippingFeeCalculator.java`：if/else 运费区间计算练习。
- `01-java-basics/day03/code/OrderStatusChecker.java`：switch 订单状态判断练习。
- `01-java-basics/day03/code/GradeJudge.java`：成绩等级判断核心综合验收。
- `01-java-basics/day03/tasks.md`：Day 03 每日任务与验收记录。
- `01-java-basics/day03/notes.md`：Day 03 学习笔记及错误经验。
- `docs/progress.md`：90 天整体学习进度。
- `docs/handoffs/day03.md`：跨天学习交接记录。
- `README.md`：仓库学习进度与记录索引。

Day 01、Day 02 历史代码与学习记录保留不变。

`.class`、IDE 缓存、编译输出等文件不纳入 Git 版本管理。

## 4. 测试与问题

### 已通过

| 课程    | 程序                       | 验收  | 业务测试 |
|---------|----------------------------|-------|----------|
| D03-S01 | LibraryAccessCheck.java    | 12/12 | 6/6      |
| D03-S02 | ShippingFeeCalculator.java | 15/15 | 10/10    |
| D03-S03 | OrderStatusChecker.java    | 15/15 | 8/8      |
| D03-S04 | GradeJudge.java            | 20/20 | 24/24    |

全部四节课程正式验收通过。

累计 48 组业务测试通过。

### GradeJudge.java 核心测试

A 等级：

```text
Enter student score: 90
Grade: A
Description: Excellent
```

B 等级：

```text
Enter student score: 89.99
Grade: B
Description: Good
```

C 等级：

```text
Enter student score: 70
Grade: C
Description: Average
```

D 等级：

```text
Enter student score: 60
Grade: D
Description: Pass
```

F 等级：

```text
Enter student score: 0
Grade: F
Description: Fail
```

非法成绩：

```text
Enter student score: 101
Invalid score
```

精细边界：

```text
Enter student score: 89.999
Grade: B
Description: Good
```

GradeJudge.java：

- AC01–AC20 全部通过。
- TC01–TC24 全部通过。
- 成绩范围判断正确。
- 等级说明匹配正确。
- 非法成绩不输出正常等级。
- 无阻断性业务错误。

### 已修复问题

D03-S01：

- 最终借阅条件遗漏账户状态。
- 修改后六组测试通过。

D03-S02：

- 首次提交通过。
- 记录了冗余条件和代码格式优化建议。

D03-S03：

- default 首次输出多余内容。
- 首次修改后的错误提示文字不符合规范。
- 最终修改为 Invalid order status。
- 三组非法状态复验通过。

D03-S04：

- 首次提交通过。
- 记录重复合法性判断、非法值后继续执行 switch、空 default 三项优化建议。

当前无已知阻断性 Java 程序功能问题。

## 5. Git 状态

- 本地 Git 仓库：已建立。
- GitHub 远程仓库：`yhsx1/java-90-days`。
- 主要分支：`main`。
- Day 01 历史代码及学习记录：已提交。
- Day 02 历史代码及学习记录：已提交。
- Day 02 已确认的历史提交：`d29df72`。
- Day 03 四个 Java 程序：正式验收通过。
- Day 03 学习任务、学习笔记、进度记录与交接文档：已整理。
- Java 编译生成的 `.class` 文件：不纳入版本管理。

Day 03 归档提交信息：

`feat(day03): complete Java conditionals and switch exercises`

## 6. 下一天任务

Day 04 主题：

**Java for、while、break、continue 与循环控制。**

计划课程：

1. for 循环结构。
2. while 循环结构。
3. break 与 continue 循环控制。
4. NumberPractice.java 综合编程与测试。

当天核心验收文件：

`01-java-basics/day04/code/NumberPractice.java`

工作目录：

`01-java-basics/day04/`

主要验收目标：

- 正确使用 for 循环。
- 正确使用 while 循环。
- 掌握循环初始化、条件和变量更新。
- 正确使用 break 与 continue。
- 完成循环累加求和。
- 完成九九乘法表。
- 验证循环边界与输出格式。
- 完成 NumberPractice.java 核心综合验收。

需要继承：

- `README.md`
- `docs/progress.md`
- `docs/handoffs/day03.md`
- `01-java-basics/day03/tasks.md`
- `01-java-basics/day03/notes.md`
- `01-java-basics/day03/code/` 中的四个 Java 程序

教学要求：

- 每次只讲一节课。
- 一课一练，逐课验收。
- 每节课提供知识讲解和实际编程任务。
- 核心综合验收文件必须按照 README 安排。
- 不提前进入 Day 05 的数组知识。
- Day 01–77 不安排理论问答。
- 不重复系统讲授 Day 01–03 已掌握内容。
- 每日学习时间控制在 2–3 小时。
- 所有提交环节使用可提交到当前会话的交互式区域。
- 代码独立编写，审查时先提供修改建议。
- Markdown 归档沿用既定章节组织。
- 不提前标记未完成课程通过。

**Day 03 已完成，允许开始 Day 04。**