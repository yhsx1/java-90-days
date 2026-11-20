# Java 90 Days

> 90 天 Java 系统学习与项目实战计划，以 Java 后端开发为主要方向，同时学习 AI 智能体应用开发。

## 1. 项目简介

本仓库用于持续记录 Java 90 天学习过程，包含每日课程、代码练习、项目开发、测试验收和求职准备成果。

### 学习目标

- 系统学习 Java 基础语法和面向对象编程。
- 掌握 Java 集合、泛型、异常、IO、多线程与 JVM 基础。
- 学习 MySQL、JDBC、SQL 和数据库事务。
- 使用 Spring Boot、MyBatis、Redis 和 Spring Security 开发后端服务。
- 掌握 REST API、参数校验、数据库开发和自动化测试。
- 学习 Linux、Git、Docker 等工程化技能。
- 探索 Spring AI、大语言模型 API、RAG 和工具调用。
- 完成能够展示真实开发能力的 Java 项目。
- 为计算机技术类岗位、Java 后端研发岗位及研究生校招做好准备。

学习周期：90 天。

每日学习时间：2–3 小时。

求职方向：江苏、浙江地区央国企计算机相关技术岗位，同时考虑 Java 研发及其他计算机技术岗位。

预计毕业年份：2028 年。

学习原则：循序渐进、理解原理、独立编程、按需测试、逐课验收、持续归档。

## 2. 技术栈

### Java 核心

- Java 21 LTS
- 基础语法与流程控制
- 面向对象编程
- Java 集合框架
- 泛型
- 异常处理
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
- Linux
- Docker / Docker Compose
- 日志管理
- 配置管理
- API 测试
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
- Java 后端与 AI 服务集成

上述技术属于整个学习周期的规划范围，不表示当前已经全部安装或掌握。相关工具和版本将在对应学习日逐步验证。

## 3. 90 天学习路线

| 阶段 | 学习日 | 学习主题 | 主要成果 |
|---|---|---|---|
| 第一阶段 | Day 01–21 | Java 基础与面向对象 | 学生管理系统控制台版本 |
| 第二阶段 | Day 22–35 | Java 核心进阶与数据库 | 学生管理系统 MySQL 版本 |
| 第三阶段 | Day 36–56 | Spring Boot 后端开发 | 校园课程管理核心后端 |
| 第四阶段 | Day 57–77 | 后端工程化与 AI 智能体 | 校园管理与 AI 助手综合项目 |
| 第五阶段 | Day 78–90 | 面试准备与求职冲刺 | 项目整理、简历和模拟面试 |

### 阶段综合验收

- Day 21：Java 基础项目验收。
- Day 35：Java 核心与数据库验收。
- Day 56：Spring Boot 后端验收。
- Day 77：工程化与 AI 集成验收。
- Day 90：最终求职能力综合验收。

### 3.1 逐日学习安排（Day 01–90）

以下列出各学习日原定的核心内容与实践目标。实际完成情况以第 8 节和每日归档文件为准。

逐日安排中的 `.java` 文件表示当天核心综合验收产物。可以根据学习需要设置其他练习，但不强制每一节都建立新的 Java 文件。

Day 01–77 以实际编程和项目验收为主，理论问答与模拟面试集中在 Day 78–90。

#### 第一阶段：Java 基础与面向对象（Day 01–21）

阶段目标：能够使用 Java 独立编写程序，掌握面向对象思想，并构建学生管理系统控制台应用。

##### 第 1 周：Java 基础语法（Day 01–07）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day01 | JDK、IDEA、main 方法、控制台输出 | HelloJava.java；验证 Java 编译与运行环境 |
| Day02 | 变量、基本数据类型、类型转换、输入输出 | StudentInfo.java；输入姓名、年龄、分数并完成格式化输出 |
| Day03 | 运算符、if/else、switch | GradeJudge.java；实现成绩等级判断及边界处理 |
| Day04 | for、while、break、continue | NumberPractice.java；完成整数求和与九九乘法表 |
| Day05 | 数组、一维数组遍历、索引 | ScoreStatistics.java；统计学生最高分、最低分和平均分 |
| Day06 | 方法定义、参数、返回值、方法重载 | Calculator.java；封装加减乘除和最大值计算 |
| Day07 | 第一周综合复习与考核 | 完成命令行学生成绩统计器，至少通过五组业务测试 |

**周验收目标：** 能够独立创建 Java 类，处理控制台输入，结合条件和循环完成业务计算，并通过方法组织可复用逻辑。

##### 第 2 周：Java 面向对象（Day 08–14）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day08 | 类、对象、字段、成员方法 | Student.java；创建多个学生对象 |
| Day09 | 构造方法、this、封装、getter/setter | 为学生年龄和成绩增加合法性限制 |
| Day10 | 继承、super、方法重写 | 编写 Person、Student、Teacher |
| Day11 | 多态、向上转型、动态绑定 | 使用父类引用操作不同子类对象 |
| Day12 | 抽象类、接口 | 定义 ScoreService 接口及实现 |
| Day13 | static、final、包和访问修饰符 | 划分 model、service、app 等包 |
| Day14 | 面向对象综合项目 | 学生管理系统 V1；实现基础增删改查 |

