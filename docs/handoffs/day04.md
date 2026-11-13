# Day 04 学习交接记录

## 1. 当前学习进度

- 日期：2026-11-13
- 当前学习日：Day 04 / 90
- 当前阶段：Java 基础与面向对象
- 课程验收：4/4 通过
- Java 编程练习：4/4 通过
- 原定业务测试：34/34 通过
- 核心综合审查：20/20 通过
- 核心综合业务测试：12/12 通过
- 累计进度：4/90 天
- 下一学习日：Day 05

## 2. 当前项目状态

开发环境：

- JDK：Eclipse Temurin 21.0.12.1 LTS
- IDE：IntelliJ IDEA
- Project SDK：temurin-21
- 项目根目录：`E:\Java\java-90-days`
- Module：java-90-days

已完成练习：

- `01-java-basics/day04/code/ForPractice.java`
- `01-java-basics/day04/code/InventoryPractice.java`
- `01-java-basics/day04/code/ShelfScanPractice.java`
- `01-java-basics/day04/code/NumberPractice.java`

状态：四个程序均通过代码审查，用户报告的编译结果成功，实际控制台运行记录符合验收要求。

已掌握的主要内容：

- Java for 循环
- 初始化、条件和更新表达式
- 循环变量及执行次数
- 循环上下界
- for 循环计数和累加
- while 循环
- while 条件驱动的重复处理
- boolean 循环状态变量
- 自然终止与主动终止
- break 提前结束循环
- continue 跳过当前轮次
- continue 与循环状态更新
- 两层嵌套 for
- 外层与内层循环的执行关系
- break 和 continue 的作用层级
- Scanner 多轮整数输入
- 输入范围校验
- 整数求和与累计变量重置
- 九九乘法表
- printf 格式控制
- 正常值、非法值和边界值测试

正式项目：

- Student Manager Console：尚未开始，Day 08 启动。
- Campus Assistant Platform：尚未开始，Day 36 启动。

## 3. 文件变更

Day 04 主要文件：

- `01-java-basics/day04/code/ForPractice.java`：for 循环与 3 的倍数统计练习。
- `01-java-basics/day04/code/InventoryPractice.java`：while 循环与库存扣减练习。
- `01-java-basics/day04/code/ShelfScanPractice.java`：break、continue 与嵌套循环练习。
- `01-java-basics/day04/code/NumberPractice.java`：循环求和与九九乘法表核心综合验收。
- `01-java-basics/day04/tasks.md`：Day 04 每日任务与验收记录。
- `01-java-basics/day04/notes.md`：Day 04 学习笔记、最终源代码与错误经验。
- `docs/progress.md`：90 天整体学习进度。
- `docs/handoffs/day04.md`：跨天学习交接记录。
- `README.md`：仓库学习进度与记录索引。

Day 01、Day 02、Day 03 历史代码与学习记录保留不变。

`.class`、IDE 缓存、编译输出等文件不纳入 Git 版本管理。

## 4. 测试与问题

### 已通过

| 课程    | 程序                   | 验收  | 业务测试 |
|---------|------------------------|-------|----------|
| D04-S01 | ForPractice.java       | 12/12 | 6/6      |
| D04-S02 | InventoryPractice.java | 12/12 | 8/8      |
| D04-S03 | ShelfScanPractice.java | 15/15 | 8/8      |
| D04-S04 | NumberPractice.java    | 20/20 | 12/12    |

全部四节课程正式验收通过。

累计 34 组原定业务测试通过。

针对性复验：

- InventoryPractice.java：4/4 通过。
- ShelfScanPractice.java：6/6 通过。
- NumberPractice.java：第一次修改后完成 12/12 全部业务测试。

### NumberPractice.java 核心测试

立即退出：

```text
=== Number Practice ===
Enter N (0 to exit): 0
Program ended
```

整数求和与九九乘法表：

```text
=== Number Practice ===
Enter N (0 to exit): 5
Sum(1..5) = 15
Multiplication Table:
1*1=1
1*2=2 2*2=4
1*3=3 2*3=6 3*3=9
1*4=4 2*4=8 3*4=12 4*4=16
1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
1*6=6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36
1*7=7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49
1*8=8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=64
1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
Enter N (0 to exit): 0
Program ended
```

最大有效整数：

```text
=== Number Practice ===
Enter N (0 to exit): 20
Sum(1..20) = 210
Multiplication Table:
1*1=1
1*2=2 2*2=4
1*3=3 2*3=6 3*3=9
1*4=4 2*4=8 3*4=12 4*4=16
1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
1*6=6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36
1*7=7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49
1*8=8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=64
1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
Enter N (0 to exit): 0
Program ended
```

