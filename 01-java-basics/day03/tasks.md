# Day 03 学习任务

## 基本信息

- 所属阶段：第一阶段，Java 基础与面向对象
- 学习日期：2026-11-05 至 2026-11-08
- 课程主题：Java 运算符、if/else、switch 与成绩等级判断
- 工作目录：`01-java-basics/day03/`
- 课程总数：4
- Java 编程练习：4 个
- 正式验收结果：全部通过

## 第 1 课：关系运算符、逻辑运算符与布尔表达式

### 学习内容

- [x] 关系运算符：>、<、>=、<=、==、!=
- [x] boolean 比较结果
- [x] 逻辑与 &&
- [x] 逻辑或 ||
- [x] 逻辑非 !
- [x] 逻辑运算真值规则
- [x] 短路求值
- [x] 多条件布尔表达式
- [x] 运算符优先级
- [x] 使用括号明确运算顺序
- [x] Java 与 Python 逻辑运算的区别
- [x] Java 后端业务条件表达式

### 实操任务

文件路径：

`01-java-basics/day03/code/LibraryAccessCheck.java`

练习目标：

独立编写校园图书馆借阅资格判断程序，使用关系运算符和逻辑运算符，根据学生年龄、账户状态、违规记录、会员身份及信用积分判断最终借阅资格。

- [x] 创建 public class LibraryAccessCheck
- [x] 编写 main 方法
- [x] 声明五个业务变量
- [x] 使用 int 和 boolean 保存业务数据
- [x] 判断学生年龄是否处于 18–60 岁
- [x] 使用 ! 判断是否不存在违规记录
- [x] 使用 || 判断会员身份或信用积分是否合格
- [x] 使用 && 组合所有借阅条件
- [x] 正确包含 accountActive 账户状态条件
- [x] 输出五行布尔判断结果
- [x] 使用 javac 编译
- [x] 使用 java 命令运行
- [x] 完成六组业务测试
- [x] 修复遗漏的账户状态条件
- [x] 通过全部正式验收项目

### 验收结果

| 编号 | 测试内容              | 结果 |
|------|-----------------------|------|
| TC01 | Java 文件与类名一致   | 通过 |
| TC02 | 五个变量类型与初始值  | 通过 |
| TC03 | 年龄区间判断          | 通过 |
| TC04 | 逻辑非使用            | 通过 |
| TC05 | 逻辑或使用            | 通过 |
| TC06 | 最终借阅条件完整性    | 通过 |
| TC07 | 运算符优先级          | 通过 |
| TC08 | 五行输出内容一致性    | 通过 |
| TC09 | 六组业务测试          | 通过 |
| TC10 | 未使用超前语法        | 通过 |
| TC11 | Java 编译与命令行运行 | 通过 |
| TC12 | 代码规范              | 通过 |

六组业务测试结果：

| 测试 | 测试场景             | 预期结果 | 实际结果 |
|------|----------------------|----------|----------|
| TC01 | 正常借阅             | true     | true     |
| TC02 | 年龄不足             | false    | false    |
| TC03 | 年龄恰好 60 岁       | true     | true     |
| TC04 | 存在违规记录         | false    | false    |
| TC05 | 非会员且信用积分不足 | false    | false    |
| TC06 | 账户状态异常         | false    | false    |

首次提交遗漏 accountActive 账户正常条件，导致最终借阅资格判断不完整。

修改后将账户状态纳入逻辑表达式，重新编译运行，六组测试全部通过。

**课程状态：验收通过**

## 第 2 课：if/else 条件判断

### 学习内容

- [x] Java 流程控制的基本概念
- [x] if 单分支语句
- [x] if/else 双分支语句
- [x] else if 多分支语句
- [x] 条件表达式的执行顺序
- [x] 多分支互斥执行机制
- [x] 数值区间判断
- [x] 条件重叠与条件遗漏
- [x] 条件遮蔽问题
- [x] 非法业务数据处理
- [x] 花括号与代码块
- [x] Java 与 Python 条件分支的区别
- [x] Java 后端业务条件判断

### 实操任务

文件路径：

`01-java-basics/day03/code/ShippingFeeCalculator.java`

练习目标：

独立编写订单运费计算程序，从控制台读取订单金额，使用 if/else if/else 判断金额区间，计算运费和最终应付金额，并正确处理非法输入。

