package month05.dsa.graphs;

import java.util.*;

public class GraphAlgorithmsDemo {
    // Topological Sort using Kahn's Algorithm (BFS) for Cycle Detection & Ordering
    public static int[] topologicalSortKahn(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());
        int[] inDegree = new int[numCourses];

        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) queue.offer(i);
        }

        int[] order = new int[numCourses];
        int index = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            order[index++] = node;
            for (int neighbor : adj.get(node)) {
                if (--inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        return index == numCourses ? order : new int[0]; // Empty if cycle detected
    }

    public static void main(String[] args) {
        int[][] pre = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] order = topologicalSortKahn(4, pre);
        System.out.println("Topological Order of Courses: " + Arrays.toString(order));
    }
}
