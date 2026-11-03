# Java 90 Days

> 90 天 Java 后端开发系统学习计划，以 Java 后端工程师为主线，以 AI 智能体应用开发为辅线。

## 1. 项目简介

本仓库用于记录为期 90 天的 Java 系统学习、编程练习、项目开发与求职准备过程。

学习目标：

- 系统掌握 Java 核心语法和面向对象编程。
- 掌握 Java 集合、异常处理、IO、多线程和 JVM 基础。
- 熟悉 MySQL、JDBC、SQL 和事务处理。
- 掌握 Spring Boot、MyBatis、Redis 和 Spring Security。
- 具备 REST API 设计、数据库开发、自动化测试及项目部署能力。
- 学习 Spring AI、大语言模型 API、RAG 和 AI 工具调用。
- 完成具有一定工程质量的 Java 后端项目。
- 为 Java 后端开发实习及校招做好准备。

学习周期：90 天。

每日投入：2–3 小时。

学习原则：循序渐进、注重原理、独立编码、项目驱动、逐课验收。

## 2. 技术栈

### Java 核心

- Java 21 LTS
- 面向对象编程
- Java 集合框架
- 泛型与异常处理
- 文件 IO
- Lambda 与 Stream
- Java 并发
- JVM 基础
- Maven
- JUnit

### 后端开发

- Spring Framework
- Spring Boot 3.5.x（规划版本）
- MyBatis
- MySQL 8.x
- Redis
- Spring Security
- JWT
- REST API

### 工程化

- Git / GitHub
- Linux 基础
- Docker / Docker Compose
- 日志与配置管理
- 接口测试
- 自动化测试
- 项目文档

### AI 智能体

- 大语言模型 API
- Spring AI
- Prompt Engineering
- 多轮对话
- Embedding
- 向量检索
- RAG
- Tool Calling
- AI 与 Java 业务系统集成

说明：以上是整个 90 天的计划技术栈，不代表当前已经掌握或安装了所有工具。实际版本将在相应课程中检查兼容性。

## 3. 90 天学习路线

| 阶段     | 时间      | 学习主题               | 阶段成果                       |
|----------|-----------|------------------------|--------------------------------|
| 第一阶段 | Day 01–21 | Java 基础与面向对象    | 学生管理系统控制台版本         |
| 第二阶段 | Day 22–35 | Java 核心进阶与数据库  | 学生管理系统 MySQL 版本        |
| 第三阶段 | Day 36–56 | Spring Boot 后端开发   | 校园课程管理核心后端           |
| 第四阶段 | Day 57–77 | 后端工程化与 AI 智能体 | 校园课程管理与 AI 助手综合项目 |
| 第五阶段 | Day 78–90 | 面试准备与求职冲刺     | 项目整理、简历和模拟面试       |

阶段综合验收安排：

- Day 21：Java 基础项目验收
- Day 35：Java 核心与数据库验收
- Day 56：Spring Boot 后端验收
- Day 77：工程化与 AI 集成验收
- Day 90：最终求职能力综合验收

### 3.1 逐日学习安排（Day 01–90）

> 以下为计划中的课程与验收要求，不代表已经完成。实际完成情况以第 8 节及每日 `tasks.md`、`notes.md`、`docs/handoffs/` 为准。Day 01–77 仅进行编码和实操验收；理论问答集中在 Day 78–90。

逐日学习安排中列出的 `.java` 文件是当天的核心综合验收文件。

每天可以根据知识点安排针对性的小练习，但不强制每节课都创建独立 Java 文件。当天以完成核心知识点、独立编程和综合验收为主要目标。

#### 第一阶段：Java 基础与面向对象（Day 01–21）

阶段目标：不依赖 Python 编写 Java 程序，能够独立构建面向对象的命令行应用。

##### 第 1 周：Java 基础语法（Day 01–07）