**周验收目标：** 学生管理系统具有合理的类与包结构，正确运用封装、继承、多态及接口，避免全部业务集中在 main 方法中。

##### 第 3 周：集合、异常与工程基础（Day 15–21）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day15 | String、StringBuilder、字符串 API | StringUtilsPractice.java；实现文本清洗、查找及拼接 |
| Day16 | List、ArrayList、Set | CollectionPractice.java；完成集合存储与去重 |
| Day17 | Map、HashMap、泛型 | 使用 Map<Integer, Student> 保存学生信息 |
| Day18 | 异常、try/catch、自定义异常 | 正确处理非法输入和重复学号 |
| Day19 | 文件 IO、Files、路径、try-with-resources | 保存学生数据并从文件恢复 |
| Day20 | Lambda、Stream、Maven、JUnit | 通过 Stream 统计成绩并为服务编写测试 |
| Day21 | 第一阶段综合验收 | 学生管理系统 V2；完成 CRUD、持久化、异常与测试 |

**周验收目标：** 完成集合存储、文件持久化及异常处理，使用 Maven 管理项目并编写基础 JUnit 测试。

**第一阶段交付物：**

`projects/student-manager-console/`

完成学生管理系统的控制台版本，支持增删改查、集合存储、文件保存、异常处理、Maven 构建及至少八个关键测试场景。

#### 第二阶段：Java 核心进阶与数据库（Day 22–35）

阶段目标：掌握数据持久化、数据库访问、并发基础和 Web 开发所需的网络知识。

##### 第 4 周：MySQL 与 JDBC（Day 22–28）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day22 | MySQL 安装、数据库、表及数据类型 | 建立 student_db 数据库和 student 表 |
| Day23 | SQL 增删改查、WHERE、ORDER BY | 完成至少十条 SQL 并检查执行结果 |
| Day24 | 聚合、分组、分页、JOIN | 建立班级表，实现关联查询与统计 |
| Day25 | 主键、外键、索引、EXPLAIN | 设计查询索引并分析执行计划 |
| Day26 | 事务、ACID、隔离级别 | 使用转账案例验证提交与回滚 |
| Day27 | JDBC、PreparedStatement、DAO | 使用 Java 实现数据库 CRUD |
| Day28 | 数据库阶段综合验收 | 学生管理系统 V3，改用 MySQL 保存数据 |

**周验收目标：** 能创建和维护数据库，编写常用 SQL，解释事务行为，并使用参数化查询实现学生管理功能。

##### 第 5 周：Java 核心与 Web 基础（Day 29–35）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day29 | 进程、线程、Thread、Runnable | 编写两个可以并发执行的任务 |
| Day30 | 线程安全、synchronized、线程池 | 复现并修正计数器竞态问题 |
| Day31 | JVM 内存、GC、类加载 | 借助 JVM 工具观察程序运行 |
| Day32 | HTTP、URL、状态码、JSON | 使用 Postman 或 curl 发起 HTTP 请求 |
| Day33 | TCP/IP、DNS、HTTPS、REST | 分析 DNS 解析与 HTTP 通信 |
| Day34 | Linux 命令、进程与端口 | 完成文件、进程和网络操作练习 |
| Day35 | 第二阶段综合验收 | 检验 JDBC、事务、并发、HTTP 与 Linux 基础 |

**周验收目标：** Java 能够正常访问 MySQL，事务与线程安全实验通过，掌握基础网络及 Linux 操作。

**第二阶段交付物：**

Student Manager Console V3，支持 MySQL/JDBC CRUD、参数化 SQL 和异常处理，并保留数据库建表脚本及实验记录。

#### 第三阶段：Spring Boot 后端开发（Day 36–56）

阶段目标：能够构建提供 REST API 的后端应用，实现数据持久化、事务、缓存、认证和测试。

##### 第 6 周：Spring 与第一个 Web API（Day 36–42）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day36 | Spring IoC、DI、Bean | 用独立案例验证依赖注入 |
| Day37 | Spring Boot、Starter、配置 | 创建并启动 Spring Boot 工程 |
| Day38 | Controller、REST API、请求参数 | 实现 /api/hello 及学生查询接口 |
| Day39 | Service 分层、DI、DTO | 分离控制层与业务逻辑 |
| Day40 | GET、POST、PUT、DELETE、HTTP 状态码 | 完成内存数据 CRUD 接口 |
| Day41 | 参数校验、统一异常处理、响应规范 | 处理缺失参数与非法成绩 |
| Day42 | Spring Boot 第一周验收 | 学生管理 API V1，完成接口测试 |

**周验收目标：** 能独立启动 Spring Boot 服务，编写基本 CRUD API，并正确处理参数校验和异常。