非法负数：

```text
=== Number Practice ===
Enter N (0 to exit): -1
Invalid input
Enter N (0 to exit): 0
Program ended
```

超过有效上界：

```text
=== Number Practice ===
Enter N (0 to exit): 21
Invalid input
Enter N (0 to exit): 0
Program ended
```

NumberPractice.java：

- CR01–CR20 全部通过。
- TC01–TC12 全部通过。
- 求和范围及结果正确。
- 九九乘法表完整。
- 多轮求和状态正确重置。
- 非法输入不执行正常计算。
- 输入 0 后正确结束程序。
- 输出格式符合正式要求。
- 无剩余阻断性问题。

### 已修复问题

D04-S01：

- 首次提交通过全部验收。
- 记录 Scanner 资源关闭与变量作用域优化建议。

D04-S02：

- 首次提交使用 break 退出库存处理循环。
- 根据课程要求改为通过 boolean 状态变量控制自然终止。
- 修改后四组针对性测试全部通过。

D04-S03：

- 首次提交输入范围校验不完整。
- 增加 rows、columns、targetColumn 的完整有效性判断。
- 修改后六组针对性测试全部通过。

D04-S04：

- 首次提交未使用 break 主动退出。
- 求和结果输出中的 N 未替换为实际输入。
- 九九乘法表缺少标题，并存在行末多余空格。
- 修改为 while(true) 和 break 配合退出。
- 修复 printf 求和输出。
- 补充乘法表标题和空格判断。
- 第一次修改后 12 组业务测试全部通过。

当前无已知阻断性 Java 程序功能问题。

## 5. Git 状态

- 本地 Git 仓库：已建立。
- GitHub 远程仓库：`yhsx1/java-90-days`。
- 主要分支：`main`。
- Day 01 历史代码及学习记录：已提交。
- Day 02 历史代码及学习记录：已提交。
- Day 02 已确认的历史提交：`d29df72`。
- Day 03 历史代码及学习记录：已提交。
- Day 03 已验收提交：`ed7f5d4`。
- Day 03 GitHub 推送：已验收通过。
- Day 04 四个 Java 程序：全部正式验收通过。
- Day 04 学习任务、学习笔记、进度记录与交接文档：已整理，已保存。
- Day 04 Git 提交：已提交。
- Day 04 GitHub 推送：已推送。
- Day 04 本地工作区当前状态：已通过 Git 命令核验。
- Java 编译生成的 `.class` 文件：不纳入版本管理。

Day 04 归档提交信息：

`feat(day04): complete Java loops and number practice exercises`

## 6. 下一天任务

Day 05 主题：

**Java 数组、一维数组遍历、索引。**

计划课程：

1. 一维数组的概念、声明与初始化。
2. 数组索引、length 与边界。
3. 使用循环遍历数组。
4. ScoreStatistics.java 综合编程与测试。

当天核心验收文件：

`01-java-basics/day05/code/ScoreStatistics.java`

工作目录：

`01-java-basics/day05/`

主要验收目标：

- 理解数组的基本作用。
- 掌握一维数组声明、创建与初始化。
- 正确使用数组索引访问元素。
- 正确理解数组 length。
- 使用 for 循环遍历数组。
- 正确处理数组访问边界。
- 计算学生成绩最高分。
- 计算学生成绩最低分。
- 计算学生成绩平均分。
- 完成 ScoreStatistics.java 核心综合验收。

需要继承：

- `README.md`
- `docs/progress.md`
- `docs/handoffs/day04.md`
- `01-java-basics/day04/tasks.md`
- `01-java-basics/day04/notes.md`
- `01-java-basics/day04/code/` 中的四个 Java 程序
- Day 01–03 已验收历史记录

教学要求：

- 每次只讲一节课。
- 一课一练，逐课验收。
- 每节课提供知识讲解和实际编程任务。
- 核心综合验收文件必须按照 README 安排。
- 不提前进入 Day 06 的方法知识。
- Day 01–77 不安排理论问答。
- 不重复系统讲授 Day 01–04 已掌握内容。
- 每日学习时间控制在 2–3 小时。
- 所有提交环节使用可提交到当前会话的交互式区域。
- 代码独立编写，审查时先提供修改建议。
- Markdown 归档沿用既定章节组织。
- 不提前标记未完成课程通过。

**Day 04 Java 课程已全部完成，Git 归档待提交与推送验收；Day 05 按 README 正式路线开展。**