| 天数  | 课程知识点                                  | 当天练习 / 验收标准                                  |
|-------|---------------------------------------------|------------------------------------------------------|
| Day01 | JDK、IDEA、`main()`、`System.out.println()` | `HelloJava.java`；独立编译并运行程序，完成环境验证   |
| Day02 | 变量、基本数据类型、类型转换、输入输出      | `StudentInfo.java`；读取姓名、年龄、分数并格式化输出 |
| Day03 | 运算符、`if/else`、`switch`                 | `GradeJudge.java`；完成成绩等级判断与边界测试        |
| Day04 | `for`、`while`、`break`、`continue`         | `NumberPractice.java`；完成求和、九九乘法表          |
| Day05 | 数组、一维数组遍历、索引                    | `ScoreStatistics.java`；计算最高分、最低分、平均分   |
| Day06 | 方法定义、参数、返回值、方法重载            | `Calculator.java`；封装加减乘除、最大值计算          |
| Day07 | 第一周复习与综合考核                        | 完成命令行学生成绩统计器；至少通过 5 组测试          |

**周验收：** 能够独立创建 Java 类、读取用户输入、使用条件与循环控制流程，并把重复逻辑提取到方法中。

##### 第 2 周：Java 面向对象（Day 08–14）

| 天数  | 课程知识点                            | 当天练习 / 验收标准                 |
|-------|---------------------------------------|-------------------------------------|
| Day08 | 类、对象、字段、成员方法              | `Student.java`；创建多个学生对象    |
| Day09 | 构造方法、`this`、封装、getter/setter | 验证学生年龄和成绩，禁止非法数据    |
| Day10 | 继承、`super`、方法重写               | 实现 `Person`、`Student`、`Teacher` |
| Day11 | 多态、向上转型、动态绑定              | 使用父类引用处理不同子类对象        |
| Day12 | 抽象类、接口                          | 设计 `ScoreService` 接口和实现类    |
| Day13 | `static`、`final`、包、访问修饰符     | 拆分 `model`、`service`、`app` 包   |
| Day14 | 面向对象综合项目                      | 完成学生管理系统 V1；支持增删改查   |

**周验收：** 完成具有合理类结构的学生管理系统，正确使用封装、继承、多态和接口，不允许把全部业务逻辑放在 `main()` 方法中。

##### 第 3 周：集合、异常与工程基础（Day 15–21）

| 天数  | 课程知识点                                 | 当天练习 / 验收标准                               |
|-------|--------------------------------------------|---------------------------------------------------|
| Day15 | `String`、`StringBuilder`、字符串常用 API  | `StringUtilsPractice.java`；完成清洗、搜索、拼接  |
| Day16 | `List`、`ArrayList`、`Set`                 | `CollectionPractice.java`；实现存储与去重         |
| Day17 | `Map`、`HashMap`、泛型                     | 使用 `Map<Integer, Student>` 管理学生信息         |
| Day18 | 异常、`try/catch`、自定义异常              | 对非法输入、重复学号抛出和处理异常                |
| Day19 | 文件 IO、`Files`、路径、try-with-resources | 将学生数据保存到本地文件并重新读取                |
| Day20 | Lambda、Stream、Maven、JUnit 入门          | 使用 Stream 统计成绩，为服务方法编写单元测试      |
| Day21 | 第一阶段综合验收                           | 学生管理系统 V2：增删改查、持久化、异常处理、测试 |

**周验收：** 完成学生管理系统 V2，支持集合存储、文件持久化、异常处理和单元测试，能够使用 Maven 构建项目。

**阶段交付物：** `projects/student-manager-console/`；完成增删改查、集合存储、文件持久化、异常处理、Maven 构建和基础 JUnit 测试，至少覆盖 8 个关键测试场景。

#### 第二阶段：数据库与 Java 核心进阶（Day 22–35）

阶段目标：理解 Java 后端的数据库持久化、并发处理及网络请求。

##### 第 4 周：MySQL 与 JDBC（Day 22–28）