##### 第 7 周：持久层与事务（Day 43–49）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day43 | MyBatis、Mapper、SQL 映射 | 完成 Spring Boot 与 MySQL 连接 |
| Day44 | MyBatis CRUD、动态 SQL | 将学生接口接入数据库 |
| Day45 | 分页、排序、条件查询 | 完成学生分页及姓名搜索 |
| Day46 | 数据库关系设计、课程和选课 | 创建学生、课程、选课三张表 |
| Day47 | @Transactional、事务边界 | 实现选课及课程容量事务 |
| Day48 | Spring AOP、注解、日志 | 通过 AOP 记录请求信息 |
| Day49 | 后端阶段验收 | 学生与课程 API 支持 CRUD 和选课 |

**周验收目标：** MyBatis 与数据库正常协作，能够完成选课业务、分页查询和事务回滚验证。

##### 第 8 周：Redis、认证与测试（Day 50–56）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day50 | Redis 数据类型和基本命令 | 操作 String、Hash、Set 及过期时间 |
| Day51 | Spring Boot 与 Redis | 实现课程列表缓存和 TTL |
| Day52 | 缓存一致性、缓存穿透基础 | 数据更新后正确清理缓存 |
| Day53 | 密码哈希、登录、会话、JWT | 完成基础用户认证 |
| Day54 | Spring Security、授权 | 阻止未认证访问受保护接口 |
| Day55 | JUnit、MockMvc、API 测试 | 为核心服务及接口建立自动化测试 |
| Day56 | 第三阶段综合验收 | 验收 API、MySQL、Redis、认证和测试 |

**周验收目标：** 后端系统具备完整的数据持久化、基础缓存、认证授权与自动化测试能力。

**第三阶段交付物：**

`projects/campus-assistant-platform/` V1.0。

包含学生管理、课程管理、选课事务、MyBatis、Redis、认证授权、统一异常处理和自动化测试。

#### 第四阶段：后端工程化与 AI 智能体（Day 57–77）

阶段目标：提高后端应用的工程质量，并将大语言模型、知识检索与工具调用整合到校园业务平台。

##### 第 9 周：项目完善与部署（Day 57–63）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day57 | 分层架构、职责划分、项目重构 | 清理重复代码并调整包结构 |
| Day58 | 并发业务、选课容量竞争 | 验证多个请求同时选课不会超限 |
| Day59 | 乐观锁、条件更新、幂等性 | 解决重复请求和容量竞争 |
| Day60 | 日志级别、异常、配置隔离 | 分离开发环境与生产配置 |
| Day61 | Docker、Dockerfile | 打包 Spring Boot 应用镜像 |
| Day62 | Docker Compose、MySQL、Redis | 编排本地依赖服务并测试连接 |
| Day63 | 工程化综合验收 | 完成启动文档、测试说明和架构图 |

**周验收目标：** 并发业务正确，配置和日志合理，能够使用 Docker 部署项目。

##### 第 10 周：AI 应用基础（Day 64–70）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day64 | LLM、Token、Prompt、模型 API | 发送模型请求并解析返回数据 |
| Day65 | Java HTTP Client 与模型服务 | 使用 Java 调用模型完成问答 |
| Day66 | Spring AI、ChatClient | 开发 Spring Boot AI 问答接口 |
| Day67 | System Prompt、上下文、多轮会话 | 实现会话 ID 和对话历史 |
| Day68 | Embedding、向量、语义检索 | 向量化文本并进行相似度检索 |
| Day69 | RAG、文档切分、向量存储 | 建立校园制度知识检索示例 |
| Day70 | AI 阶段验收 | AI 助手根据检索知识回答并展示来源 |

**周验收目标：** Java 可以调用大模型 API，基于 Spring Boot 提供 AI 服务，并具备简单的知识库检索能力。

##### 第 11 周：工具调用与 AI 项目交付（Day 71–77）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day71 | Tool Calling、工具定义 | 编写 Java 课程查询工具方法 |
| Day72 | Spring AI 工具集成 | AI 助手通过授权接口查询课程 |
| Day73 | 工具权限、参数校验、提示注入防护 | 拒绝越权查询与无效参数 |
| Day74 | AI 助手与业务平台集成 | 完成知识问答和课程查询链路 |
| Day75 | 超时处理、异常降级、测试 | 模型不可用时返回合理错误 |
| Day76 | README、API 文档、架构图 | 完善 GitHub 项目说明与复现步骤 |
| Day77 | 第四阶段综合验收 | 演示完整业务后端和 AI 助手 |

**周验收目标：** AI 知识检索与经过授权的业务查询可以正常工作，关键接口具有权限控制、异常处理和测试记录。

**第四阶段交付物：**

Campus Assistant Platform V2.0。

包含并发选课、Docker 部署、Spring AI、RAG、Tool Calling、权限校验、异常处理和系统测试。

#### 第五阶段：面试准备与求职冲刺（Day 78–90）

阶段目标：整理 Java 后端知识与项目成果，系统进行算法训练、项目表达、简历优化和模拟面试。

