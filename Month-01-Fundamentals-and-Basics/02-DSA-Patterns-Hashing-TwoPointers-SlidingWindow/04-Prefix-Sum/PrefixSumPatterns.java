package month01.dsa.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class PrefixSumPatterns {
    // Subarray Sum Equals K (LeetCode #560) using Prefix Sum + HashMap
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCounts = new HashMap<>();
        prefixCounts.put(0, 1); // Base case: prefix sum 0 occurs once
        int currentPrefixSum = 0;
        int totalSubarrays = 0;

        for (int num : nums) {
            currentPrefixSum += num;
            if (prefixCounts.containsKey(currentPrefixSum - k)) {
                totalSubarrays += prefixCounts.get(currentPrefixSum - k);
            }
            prefixCounts.put(currentPrefixSum, prefixCounts.getOrDefault(currentPrefixSum, 0) + 1);
        }
        return totalSubarrays;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        System.out.println("Subarrays with sum 2: " + subarraySum(arr, 2));
    }
}
