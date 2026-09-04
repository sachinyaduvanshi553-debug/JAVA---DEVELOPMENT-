package month01.dsa.twopointers;

import java.util.*;

public class TwoPointersAndSlidingWindowPatterns {
    // Sliding Window: Longest Substring Without Repeating Characters (LeetCode #3)
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastSeen.containsKey(c)) {
                left = Math.max(left, lastSeen.get(c) + 1);
            }
            lastSeen.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    // Two Pointers: Container With Most Water (LeetCode #11)
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, currentArea);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Longest Substring without duplicates ('abcabcbb'): " + lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Max Water Area: " + maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