| 天数  | 课程知识点                           | 当天练习 / 验收标准                   |
|-------|--------------------------------------|---------------------------------------|
| Day22 | MySQL 安装、数据库、数据表、数据类型 | 创建 `student_db`、`student` 表       |
| Day23 | SQL 增删改查、`WHERE`、`ORDER BY`    | 编写至少 10 条 SQL 并验证结果         |
| Day24 | 聚合、分组、分页、JOIN               | 建立班级表，完成关联与统计查询        |
| Day25 | 主键、外键、索引、`EXPLAIN`          | 为学生查询设计索引并观察执行计划      |
| Day26 | 事务、ACID、隔离级别                 | 设计转账示例，验证提交与回滚          |
| Day27 | JDBC、PreparedStatement、DAO         | 使用 Java 实现学生数据库 CRUD         |
| Day28 | 数据库阶段项目验收                   | 学生管理系统 V3：从文件存储改为 MySQL |

**周验收：** 独立创建数据库、编写 SQL、验证事务回滚，通过 JDBC 实现学生 CRUD，使用参数化查询。

##### 第 5 周：Java 核心与 Web 基础（Day 29–35）

| 天数  | 课程知识点                       | 当天练习 / 验收标准                                   |
|-------|----------------------------------|-------------------------------------------------------|
| Day29 | 进程、线程、Thread、Runnable     | 编写两个并发执行的任务                                |
| Day30 | 线程安全、`synchronized`、线程池 | 复现计数器竞态问题并修复                              |
| Day31 | JVM、堆栈、GC、类加载入门        | 使用 JVM 工具观察运行进程与对象创建                   |
| Day32 | HTTP、URL、状态码、JSON          | 使用 Postman 或 curl 发送 HTTP 请求                   |
| Day33 | TCP/IP、DNS、HTTPS、REST 基础    | 使用网络工具观察 DNS 解析与 HTTP 请求                 |
| Day34 | Linux 基础、常用命令、进程与端口 | 完成文件、进程、网络命令练习                          |
| Day35 | 第二阶段综合验收                 | 完成 JDBC、事务、线程安全、HTTP 和 Linux 综合实操测试 |

**周验收：** Java 正确操作 MySQL，完成事务和线程安全实验，能够使用基本网络与 Linux 命令。

**阶段交付物：** `Student Manager Console V3`；支持 MySQL/JDBC CRUD、参数化查询与异常处理，保留数据库初始化 SQL 和实验运行结果。

#### 第三阶段：Spring Boot 后端开发（Day 36–56）

阶段目标：建立可运行的 REST API 后端，完成数据库、事务、认证、缓存和测试。

##### 第 6 周：Spring 与第一个 Web API（Day 36–42）

| 天数  | 课程知识点                          | 当天练习 / 验收标准                   |
|-------|-------------------------------------|---------------------------------------|
| Day36 | Spring IoC、DI、Bean                | 用一个小例子验证依赖注入              |
| Day37 | Spring Boot 项目创建、Starter、配置 | 创建项目并成功启动                    |
| Day38 | Controller、REST API、请求参数      | 完成 `/api/hello` 和学生查询接口      |
| Day39 | Service 分层、依赖注入、DTO         | 将 Controller 与业务逻辑分离          |
| Day40 | GET、POST、PUT、DELETE、状态码      | 完成基于内存数据的 CRUD API           |
| Day41 | 参数校验、统一异常处理、响应规范    | 正确处理缺失字段和非法成绩            |
| Day42 | Spring Boot 第一周验收              | 完成学生管理 API V1；接口可用工具测试 |

**周验收：** 能独立启动 Spring Boot 项目，开发 CRUD 接口，完成参数校验和统一异常处理。

##### 第 7 周：持久层与事务（Day 43–49）