##### 第 12 周：Java 后端高频面试专题（Day 78–84）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day78 | Java 基础、OOP、String、异常、泛型 | 口述十道基础面试题 |
| Day79 | ArrayList、HashMap、HashSet | 解释应用场景、哈希冲突和复杂度 |
| Day80 | 线程池、锁、volatile、死锁 | 完成八道并发问题及简单实验 |
| Day81 | JVM 内存、GC、类加载 | 画出关键结构并解释工作原理 |
| Day82 | MySQL 索引、事务、锁、SQL 优化 | 完成十道数据库问题及 SQL 练习 |
| Day83 | Spring IoC、AOP、事务、Bean | 结合项目解释核心机制 |
| Day84 | Redis、HTTP、网络、Linux | 完成一次 40 分钟技术模拟面试 |

**周验收目标：** 能较完整地回答 Java 后端常见问题，能够结合亲自完成的项目解释技术选择和解决方案。

##### 第 13 周：算法、项目复盘与简历（Day 85–90）

| 天数 | 课程知识点 | 当天练习 / 验收标准 |
|---|---|---|
| Day85 | 数组、双指针、哈希表 | 限时完成两道基础算法题 |
| Day86 | 链表、栈、队列、二分查找 | 解决两道算法题并分析复杂度 |
| Day87 | 二叉树、DFS/BFS、动态规划基础 | 完成两道题或在提示下实现 |
| Day88 | 项目架构、业务设计、关键难点 | 完成 3–5 分钟项目介绍并接受追问 |
| Day89 | Java 后端简历、GitHub 展示 | 形成简历初稿并检查项目复现流程 |
| Day90 | 综合技术模拟面试与最终验收 | 进行知识考核、现场编程和项目答辩 |

**周验收目标：** 完成算法练习、项目讲解、求职简历及最终综合面试。

**第五阶段交付物：**

Java 面试复习资料、LeetCode 练习记录、项目技术介绍、简历、GitHub 项目展示和最终能力验收记录。

## 4. 正式项目

90 天计划中主要维护两个长期项目。

### Project 01：Student Manager Console

项目目录：

`projects/student-manager-console/`

预计开发时间：Day 08–35。

主要开发内容：

1. 学生资料的新增、查询、修改和删除。
2. 学生成绩管理与统计。
3. 面向对象分层设计。
4. 使用 Java 集合保存学生信息。
5. 参数检查及异常处理。
6. 文件 IO 持久化。
7. Maven 构建。
8. JUnit 基础测试。
9. JDBC 数据访问。
10. MySQL 数据存储。

项目目标：检验 Java 核心语法、面向对象、工程结构和数据库操作能力。

当前状态：未开始。

### Project 02：Campus Assistant Platform

项目目录：

`projects/campus-assistant-platform/`

预计开发时间：Day 36–77。

主要开发内容：

1. 学生及用户资料管理。
2. 课程数据管理。
3. 选课与退课。
4. 重复选课校验。
5. MySQL 数据库。
6. Spring Boot REST API。
7. MyBatis 数据访问。
8. 参数校验和统一异常处理。
9. 登录认证与权限控制。
10. Redis 缓存。
11. 并发选课与数据一致性。
12. 自动化测试。
13. Docker 部署。
14. Spring AI 大模型接口。
15. 校园制度 RAG 知识库。
16. AI 工具调用。
17. 按用户身份查询业务数据。
18. AI 安全防护及异常处理。
19. README、API 文档与架构图。

项目目标：构建能够体现 Java 后端业务开发与 AI 应用集成能力的完整项目，用于求职作品展示。

当前状态：未开始。

## 5. 仓库目录结构

### 5.1 长期规划结构

```text
java-90-days/
├── README.md
├── .gitignore
├── docs/
│   ├── progress.md
│   ├── checkpoints/
│   └── handoffs/
├── 01-java-basics/
│   ├── day01/
│   ├── day02/
│   ├── day03/
│   ├── day04/
│   ├── day05/
│   ├── day06/
│   └── ...
├── 02-java-core-database/
│   └── ...
├── 03-spring-boot/
│   └── ...
├── 04-ai-integration/
│   └── ...
├── 05-interview/
│   └── ...
└── projects/
    ├── student-manager-console/
    └── campus-assistant-platform/
```

上述目录结构代表长期规划，不表示所有目录已经建立。按照每日课程和正式项目的实际进度逐步创建。

### 5.2 每日学习目录

Day 02：

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

Day 03：

```text
01-java-basics/
└── day03/
    ├── code/
    │   ├── LibraryAccessCheck.java
    │   ├── ShippingFeeCalculator.java
    │   ├── OrderStatusChecker.java
    │   └── GradeJudge.java
    ├── tasks.md
    └── notes.md
```

Day 04：

```text
01-java-basics/
└── day04/
    ├── code/
    │   ├── ForPractice.java
    │   ├── InventoryPractice.java
    │   ├── ShelfScanPractice.java
    │   └── NumberPractice.java
    ├── tasks.md
    └── notes.md
```

Day 05：

```text
01-java-basics/
└── day05/
    ├── code/
    │   ├── WarehouseStock.java
    │   ├── InventoryUpdate.java
    │   ├── DailySalesSummary.java
    │   └── ScoreStatistics.java
    ├── tasks.md
    └── notes.md
```

Day 06：

```text
01-java-basics/
└── day06/
    ├── code/
    │   ├── LibraryNotice.java
    │   ├── EmployeeWorkRecord.java
    │   ├── StudentScoreCalculator.java
    │   └── Calculator.java
    ├── tasks.md
    └── notes.md
```