- [x] 创建 public class ShippingFeeCalculator
- [x] 编写 main 方法
- [x] 导入 java.util.Scanner
- [x] 创建 Scanner 对象
- [x] 使用 nextDouble 读取订单金额
- [x] 使用 if/else if/else 完成多分支判断
- [x] 正确处理小于 0 的非法金额
- [x] 计算 0–50 元区间运费
- [x] 计算 50–100 元区间运费
- [x] 计算 100 元及以上区间运费
- [x] 正确计算最终应付金额
- [x] 使用 printf 输出两位小数
- [x] 正确处理 0、50、100 等边界
- [x] 使用 javac 编译
- [x] 使用 java 命令运行
- [x] 完成十组业务测试
- [x] 检查输出内容一致性
- [x] 通过全部正式验收项目

### 验收结果

| 编号 | 测试内容              | 结果 |
|------|-----------------------|------|
| TC01 | Java 文件与类名一致   | 通过 |
| TC02 | Scanner 读取 double   | 通过 |
| TC03 | 非法负数判断          | 通过 |
| TC04 | 0–50 元区间           | 通过 |
| TC05 | 50–100 元区间         | 通过 |
| TC06 | 100 元及以上区间      | 通过 |
| TC07 | 多分支执行顺序        | 通过 |
| TC08 | 区间无遗漏与错误重叠  | 通过 |
| TC09 | 运费计算              | 通过 |
| TC10 | 最终金额计算          | 通过 |
| TC11 | 非法金额输出          | 通过 |
| TC12 | 控制台输出格式        | 通过 |
| TC13 | 十组业务测试          | 通过 |
| TC14 | Java 编译与命令行运行 | 通过 |
| TC15 | 代码规范与语法范围    | 通过 |

十组业务测试结果：

| 测试 | 输入金额 |  运费 | 最终金额 | 结果 |
|------|---------:|------:|---------:|------|
| TC01 |    -0.01 |  非法 |   不输出 | 通过 |
| TC02 |      -10 |  非法 |   不输出 | 通过 |
| TC03 |        0 | 10.00 |    10.00 | 通过 |
| TC04 |    49.99 | 10.00 |    59.99 | 通过 |
| TC05 |       50 |  5.00 |    55.00 | 通过 |
| TC06 |    75.50 |  5.00 |    80.50 | 通过 |
| TC07 |    99.99 |  5.00 |   104.99 | 通过 |
| TC08 |      100 |  0.00 |   100.00 | 通过 |
| TC09 |      150 |  0.00 |   150.00 | 通过 |
| TC10 |  1000.25 |  0.00 |  1000.25 | 通过 |

主要计算结果：

- 订单金额 0 元：运费 10.00 元，总金额 10.00 元。
- 订单金额 49.99 元：运费 10.00 元，总金额 59.99 元。
- 订单金额 50 元：运费 5.00 元，总金额 55.00 元。
- 订单金额 99.99 元：运费 5.00 元，总金额 104.99 元。
- 订单金额 100 元：运费 0.00 元，总金额 100.00 元。

首次提交即通过全部验收要求，无需修改代码。

代码审查记录了冗余条件及 else if 空格格式的优化建议。

**课程状态：验收通过**

## 第 3 课：switch 多分支选择

### 学习内容

- [x] switch 的作用与适用场景
- [x] 传统 switch 基本结构
- [x] case 固定值匹配
- [x] default 默认分支
- [x] break 结束 switch
- [x] 传统 switch 贯穿现象
- [x] 多个 case 共用执行逻辑
- [x] switch 支持的常见数据类型
- [x] Java 21 箭头式 switch 基础
- [x] switch 与 if/else 的区别
- [x] Java 与 Python match/case 对比
- [x] 后端订单状态码判断

### 实操任务

文件路径：

`01-java-basics/day03/code/OrderStatusChecker.java`

练习目标：

独立编写订单状态查询程序，使用传统 switch 根据用户输入的整数状态码输出对应状态和业务说明，并通过 default 处理非法状态。