| 天数  | 课程知识点                 | 当天练习 / 验收标准                   |
|-------|----------------------------|---------------------------------------|
| Day43 | MyBatis、Mapper、SQL 映射  | Spring Boot 连接 MySQL                |
| Day44 | MyBatis CRUD、动态 SQL     | 将学生接口接入真实数据库              |
| Day45 | 分页、排序、条件查询       | 实现学生列表分页及姓名搜索            |
| Day46 | 数据库设计与课程选课关系   | 创建学生、课程、选课三张表            |
| Day47 | `@Transactional`、事务边界 | 完成选课与容量更新的事务操作          |
| Day48 | Spring AOP、常用注解、日志 | 使用 AOP 添加请求日志                 |
| Day49 | 后端阶段验收               | 学生及课程 API 可完成 CRUD 和选课流程 |

**周验收：** Spring Boot 和 MySQL 正常联调，选课业务、事务回滚与分页查询正确。

##### 第 8 周：Redis、认证与测试（Day 50–56）

| 天数  | 课程知识点                     | 当天练习 / 验收标准                              |
|-------|--------------------------------|--------------------------------------------------|
| Day50 | Redis 数据类型、基本命令       | 操作 String、Hash、Set 与过期时间                |
| Day51 | Spring Boot 集成 Redis         | 缓存课程列表，设置 TTL                           |
| Day52 | 缓存一致性、缓存穿透基础       | 数据更新后缓存正确失效                           |
| Day53 | 密码哈希、登录、会话与 JWT     | 实现基础登录与认证                               |
| Day54 | Spring Security 基础、授权控制 | 未认证用户不能访问受保护接口                     |
| Day55 | JUnit、MockMvc、接口测试       | 为关键服务和接口增加自动化测试                   |
| Day56 | 第三阶段综合验收               | 后端业务系统 V1.0：API、MySQL、Redis、认证、测试 |

**周验收：** 系统具备持久化、缓存、认证、授权及基础自动化测试。

**阶段交付物：** `projects/campus-assistant-platform/` 的 V1.0；含学生与课程管理、选课事务、MyBatis、Redis、认证授权、异常处理与自动化测试。

#### 第四阶段：项目工程化与 AI 智能体集成（Day 57–77）

阶段目标：完善后端工程质量，并将 RAG、工具调用与现有业务系统集成。

##### 第 9 周：项目完善与部署（Day 57–63）

| 天数  | 课程知识点                       | 当天练习 / 验收标准                |
|-------|----------------------------------|------------------------------------|
| Day57 | 项目结构复盘、分层设计、职责划分 | 清理重复代码，优化包结构           |
| Day58 | 并发业务场景、选课容量竞争       | 构造同时选课场景，保证容量不超限   |
| Day59 | 乐观锁、条件更新、幂等性基础     | 修复重复请求和超额选课风险         |
| Day60 | 日志分级、异常处理、配置隔离     | 区分开发配置和生产配置             |
| Day61 | Docker 基础、Dockerfile          | 将 Spring Boot 应用构建为镜像      |
| Day62 | Docker Compose、MySQL、Redis     | 编排本地服务并验证数据库连接       |
| Day63 | Java 项目工程化验收              | 编写启动文档、测试说明和项目架构图 |

**周验收：** 处理并发选课、重复提交，配置规范，Docker 部署验证通过。

##### 第 10 周：AI 应用基础（Day 64–70）

| 天数  | 课程知识点                      | 当天练习 / 验收标准                         |
|-------|---------------------------------|---------------------------------------------|
| Day64 | LLM、Token、Prompt、模型 API    | 发送模型请求并验证响应结构                  |
| Day65 | Java HTTP Client、模型 API 调用 | Java 程序完成一次模型问答                   |
| Day66 | Spring AI、ChatClient           | Spring Boot 提供 AI 问答接口                |
| Day67 | System Prompt、上下文、多轮对话 | 支持会话 ID 与基础对话历史                  |
| Day68 | Embedding、向量、语义检索原理   | 对示例文本生成向量并完成相似度检索          |
| Day69 | RAG 基础、文档切分、向量存储    | 构建小型校园制度知识库检索                  |
| Day70 | AI 阶段验收                     | AI 助手能基于知识库回答问题，并提供检索来源 |