文件用途：

- code/：Java 编程练习。
- tasks.md：课程任务、测试与验收结果。
- notes.md：理论知识、最终代码、真实错误与修复经验。
- docs/progress.md：累计学习进度。
- docs/handoffs/dayXX.md：每日交接记录。

路线图指定的 Java 文件是当天核心综合验收产物。

其他小练习根据课程内容和实际学习效果灵活安排，不机械追求练习数量。

### 5.3 正式项目结构

学习 Maven 后，正式项目将采用标准 Maven 工程目录。

Spring Boot 阶段逐步建立 controller、service、mapper、entity、dto、config、exception、security、ai 等包。

在基础阶段不提前引入复杂微服务结构。

## 6. 学习与验收规则

正式学习流程：

**理论讲解 → 示例演示 → 独立编程 → 提交源码 → 代码审查 → 修改复验 → 正式验收**

### 6.1 课程要求

1. 一次学习一节课程。
2. 当前课程通过后解锁下一节。
3. 正式编程任务由学习者独立实现。
4. 示例程序不能直接代替正式练习答案。
5. 不在任务开始前给出完整正式答案。
6. 每项任务必须说明文件名、类名、路径、业务要求和输出格式。
7. 理论讲解应覆盖本节必要知识，不能仅提供语法片段。
8. 课程中正常复用已经学习的 Java 知识。
9. 不提前引入后续课程中的主要语法。
10. 每次课程应有明确验收结论。
11. 一天最后的综合练习必须覆盖当天规定的核心知识点。
12. 每日学习时间原则上控制在 2–3 小时。
13. 不为增加练习数量而重复已经验收的基础内容。

### 6.2 静态代码审查

检查内容包括：

- 文件名和类名
- main 方法
- 数据类型
- 变量声明与初始化
- Java 语法正确性
- 条件分支
- 循环与边界
- 数组及索引
- 输入合法性
- 业务逻辑
- 输出格式
- 代码规范
- 是否使用未学习的语法

编译状态由学习者自行负责。

**不再要求提交 javac 编译终端记录。**

但明显的语法、类名或代码结构问题仍属于审查范围，必须修复。

### 6.3 业务测试

按照程序实际需求决定测试数量。

| 程序类型 | 测试原则 |
|---|---|
| 简单固定数据输出 | 一组标准测试通常即可 |
| 数组基础访问 | 覆盖必要的元素和索引 |
| 条件分支 | 覆盖关键不同分支 |
| 数值边界 | 检查有关上下限 |
| Scanner 输入 | 检查必要的合法与非法输入 |
| 复杂统计 | 检查正常数据、特殊排列及精度 |
| 综合编程 | 覆盖核心业务功能及必要风险 |

不机械要求每个程序执行大量重复测试。

### 6.4 修改复验

代码未通过时：

1. 指出具体问题。
2. 解释错误原因。
3. 给出修改方向。
4. 保留未受影响的已通过审查与测试。
5. 只针对受影响部分安排必要复验。
6. 不直接提供正式练习的完整修复答案。
7. 所有阻断性问题解决后，才能正式通过。

### 6.5 交互式提交

需要提交代码或测试结果时，应提供可填写的交互式提交区域。

提交按钮应可以实际向当前会话发送内容。

交互式提交不以编译记录作为必要条件。

已填写的内容不应因无关字段而无法提交。

### 6.6 理论问答限制

Day 01–77：

- 不安排独立理论问答。
- 不使用选择题、判断题或填空题替代实操。
- 不安排模拟面试。
- 不要求提前背诵 Java 八股文。
- 主要通过编程、运行、测试及项目功能完成验收。

Day 78–90：

集中进行理论复习、算法练习、项目答辩和模拟面试。

## 7. Git 管理规范

- 使用统一的 java-90-days Git 仓库。
- 日常学习成果按学习日归档。
- 每天课程验收完成后整理 Markdown。
- 采用明确、可追踪的 Git Commit Message。
- 优先精准暂存新增或修改的文件。
- 不随意使用 git add .。
- 不提交 .class、target/、out/ 或 IDEA 缓存。
- 不提交 API Key、密码或 Token。
- 不任意覆盖历史代码与学习记录。
- 阶段项目完成后可按需创建 Git Tag。
- 不在缺少实际证据时声明 Git 推送成功。
- 提交后检查 HEAD 和 origin/main。
- 检查工作区是否 clean。

### Commit Message 示例

```text
feat(day01): complete Java fundamentals and environment setup
feat(day02): complete Java basics exercises and learning records
docs(day02): update Java input output learning records
feat(day03): complete Java conditionals and switch exercises
feat(day04): complete Java loops and number practice exercises
feat(day05): complete Java arrays and score statistics exercises
feat(day06): complete Java methods and calculator exercises
feat(student-manager): implement student CRUD
fix(campus-assistant): prevent duplicate enrollment
```

### 学习归档统一要求

每日最终 Markdown 文档按照当天归档完成的预期状态编写。

其中：

