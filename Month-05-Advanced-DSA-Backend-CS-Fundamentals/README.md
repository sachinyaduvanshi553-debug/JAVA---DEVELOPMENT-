# 🟦 Month 5: Advanced DSA + Java Backend + CS Fundamentals (January)

> **Core Objective**: Execute your SDE transition: conquer complex Graph algorithms (BFS, DFS, Dijkstra, DSU) and Dynamic Programming (1D, 2D, Knapsack, LIS, LCS), master production SQL & database internals (B-Trees, ACID, Transactions, JDBC), and master Computer Science fundamentals (Operating Systems & Networking).

---

## ⏱️ Daily 3-Hour Time Allocation
* **Hour 1 — DSA (LeetCode)**: 2 Problems / day (Graphs & DP, Medium → Selected Hard). Target: ~40 problems.
* **Hour 2 — Java Backend & Database**: Complex SQL, Window Functions, CTEs, Indexing, Transactions, JDBC with Connection Pooling (HikariCP).
* **Hour 3 — CS Core Fundamentals**: OS (Virtual Memory, Scheduling, Deadlocks) & Networking (TCP/IP, HTTP/HTTPS, DNS, TLS, REST).

---

## 📂 Submodules in this Section

### 🧠 1. [01-Graphs-and-Dynamic-Programming](./01-Graphs-and-Dynamic-Programming/)
* **Graph Foundations**: Adjacency list representation, Breadth-First Search (BFS), Depth-First Search (DFS).
* **Advanced Graph Patterns**:
  * Topological Sort (Kahn's Algorithm & DFS with stack) for DAG dependency resolution.
  * Shortest Path: Dijkstra's Algorithm with Min-Heap PriorityQueue.
  * Disjoint Set Union (DSU / Union-Find) with path compression & union by rank.
  * Minimum Spanning Tree (MST): Kruskal's & Prim's algorithms.
* **Dynamic Programming Framework**:
  * Progression: Recursion $\rightarrow$ Memoization (Top-Down) $\rightarrow$ Tabulation (Bottom-Up) $\rightarrow$ Space Optimization.
  * 1D DP (Climbing Stairs, House Robber, Coin Change).
  * 2D / Grid DP (Unique Paths, Min Path Sum).
  * 0/1 Knapsack & Unbounded Knapsack.
  * Longest Common Subsequence (LCS) & Longest Increasing Subsequence (LIS - $O(N \log N)$).

### ☕ 2. [02-SQL-and-Database-Engineering](./02-SQL-and-Database-Engineering/)
* **Relational Querying**: Joins (INNER, LEFT, RIGHT, FULL), GROUP BY, HAVING, Subqueries, Common Table Expressions (WITH / CTE).
* **Analytical Window Functions**: `ROW_NUMBER()`, `RANK()`, `DENSE_RANK()`, `LEAD()`, `LAG()`, `PARTITION BY`.
* **Database Engine Internals**:
  * Indexing architecture: B-Trees vs B+ Trees, clustered vs non-clustered indexes, covering indexes.
  * Transaction Management: ACID semantics, Dirty Reads, Non-repeatable Reads, Phantom Reads.
  * Isolation Levels: Read Uncommitted, Read Committed, Repeatable Read, Serializable.
  * Concurrency control: Optimistic Locking (`@Version`) vs Pessimistic Locking (`SELECT FOR UPDATE`).
* **Java Database Connectivity (JDBC)**:
  * Raw Connection vs `PreparedStatement` (SQL Injection prevention).
  * Transaction rollback and commit management.
  * High-performance Connection Pooling using **HikariCP**.

### 💻 3. [03-CS-Core-OperatingSystems-and-Networking](./03-CS-Core-OperatingSystems-and-Networking/)
* **Operating Systems**: Processes vs Threads, Context Switching, CPU Scheduling algorithms, Paging & Virtual Memory, Page Faults, Thrashing, Mutexes, Semaphores, Deadlock Coffman conditions.
* **Computer Networks**: OSI & TCP/IP stack layers, TCP 3-Way Handshake & 4-Way Teardown, UDP vs TCP, DNS resolution, TLS/SSL handshake, HTTP/1.1 vs HTTP/2 vs HTTP/3, Idempotent REST API methods, Cookies vs Sessions vs JWT.

---

## 🎯 Curated LeetCode Target (~40 Problems)
| # | Problem | Pattern | Difficulty |
|---|---------|---------|------------|
| 1 | Number of Islands (#200) | Graph BFS/DFS | Medium |
| 2 | Max Area of Island (#695) | Graph DFS | Medium |
| 3 | Clone Graph (#133) | Graph DFS + Map | Medium |
| 4 | Course Schedule (#207) | Topological Sort / Cycle | Medium |
| 5 | Course Schedule II (#210) | Kahn's Algorithm | Medium |
| 6 | Network Delay Time (#743) | Dijkstra Shortest Path | Medium |
| 7 | Number of Provinces (#547) | Union-Find / DSU | Medium |
| 8 | Redundant Connection (#684) | Union-Find / DSU | Medium |
| 9 | Word Ladder (#127) | Graph BFS Shortest Path | Hard (Selected) |
| 10 | Climbing Stairs (#70) | 1D DP | Easy |
| 11 | House Robber (#198) | 1D DP | Medium |
| 12 | House Robber II (#213) | 1D DP Circular | Medium |
| 13 | Coin Change (#322) | Unbounded Knapsack DP | Medium |
| 14 | Partition Equal Subset Sum (#416) | 0/1 Knapsack DP | Medium |
| 15 | Longest Increasing Subsequence (#300) | DP / Binary Search | Medium |
| 16 | Unique Paths (#62) | 2D Grid DP | Medium |
| 17 | Longest Common Subsequence (#1143) | 2D String DP | Medium |
| 18 | Edit Distance (#72) | 2D String DP | Medium / Hard |
| 19 | Word Break (#139) | 1D DP | Medium |
| 20 | Target Sum (#494) | 0/1 Knapsack DP | Medium |