**周验收：** Java 可调用大模型，AI 接口可运行，能够完成文档向量检索与知识库问答。

##### 第 11 周：工具调用与 AI 项目交付（Day 71–77）

| 天数  | 课程知识点                       | 当天练习 / 验收标准                  |
|-------|----------------------------------|--------------------------------------|
| Day71 | Tool Calling 原理、工具定义      | 实现查询课程的 Java 工具方法         |
| Day72 | Spring AI 工具集成               | AI 助手能够通过授权接口获取课程信息  |
| Day73 | 工具权限、输入校验、提示注入基础 | 阻止未授权查询及非法工具参数         |
| Day74 | AI 助手与业务平台整合            | 完成知识库问答与课程查询流程         |
| Day75 | 异常与降级、超时处理、测试       | 模型不可用时接口返回合理错误         |
| Day76 | 项目 README、接口文档、架构图    | GitHub 仓库具备完整运行说明          |
| Day77 | 第四阶段综合验收                 | 演示后端业务系统与 AI 助手的核心功能 |

**周验收：** 知识库问答、经授权的课程查询可用，接口具备权限校验和异常处理，文档与代码一致。

**阶段交付物：** `Campus Assistant Platform V2.0`；包括并发选课、Docker 部署、Spring AI、RAG、工具调用、授权查询、异常处理及测试。

#### 第五阶段：面试准备与求职冲刺（Day 78–90）

阶段目标：把项目与编程能力转化为面试表达能力，完善求职材料。本阶段开始理论问答训练。

##### 第 12 周：Java 后端高频面试专题（Day 78–84）

| 天数  | 课程知识点                         | 当天练习 / 验收标准                |
|-------|------------------------------------|------------------------------------|
| Day78 | Java 基础：OOP、String、异常、泛型 | 独立口述 10 道基础面试题           |
| Day79 | 集合：ArrayList、HashMap、HashSet  | 解释使用场景、哈希冲突、基本复杂度 |
| Day80 | 并发：线程池、锁、volatile、死锁   | 回答 8 道常见并发题并完成小实验    |
| Day81 | JVM：内存、GC、类加载              | 绘制核心结构并解释常见问题         |
| Day82 | MySQL：索引、事务、锁、SQL 优化    | 通过 10 道数据库问答与 SQL 练习    |
| Day83 | Spring：IoC、AOP、事务、Bean       | 结合实际项目解释这些技术           |
| Day84 | Redis、HTTP、网络、Linux 综合复盘  | 进行一次 40 分钟模拟技术面试       |

**周验收：** 回答 Java 后端高频问题，结合项目解释技术场景，完成综合模拟面试。

##### 第 13 周：算法、项目复盘与简历（Day 85–90）

| 天数  | 课程知识点                     | 当天练习 / 验收标准              |
|-------|--------------------------------|----------------------------------|
| Day85 | 数组、双指针、哈希表           | 限时完成 2 道基础算法题          |
| Day86 | 链表、栈、队列、二分查找       | 完成 2 道算法题并分析复杂度      |
| Day87 | 二叉树、DFS/BFS、动态规划入门  | 完成 2 道题或在提示下完成        |
| Day88 | 项目复盘、架构设计、业务难点   | 完成 3–5 分钟项目介绍并接受追问  |
| Day89 | Java 后端简历、GitHub 项目整理 | 完成初版简历，检查项目可复现性   |
| Day90 | 综合技术模拟面试和最终验收     | 完成知识测验、现场编码和项目答辩 |

**周验收：** 完成基础算法训练、项目技术答辩、简历初稿及最终综合面试。

**阶段交付物：** Java 面试复习资料、LeetCode 练习、项目技术介绍、简历及完整 GitHub 项目展示。

