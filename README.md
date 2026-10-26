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

```text id="pfr9oa"
java-90-days/
├── README.md
├── .gitignore
│
├── docs/
│   ├── roadmap.md
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

以 Day 01 为例：

```text id="opmdol"
01-java-basics/
└── day01/
    ├── code/
    ├── tasks.md
    └── notes.md
```

- `code/`：当天独立编程练习。
- `tasks.md`：课程任务与验收记录。
- `notes.md`：知识点、代码要点和错误记录。

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

```text id="1k5wxv"
feat(day01): complete Java fundamentals and environment setup
docs(day01): update learning notes
feat(student-manager): implement student CRUD
fix(campus-assistant): prevent duplicate enrollment
```

## 8. 当前学习进度

最后更新：2026-10-26。

| 学习日 | 主题                                | 状态   |
|--------|-------------------------------------|--------|
| Day 01 | Java 基础认知、开发环境、第一个程序 | 已完成 |
| Day 02 | 基本数据类型、变量、常量与基础输出  | 未开始 |

当前已完成：1 / 90 天。

Day 01 课程验收：4 / 4 通过。

当前开发环境：

- JDK：Eclipse Temurin 21.0.12.1 LTS
- IDE：IntelliJ IDEA
- Project SDK：temurin-21

已完成第一个 Java 程序：

`01-java-basics/day01/code/HelloJava.java`

编译运行验证通过。

## 9. 学习记录

- [每日学习进度](docs/progress.md)
- [Day 01 学习任务](01-java-basics/day01/tasks.md)
- [Day 01 学习笔记](01-java-basics/day01/notes.md)
- [Day 01 交接记录](docs/handoffs/day01.md)

后续学习记录按天持续补充。

## 10. 当前项目状态

- Student Manager Console：未开始。
- Campus Assistant Platform：未开始。
- Git 本地仓库及 GitHub 提交状态：已提交。

下一步：Day 02，Java 基本数据类型、变量、常量与基础输出。