- tasks.md 记录全部课程通过的最终结论。
- notes.md 记录最终代码、知识点和修复经验。
- docs/progress.md 更新累计进度。
- docs/handoffs/dayXX.md 提供下一天交接依据。
- README.md 同步学习与归档状态。

实际 Git commit、push 和 clean 检查仍需真实执行。

未获得实际 Commit SHA 时，不编造提交编号。

## 8. 当前学习进度

最后更新：2026-11-20。

### 8.1 每日学习状态

| 学习日 | 主题 | 状态 |
|---|---|---|
| Day 01 | Java 基础认知与环境配置 | 已完成 |
| Day 02 | 数据类型、变量、常量与输入输出 | 已完成 |
| Day 03 | 运算符、if/else、switch | 已完成 |
| Day 04 | for、while、break、continue | 已完成 |
| Day 05 | 数组、一维数组遍历与索引 | 已完成 |
| Day 06 | 方法定义、参数、返回值、方法重载 | 已完成 |

当前累计进度：**6 / 90 天**。

完成率：约 **6.67%**。

### 8.2 Day 01 完成情况

课程验收：4/4。

核心程序：

`01-java-basics/day01/code/HelloJava.java`

已完成 JDK、IDEA、Java 类、main 方法、程序编译运行和基础输出。

Day 01 Git 归档完成。

### 8.3 Day 02 完成情况

课程验收：4/4。

Java 编程练习：5/5。

已完成文件：

- `01-java-basics/day02/code/StudentInfoDemo.java`
- `01-java-basics/day02/code/BookOrderCalculator.java`
- `01-java-basics/day02/code/StudentProfilePrinter.java`
- `01-java-basics/day02/code/CourseStatisticsReport.java`
- `01-java-basics/day02/code/StudentInfo.java`

五个 Java 程序均已通过历史正式验收。

其中：

- CourseStatisticsReport.java：TC01–TC16 通过。
- StudentInfo.java：TC01–TC15 通过，并完成两组不同输入测试。

已掌握变量、基本数据类型、常量、类型转换、算术运算、Scanner 输入和 printf 格式化输出。

Day 02 归档完成。

### 8.4 Day 03 完成情况

课程验收：4/4。

Java 编程练习：4/4。

已完成文件：

- `01-java-basics/day03/code/LibraryAccessCheck.java`
- `01-java-basics/day03/code/ShippingFeeCalculator.java`
- `01-java-basics/day03/code/OrderStatusChecker.java`
- `01-java-basics/day03/code/GradeJudge.java`

正式验收结果：

| 程序 | 静态审查 | 业务测试 |
|---|---|---|
| LibraryAccessCheck.java | 12/12 | 6/6 组 |
| ShippingFeeCalculator.java | 15/15 | 10/10 组 |
| OrderStatusChecker.java | 15/15 | 8/8 组 |
| GradeJudge.java | 20/20 | 24/24 组 |

累计业务测试：48/48 组通过。

已完成关系运算符、逻辑运算符、boolean 表达式、if/else、switch 和成绩等级边界判断。

已验收 Git 提交：`ed7f5d4`。

Day 03 归档完成。

### 8.5 Day 04 完成情况

课程验收：4/4。

Java 编程练习：4/4。

已完成文件：

- `01-java-basics/day04/code/ForPractice.java`
- `01-java-basics/day04/code/InventoryPractice.java`
- `01-java-basics/day04/code/ShelfScanPractice.java`
- `01-java-basics/day04/code/NumberPractice.java`

正式验收结果：

| 程序 | 静态审查 | 业务测试 |
|---|---|---|
| ForPractice.java | 12/12 | 6/6 |
| InventoryPractice.java | 12/12 | 8/8 |
| ShelfScanPractice.java | 15/15 | 8/8 |
| NumberPractice.java | 20/20 | 12/12 |

本日规定的 34/34 组业务测试通过。

NumberPractice.java 综合验收：

- CR01–CR20 全部通过。
- TC01–TC12 全部通过。

已掌握 for、while、break、continue、循环边界、状态更新、嵌套循环、求和、乘法表及多轮输入控制。

已验收 Git 提交：

`8f1758fffbeb9104db89abeec5876d106f3ebcd7`

Day 04 Git 提交与推送已完成，并通过 HEAD 与 origin/main 一致及 clean 工作区检查。

### 8.6 Day 05 完成情况

课程验收：4/4。

Java 编程练习：4/4。

课程安排：

| 课程 | 主题 | 状态 |
|---|---|---|
| D05-S01 | 数组声明、创建与初始化 | 验收通过 |
| D05-S02 | 数组索引、length、元素修改与边界 | 验收通过 |
| D05-S03 | 数组遍历、Scanner 输入与基础统计 | 验收通过 |
| D05-S04 | ScoreStatistics.java 综合编程 | 验收通过 |

已完成 Java 文件：

- `01-java-basics/day05/code/WarehouseStock.java`
- `01-java-basics/day05/code/InventoryUpdate.java`
- `01-java-basics/day05/code/DailySalesSummary.java`
- `01-java-basics/day05/code/ScoreStatistics.java`

正式验收结果：