## 4. 正式项目

整个学习周期主要维护两个正式项目。

### Project 01：Student Manager Console

项目路径：

`projects/student-manager-console/`

计划开发周期：Day 08–35。

主要功能：

1. 学生信息录入、查询、修改和删除。
2. 学生成绩管理与统计。
3. 面向对象分层设计。
4. Java 集合存储。
5. 参数校验与异常处理。
6. 文件 IO 持久化。
7. Maven 工程管理。
8. JUnit 单元测试。
9. JDBC 数据库访问。
10. MySQL 数据持久化。

项目目标：验证 Java 核心基础与数据库开发能力。

当前状态：尚未开始。

### Project 02：Campus Assistant Platform

项目路径：

`projects/campus-assistant-platform/`

计划开发周期：Day 36–77。

主要功能：

1. 用户与学生管理。
2. 课程管理。
3. 学生选课和退课。
4. 重复选课校验。
5. MySQL 数据持久化。
6. Spring Boot REST API。
7. MyBatis 数据访问。
8. 参数校验与统一异常处理。
9. 登录认证与权限控制。
10. Redis 课程缓存。
11. 并发选课与数据一致性。
12. 自动化测试。
13. Docker 部署。
14. Spring AI 大模型接口。
15. 校园课程制度 RAG 知识库。
16. AI 工具调用。
17. 基于用户身份的业务数据查询。
18. AI 安全防护及异常处理。
19. README、接口文档与架构图。

项目目标：形成用于 Java 后端求职展示的综合工程项目。

当前状态：尚未开始。

## 5. 仓库目录结构

完整规划结构：

```text
java-90-days/
├── README.md
├── .gitignore
│
├── docs/
│   ├── progress.md
│   ├── checkpoints/
│   └── handoffs/
│
├── 01-java-basics/
│   ├── day01/
│   ├── day02/
│   └── ...
│
├── 02-java-core-database/
│   └── ...
│
├── 03-spring-boot/
│   └── ...
│
├── 04-ai-integration/
│   └── ...
│
├── 05-interview/
│   └── ...
│
└── projects/
    ├── student-manager-console/
    └── campus-assistant-platform/
```

注意：以上为长期规划，不代表这些目录已经全部创建。

每日根据实际课程逐步创建文件，不提前生成全部 90 天目录。

### 每日学习目录

以 Day 02 为例：

```text
01-java-basics/
└── day02/
    ├── code/
    │   ├── StudentInfoDemo.java
    │   ├── BookOrderCalculator.java
    │   ├── StudentProfilePrinter.java
    │   ├── CourseStatisticsReport.java
    │   └── StudentInfo.java
    ├── tasks.md
    └── notes.md
```

- `code/`：当天独立编程练习。
- `tasks.md`：课程任务与验收记录。
- `notes.md`：知识点、代码要点和错误记录。

每日路线图中指定的 Java 源文件作为当天的核心综合验收产物。

教学过程中可以安排针对性小练习，但不要求每天只能创建一个 Java 文件，也不强制每节课创建一个新文件。

优先保证核心知识覆盖、独立编码、运行测试和学习时间合理。

### 正式项目目录

学习 Maven 后，正式 Java 项目采用标准 Maven 结构。

Spring Boot 项目根据业务需求逐步添加 controller、service、mapper、entity、dto、config、exception、security、ai 等包。

不提前引入复杂微服务或多模块架构。

## 6. 学习与验收规则

采用：

**知识讲解 → 示例演示 → 独立实操 → 提交代码 → 代码检查 → 提示修改 → 正式验收**

基本要求：

