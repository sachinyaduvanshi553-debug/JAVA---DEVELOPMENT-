# 🟦 Month 6: Interview Engineering + System Design + Production Spring Boot + AI (February)

> **Core Objective**: Finish your journey as an industry-grade SDE candidate: master enterprise Spring Boot microservices, solve High-Level (HLD) & Low-Level (LLD) system designs, leverage AI-augmented engineering tools (RAG, agents, evaluations, security), and deliver 3 production capstone projects.

---

## ⏱️ Daily 3-Hour Time Allocation
* **Hour 1 — Timed DSA & Mocks**: 2 Problems / day (Timed Medium/Hard LeetCode + Peer Mock Interviews). Target: ~45 problems.
* **Hour 2 — Enterprise Spring Boot & Production Architecture**: IoC, REST, JPA/Hibernate, Spring Security (JWT), Docker, Kafka, Redis.
* **Hour 3 — System Design & AI Engineering**: System Design (HLD + LLD) + AI Engineering (RAG, Vector DB, Tool Calling, Guardrails).

---

## 📂 Submodules in this Section

### ☕ 1. [01-Spring-Boot-Enterprise](./01-Spring-Boot-Enterprise/)
* **Spring Core**: Inversion of Control (IoC), Dependency Injection (`@Autowired`, Constructor Injection), Bean scopes (`singleton`, `prototype`).
* **Spring Boot REST Web Layer**: `@RestController`, `@RequestMapping`, `@PathVariable`, `@RequestBody`, DTO pattern, Bean Validation (`@Valid`, `@NotNull`), centralized exception handling (`@RestControllerAdvice`).
* **Spring Data JPA & Hibernate**: Entity lifecycle, `@OneToMany`, `@ManyToOne`, FetchType (Lazy vs Eager), JPQL queries, `@Transactional`, pagination, avoiding $N+1$ query problem.
* **Spring Security & Authorization**: SecurityFilterChain, BCrypt password hashing, JWT stateless token generation/validation, Role-Based Access Control (RBAC), CORS.

### 🏗️ 2. [02-System-Design-LLD-and-HLD](./02-System-Design-LLD-and-HLD/)
* **Low-Level Design (LLD)**:
  * SOLID principles (Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion).
  * Design Patterns: Factory, Builder, Strategy, Observer, Singleton, Adapter, Decorator, Command.
* **High-Level Design (HLD)**:
  * Horizontal vs Vertical Scaling, Load Balancing algorithms (Round Robin, Least Connections, Consistent Hashing).
  * Caching topologies (Cache-aside, Write-through, Write-back, Redis LRU eviction).
  * Database scaling: Read replicas, Master-Slave replication, Database sharding, CAP theorem, PACELC.
  * Asynchronous message streaming: Apache Kafka topics, partitions, consumer groups, idempotency, dead letter queues (DLQ).

### 🤖 3. [03-AI-Engineering-for-SDEs](./03-AI-Engineering-for-SDEs/)
* **Level 1 — AI Coding Workflows**: Using AI IDEs for test generation, refactoring, SQL optimization without losing technical agency.
* **Level 2 — AI-Assisted Architecture**: Agentic multi-file repository transformations, automated verification, security audits.
* **Level 3 — AI Application Engineering (2028 Differentiator)**:
  * LLM APIs, tokens, context windows, prompt templates, structured JSON outputs.
  * **RAG (Retrieval-Augmented Generation)**: Document parsing $\rightarrow$ Chunking $\rightarrow$ Embeddings $\rightarrow$ Vector Database (pgvector/Pinecone/Chroma) $\rightarrow$ Semantic Retrieval $\rightarrow$ Grounded Answer Generation.
  * AI Agents & Function Calling: Tool calling, planning loops, memory persistence, human-in-the-loop approvals.
  * **AI Security**: Defense against prompt injection, sensitive data leakage, excessive tool privileges, and deterministic output validation.

### 🧩 4. [04-Capstone-Projects](./04-Capstone-Projects/)
1. **Project 1 — Enterprise Java Backend**: Spring Boot + PostgreSQL + Spring Security (JWT) + RBAC + Docker + JUnit/Mockito.
2. **Project 2 — Scalable Distributed Backend**: Spring Boot + PostgreSQL + Redis Caching + Apache Kafka Event Streaming + Docker Compose + CI/CD.
3. **Project 3 — AI-Integrated SDE System**: Spring Boot API + React + PostgreSQL + Redis + RAG Knowledge Engine (pgvector + OpenAI/Gemini API) + Guardrails.

---

## 🎯 Curated LeetCode Target (~45 Problems)
| # | Problem | Pattern | Difficulty |
|---|---------|---------|------------|
| 1 | Median of Two Sorted Arrays (#4) | Binary Search | Hard (Selected) |
| 2 | Trapping Rain Water (#42) | Two Pointers / Monotonic Stack | Hard (Selected) |
| 3 | Merge k Sorted Lists (#23) | Min-Heap / Divide & Conquer | Hard (Selected) |
| 4 | Serialize and Deserialize Binary Tree (#297) | Tree BFS / String | Hard (Selected) |
| 5 | Alien Dictionary (#269) | Topological Sort | Hard (Selected) |
| 6 | Minimum Window Substring (#76) | Sliding Window | Hard (Selected) |
| 7 | Sliding Window Maximum (#239) | Monotonic Deque | Hard (Selected) |
| 8 | Word Ladder II (#126) | BFS + Backtracking | Hard (Selected) |
| 9 | Longest Valid Parentheses (#32) | Stack / DP | Hard (Selected) |
| 10 | Burst Balloons (#312) | Partition DP | Hard (Selected) |