- [x] 创建 public class OrderStatusChecker
- [x] 编写 main 方法
- [x] 使用 Scanner 读取整数状态码
- [x] 使用传统 switch 结构
- [x] 使用 case 1 输出 Pending
- [x] 使用 case 2 输出 Paid
- [x] 使用 case 3 输出 Shipped
- [x] 使用 case 4 输出 Completed
- [x] 使用 case 5 输出 Cancelled
- [x] 正确输出五个状态的业务说明
- [x] 在所有有效 case 中使用 break
- [x] 使用 default 处理非法状态码
- [x] 避免意外贯穿
- [x] 正确输出 Invalid order status
- [x] 使用 javac 编译
- [x] 使用 java 命令运行
- [x] 完成八组业务测试
- [x] 修复 default 输出格式问题
- [x] 通过全部正式验收项目

### 验收结果

| 编号 | 测试内容                 | 结果 |
|------|--------------------------|------|
| TC01 | Java 文件与类名一致      | 通过 |
| TC02 | Scanner 读取 int         | 通过 |
| TC03 | 传统 switch 结构         | 通过 |
| TC04 | case 1：Pending          | 通过 |
| TC05 | case 2：Paid             | 通过 |
| TC06 | case 3：Shipped          | 通过 |
| TC07 | case 4：Completed        | 通过 |
| TC08 | case 5：Cancelled        | 通过 |
| TC09 | 业务说明内容正确         | 通过 |
| TC10 | break 使用正确           | 通过 |
| TC11 | default 正确处理非法状态 | 通过 |
| TC12 | 无意外贯穿               | 通过 |
| TC13 | 八组业务测试             | 通过 |
| TC14 | Java 编译与命令行运行    | 通过 |
| TC15 | 代码规范与语法范围       | 通过 |

八组业务测试结果：

| 测试 | 状态码 | 实际结果             | 结果 |
|------|-------:|----------------------|------|
| TC01 |      1 | Pending              | 通过 |
| TC02 |      2 | Paid                 | 通过 |
| TC03 |      3 | Shipped              | 通过 |
| TC04 |      4 | Completed            | 通过 |
| TC05 |      5 | Cancelled            | 通过 |
| TC06 |      0 | Invalid order status | 通过 |
| TC07 |      6 | Invalid order status | 通过 |
| TC08 |     -1 | Invalid order status | 通过 |

首次提交时，default 输出了额外的 Status 和 Description 信息。

第一次修改后输出为 Unknown order status，仍不符合规定文字。

最终将 default 输出修改为 Invalid order status，重新编译并完成 TC06–TC08 复验，全部测试通过。

**课程状态：验收通过**

## 第 4 课：Day 03 综合编程验收

### 实操任务

文件路径：

`01-java-basics/day03/code/GradeJudge.java`

练习目标：

综合运用 Scanner、关系运算符、逻辑运算符、if/else、switch、char、String 和控制台输出，独立完成学生成绩等级判断程序。

- [x] 创建 public class GradeJudge
- [x] 编写 main 方法
- [x] 导入 java.util.Scanner
- [x] 使用 nextDouble 读取学生成绩
- [x] 使用 double 保存成绩
- [x] 正确识别小于 0 的非法成绩
- [x] 正确识别大于 100 的非法成绩
- [x] 使用 if/else 判断 A 等级
- [x] 使用 if/else 判断 B 等级
- [x] 使用 if/else 判断 C 等级
- [x] 使用 if/else 判断 D 等级
- [x] 使用 if/else 判断 F 等级
- [x] 使用 char 保存成绩等级
- [x] 使用传统 switch 匹配等级
- [x] 使用 String 保存等级说明
- [x] 正确使用 break
- [x] 输出 Grade 和 Description
- [x] 非法成绩只输出 Invalid score
- [x] 正确处理 0、60、70、80、90、100 等边界
- [x] 正确处理小数成绩
- [x] 使用 javac 编译
- [x] 使用 java 命令运行
- [x] 完成二十四组业务与边界测试
- [x] 通过全部综合验收项目

### 测试用例