1. 每次只学习一节课。
2. 当前课程验收通过后才能学习下一节。
3. 编程任务必须独立完成。
4. 不提前提供完整练习答案。
5. 所有任务包含明确文件路径、功能要求、运行方式和验收标准。
6. 代码审查关注正确性、边界条件、异常处理和代码规范。
7. 出现错误时先提示修改，再重新提交。
8. 不假设代码已经编译、运行或提交。
9. 每天控制在 2–3 小时。
10. 每天使用一个独立会话。
11. 所有需要提交内容的环节提供交互式提交框。
12. 路线图指定的 Java 文件为当天核心综合验收文件。
13. 小练习根据学习需要安排，不单纯追求文件数量。
14. 每天最后的核心综合练习必须覆盖当天原定的主要知识点。
15. 已经通过实际编程验证的内容不重复安排同类任务。

### 理论问答限制

Day 01–77：

- 不安排理论问答题。
- 不安排选择题、判断题或填空题。
- 不安排面试模拟或 Java 八股文背诵。
- 通过实际编码、实验和项目功能进行验收。

Day 78–90 统一进行理论知识、算法、项目答辩和技术面试训练。

## 7. Git 管理规范

- 使用统一仓库 `java-90-days`。
- 每天完成验收后形成合理的提交记录。
- 不提交 `.class`、`target/`、`out/`、IDE 本地缓存和日志。
- 不提交数据库密码、API Key 或 Token。
- 不覆盖已有代码。
- 阶段项目完成后可以创建 Git Tag。
- 不在未确认时标记已推送 GitHub。

Commit Message 示例：

```text
feat(day01): complete Java fundamentals and environment setup
feat(day02): complete Java basics exercises and learning records
docs(day02): update Java input output learning records
feat(student-manager): implement student CRUD
fix(campus-assistant): prevent duplicate enrollment
```

## 8. 当前学习进度

最后更新：2026-11-03。

| 学习日 | 主题                                   | 状态   |
|--------|----------------------------------------|--------|
| Day 01 | Java 基础认知、开发环境、第一个程序    | 已完成 |
| Day 02 | 基本数据类型、变量、常量与基础输入输出 | 已完成 |

当前已完成：2 / 90 天。

Day 01 课程验收：4 / 4 通过。

Day 02 课程验收：4 / 4 通过。

Day 02 Java 编程练习：5 / 5 通过。

当前开发环境：

- JDK：Eclipse Temurin 21.0.12.1 LTS
- IDE：IntelliJ IDEA
- Project SDK：temurin-21

已完成第一个 Java 程序：

`01-java-basics/day01/code/HelloJava.java`

Day 02 已完成五个独立 Java 练习：

- `01-java-basics/day02/code/StudentInfoDemo.java`
- `01-java-basics/day02/code/BookOrderCalculator.java`
- `01-java-basics/day02/code/StudentProfilePrinter.java`
- `01-java-basics/day02/code/CourseStatisticsReport.java`
- `01-java-basics/day02/code/StudentInfo.java`

五个 Java 程序均通过编译运行及正式验收。

其中：

- CourseStatisticsReport.java：16/16 测试通过。
- StudentInfo.java：15/15 测试通过，完成两组输入输出测试。

Day 02 已完成变量、基本数据类型、类型转换、常量、算术运算、Scanner 标准输入与 printf 格式化输出等内容。

## 9. 学习记录

- [每日学习进度](docs/progress.md)
- [Day 01 学习任务](01-java-basics/day01/tasks.md)
- [Day 01 学习笔记](01-java-basics/day01/notes.md)
- [Day 01 交接记录](docs/handoffs/day01.md)
- [Day 02 学习任务](01-java-basics/day02/tasks.md)
- [Day 02 学习笔记](01-java-basics/day02/notes.md)
- [Day 02 交接记录](docs/handoffs/day02.md)

后续学习记录按天持续补充。

## 10. 当前项目状态

- Student Manager Console：未开始。
- Campus Assistant Platform：未开始。
- Git 本地仓库及 GitHub 历史提交状态：已提交。

下一步：Day 03，Java 运算符、if/else、switch 与成绩等级判断。

Day 03 核心综合验收文件：

`01-java-basics/day03/code/GradeJudge.java`