| Java 文件 | 静态代码审查 | 正式业务测试 |
|---|---|---|
| WarehouseStock.java | 14/14 适用项 | 1/1 |
| InventoryUpdate.java | 14/14 | 5/5 |
| DailySalesSummary.java | 16/16 | 7/7 |
| ScoreStatistics.java | 20/20 | 10/10 |
| 合计 | 64/64 | 23/23 |

#### D05-S01

完成仓位库存的一维数组表示与读取。

使用静态初始化、数组索引、length 和首尾元素访问。

一组必要标准业务测试通过。

#### D05-S02

完成商品库存更新和索引边界检查。

修复遗漏的入库数量上限条件，新增 TC05 复验通过。

最终 14/14 静态审查、5/5 业务测试通过。

#### D05-S03

完成 Scanner 输入数组、普通 for 循环遍历及总销量累加。

修复类名错误和非整数销量未及时停止的问题。

最终 16/16 静态审查、7/7 业务测试通过。

#### D05-S04

核心综合文件：

`ScoreStatistics.java`

已实现：

- 学生人数读取与范围校验。
- 成绩数组动态创建。
- Scanner 批量录入成绩。
- 非整数与超范围数据处理。
- 最高分和最低分计算。
- 成绩总和及平均分计算。
- 使用 double 避免整数除法丢失精度。
- 平均分统一保留两位小数。
- 单个学生、相同成绩、首尾极值等情况。
- 非法人数及成绩处理。

首次提交存在非法人数提示首字母大小写问题，修改后重新完成 TC07、TC08 复验。

最终：

- CR01–CR20：20/20 通过。
- TC01–TC10：10/10 通过。
- 无阻断性问题。

#### Day 05 最终结果

- 四节课程全部通过。
- 四个 Java 程序全部通过。
- 静态审查 64/64 适用项通过。
- 正式业务测试 23/23 通过。
- 核心综合文件 ScoreStatistics.java 完成。
- Markdown 学习记录归档完成。
- Git 归档按照最终状态整理。

Day 05 完成后，累计进度为 5/90 天。

### 8.7 Day 06 完成情况

课程验收：4/4。

Java 编程练习：4/4。

课程安排：

| 课程 | 主题 | 状态 |
|---|---|---|
| D06-S01 | 方法的概念、定义、调用与 void | 验收通过 |
| D06-S02 | 方法参数与实参传递 | 验收通过 |
| D06-S03 | return 与方法返回值 | 验收通过 |
| D06-S04 | 方法重载与 Calculator.java 综合编程 | 验收通过 |

已完成 Java 文件：

- `01-java-basics/day06/code/LibraryNotice.java`
- `01-java-basics/day06/code/EmployeeWorkRecord.java`
- `01-java-basics/day06/code/StudentScoreCalculator.java`
- `01-java-basics/day06/code/Calculator.java`

正式验收结果：

| Java 文件 | 静态代码审查 | 正式业务测试 |
|---|---|---|
| LibraryNotice.java | 14/14 | 1/1 |
| EmployeeWorkRecord.java | 18/18 | 3/3 |
| StudentScoreCalculator.java | 20/20 | 7/7 |
| Calculator.java | 24/24 | 12/12 |
| 合计 | 76/76 | 23/23 |

#### D06-S01

完成图书馆通知程序。

使用四个自定义 void 方法组织业务输出。

main 按顺序调用方法。

printRules 只定义一次、调用两次。

首次提交通过全部静态审查和必要业务测试。

最终：

- CR01–CR14：14/14。
- TC01：1/1。
- 无阻断性问题。

#### D06-S02

完成员工信息与工作时长管理程序。

使用 String、int、double 和 int[] 参数传递业务数据。

验证：

- 多参数方法调用。
- 同一方法处理不同员工。
- 基本类型形参修改不影响调用方局部变量。
- 数组引用参数能够修改共同引用数组的元素。

首次提交工资输出使用 `%.2f`，不符合预期的 `8500.5` 格式。

修改为 `%.1f` 后，CR18 和 TC01 复验通过。

其余历史通过项保留。

最终：

- CR01–CR18：18/18。
- TC01–TC03：3/3。
- 无阻断性问题。

#### D06-S03

完成 StudentScoreCalculator.java。

实现：

- 两门课程总分。
- 两门课程平均分。
- 单科成绩合法性检查。
- 两门成绩合法性与及格判断。
- 使用 return 返回计算和判断结果。
- 使用方法调用复用业务逻辑。

使用 `/ 2.0` 避免整数除法截断。

首次提交全部通过。

最终：

- CR01–CR20：20/20。
- TC01–TC07：7/7。
- 无阻断性问题。

#### D06-S04

完成核心综合程序 Calculator.java。

实现：

- add(int,int) 和 add(double,double) 参数类型重载。
- subtract 整数减法。
- multiply 整数乘法。
- divide 浮点数除法。
- isValidDivisor 除数合法性判断。
- 除数为 0 时返回 Double.NaN。
- max(int,int) 和 max(int,int,int) 参数数量重载。
- 三参数 max 复用两参数 max。
- main 统一保存并输出返回值。

