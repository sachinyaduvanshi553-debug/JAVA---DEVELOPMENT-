# ⚡ Java Collections Framework Complexity Cheatsheet

| Collection | Underlying Data Structure | Get / Search | Insert | Delete | Ordering / Contract |
|------------|---------------------------|--------------|--------|--------|---------------------|
| `ArrayList` | Dynamic Array ($1.5\times$) | $O(1)$ by index | $O(1)$ amortized | $O(N)$ shift | Insertion Order |
| `LinkedList` | Doubly-Linked Nodes | $O(N)$ traversal | $O(1)$ at head/tail | $O(1)$ with node ref | Insertion Order |
| `HashSet` | `HashMap` keys | $O(1)$ avg, $O(N)$ worst | $O(1)$ avg | $O(1)$ avg | Unordered |
| `LinkedHashSet` | Hash table + Doubly-linked list | $O(1)$ avg | $O(1)$ avg | $O(1)$ avg | Insertion Order |
| `TreeSet` | Red-Black Tree (`TreeMap`) | $O(\log N)$ | $O(\log N)$ | $O(\log N)$ | Sorted (`Comparable`/`Comparator`) |
| `HashMap` | Array of Node/TreeNode buckets | $O(1)$ avg, $O(\log N)$ worst | $O(1)$ avg | $O(1)$ avg | Unordered |
| `LinkedHashMap` | Hash table + Doubly-linked list | $O(1)$ avg | $O(1)$ avg | $O(1)$ avg | Insertion / Access Order |
| `TreeMap` | Red-Black Tree | $O(\log N)$ | $O(\log N)$ | $O(\log N)$ | Sorted by Keys |
| `PriorityQueue` | Array-based Binary Heap | $O(1)$ peek | $O(\log N)$ offer | $O(\log N)$ poll | Natural / Custom Min/Max Heap |
| `ArrayDeque` | Circular Resizable Array | $O(1)$ peek | $O(1)$ offer | $O(1)$ poll | Faster than `Stack` and `LinkedList` |