| 编号 | 测试内容                  | 结果 |
|------|---------------------------|------|
| AC01 | Java 文件与类名一致       | 通过 |
| AC02 | Scanner 正确读取 double   | 通过 |
| AC03 | 变量类型合理              | 通过 |
| AC04 | 小于 0 的非法成绩         | 通过 |
| AC05 | 大于 100 的非法成绩       | 通过 |
| AC06 | 0 和 100 边界             | 通过 |
| AC07 | A 等级判断                | 通过 |
| AC08 | B 等级判断                | 通过 |
| AC09 | C 等级判断                | 通过 |
| AC10 | D 等级判断                | 通过 |
| AC11 | F 等级判断                | 通过 |
| AC12 | 成绩区间连续且互斥        | 通过 |
| AC13 | 多分支执行顺序            | 通过 |
| AC14 | 传统 switch 等级匹配      | 通过 |
| AC15 | 等级说明正确              | 通过 |
| AC16 | break 使用正确            | 通过 |
| AC17 | 非法成绩不输出正常等级    | 通过 |
| AC18 | 控制台输出格式            | 通过 |
| AC19 | 二十四组业务与边界测试    | 通过 |
| AC20 | Java 编译、运行及代码规范 | 通过 |

二十四组业务与边界测试：

| 编号 | 输入成绩 | 预期结果      | 结果 |
|------|---------:|---------------|------|
| TC01 |      100 | A / Excellent | 通过 |
| TC02 |     95.5 | A / Excellent | 通过 |
| TC03 |       90 | A / Excellent | 通过 |
| TC04 |    89.99 | B / Good      | 通过 |
| TC05 |     85.5 | B / Good      | 通过 |
| TC06 |       80 | B / Good      | 通过 |
| TC07 |    79.99 | C / Average   | 通过 |
| TC08 |     75.5 | C / Average   | 通过 |
| TC09 |       70 | C / Average   | 通过 |
| TC10 |    69.99 | D / Pass      | 通过 |
| TC11 |     65.5 | D / Pass      | 通过 |
| TC12 |       60 | D / Pass      | 通过 |
| TC13 |    59.99 | F / Fail      | 通过 |
| TC14 |     45.5 | F / Fail      | 通过 |
| TC15 |        0 | F / Fail      | 通过 |
| TC16 |    -0.01 | Invalid score | 通过 |
| TC17 |       -1 | Invalid score | 通过 |
| TC18 |     -100 | Invalid score | 通过 |
| TC19 |   100.01 | Invalid score | 通过 |
| TC20 |      101 | Invalid score | 通过 |
| TC21 |      150 | Invalid score | 通过 |
| TC22 |   89.999 | B / Good      | 通过 |
| TC23 |   59.999 | F / Fail      | 通过 |
| TC24 |   99.999 | A / Excellent | 通过 |

### 最终运行结果

A 等级：

```text
Enter student score: 95.5
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
Enter student score: 75.5
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
Enter student score: 100.01
Invalid score
```

精细边界：

```text
Enter student score: 89.999
Grade: B
Description: Good
```

### 验收结果

- javac 编译：成功
- java 运行：成功
- Scanner 标准输入：正确
- double 成绩读取：正确
- if/else 成绩等级判断：正确
- 五个成绩等级：全部正确
- 非法成绩判断：正确
- switch 等级说明：正确
- break 使用：正确
- 输出内容：完全匹配
- 成绩边界：全部正确
- 小数成绩处理：正确
- 综合审查项目：20/20 通过
- 业务与边界测试：24/24 通过

首次提交即通过全部验收要求，无需修改代码。

代码审查记录了重复合法性判断、非法成绩继续执行 switch 及空 default 的优化建议，均不影响当前程序的正确性。

**课程状态：验收通过**

## Day 03 最终总结

| 项目          | 结果                                                                           |
|---------------|--------------------------------------------------------------------------------|
| 完成课程      | 4 / 4                                                                          |
| 课程验收      | 全部通过                                                                       |
| Java 编程练习 | 4 个                                                                           |
| 编译运行      | 成功                                                                           |
| 代码修复      | 借阅条件遗漏、switch 默认分支输出格式问题                                      |
| 综合测试      | GradeJudge：AC01–AC20 全部通过，TC01–TC24 全部通过                             |
| 其他业务测试  | LibraryAccessCheck：6/6；ShippingFeeCalculator：10/10；OrderStatusChecker：8/8 |
| 累计业务测试  | 48/48 通过                                                                     |
| 分支控制      | 关系运算符、逻辑运算符、if/else、switch 通过验收                               |
| 学习记录      | 已整理                                                                         |
| Git 历史提交  | 已完成                                                                         |
| 正式项目开发  | 未开始                                                                         |
| 下一学习日    | Day 04                                                                         |

**Day 03 正式综合验收：通过**