首次提交所有 12 项业务测试通过，但 main 直接在 printf 中调用方法，未按规定保存十项返回值。

CR22 未通过，初次静态审查为 23/24。

调整后：

- 十项调用返回值分别保存到对应类型的局部变量。
- main 再统一输出结果。
- CR22 针对性复验通过。
- 正式十行输出回归验证通过。
- TC06–TC12 历史通过结果保留。

最终：

- CR01–CR24：24/24。
- TC01–TC12：12/12。
- 无阻断性问题。

#### Day 06 最终结果

- 四节课程全部通过。
- 四个 Java 程序全部通过。
- 静态审查 76/76 通过。
- 正式业务测试 23/23 通过。
- 核心综合文件 Calculator.java 完成。
- Calculator.java CR01–CR24 全部通过。
- Calculator.java TC01–TC12 全部通过。
- 所有针对性复验通过。
- 无阻断性问题。
- Markdown 学习记录按照最终状态整理。

Day 06 完成后，累计进度为 6/90 天。

### 8.8 当前开发环境

- 操作系统：Windows
- JDK：Eclipse Temurin 21.0.12.1 LTS
- IDE：IntelliJ IDEA
- Project SDK：temurin-21
- Java 项目模块：java-90-days
- Git 分支：main

## 9. 学习记录

### 总体进度

- [每日学习进度](docs/progress.md)

### Day 01

- [Day 01 学习任务](01-java-basics/day01/tasks.md)
- [Day 01 学习笔记](01-java-basics/day01/notes.md)
- [Day 01 交接记录](docs/handoffs/day01.md)

### Day 02

- [Day 02 学习任务](01-java-basics/day02/tasks.md)
- [Day 02 学习笔记](01-java-basics/day02/notes.md)
- [Day 02 交接记录](docs/handoffs/day02.md)

### Day 03

- [Day 03 学习任务](01-java-basics/day03/tasks.md)
- [Day 03 学习笔记](01-java-basics/day03/notes.md)
- [Day 03 交接记录](docs/handoffs/day03.md)

### Day 04

- [Day 04 学习任务](01-java-basics/day04/tasks.md)
- [Day 04 学习笔记](01-java-basics/day04/notes.md)
- [Day 04 交接记录](docs/handoffs/day04.md)

### Day 05

- [Day 05 学习任务](01-java-basics/day05/tasks.md)
- [Day 05 学习笔记](01-java-basics/day05/notes.md)
- [Day 05 交接记录](docs/handoffs/day05.md)

### Day 06

- [Day 06 学习任务](01-java-basics/day06/tasks.md)
- [Day 06 学习笔记](01-java-basics/day06/notes.md)
- [Day 06 交接记录](docs/handoffs/day06.md)

后续学习记录按照实际完成进度持续更新。

## 10. 当前项目状态

### 正式项目

- Student Manager Console：未开始。
- Campus Assistant Platform：未开始。

### 历史学习状态

| 学习日 | 完成情况 | Git 状态 |
|---|---|---|
| Day 01 | 4/4 课程通过 | 归档完成 |
| Day 02 | 4/4 课程、5/5 练习通过 | 归档完成 |
| Day 03 | 4/4 课程、4/4 练习通过 | 归档完成 |
| Day 04 | 4/4 课程、4/4 练习通过 | 归档完成 |
| Day 05 | 4/4 课程、4/4 练习通过 | 归档完成 |
| Day 06 | 4/4 课程、4/4 练习通过 | 待实际 Git 归档验收 |

### 已验收 Git 记录

- Day 02：`d29df72`
- Day 03：`ed7f5d4`
- Day 04：`8f1758fffbeb9104db89abeec5876d106f3ebcd7`

### Day 05 归档信息

Day 05 正式验收结果：

- 静态代码审查：64/64 通过。
- 正式业务测试：23/23 通过。
- ScoreStatistics.java：CR01–CR20 通过。
- ScoreStatistics.java：TC01–TC10 通过。

新增 Java 文件：4 个。

新增及更新 Markdown 文件：5 个。

建议 Git 提交说明：

`feat(day05): complete Java arrays and score statistics exercises`

Day 05 Commit SHA 以实际 Git 历史记录为准。

### Day 06 归档信息

Day 06 正式验收结果：

- 四节课程：4/4 通过。
- 四个 Java 程序：4/4 通过。
- 静态代码审查：76/76 通过。
- 正式业务测试：23/23 通过。
- Calculator.java：CR01–CR24 全部通过。
- Calculator.java：TC01–TC12 全部通过。
- 阻断性问题：0。

新增 Java 文件：4 个。

新增及更新 Markdown 文件：5 个。

建议 Git 提交说明：

`feat(day06): complete Java methods and calculator exercises`

Day 06 Commit SHA 应以实际提交记录为准，不预先填写。

### 下一步

下一学习日：**Day 07**

主题：**第一周综合复习与考核**

核心任务：

完成命令行学生成绩统计器，至少通过五组业务测试。

继续执行一课一练、逐课验收、独立编程、必要测试与归档规则。

在 Day 06 Git 归档正式完成前，不进入 Day 07。