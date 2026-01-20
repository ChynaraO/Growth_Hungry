package LeetCode.Medium;

import java.security.KeyPair;
import java.util.*;

public class P_347 {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        // Step 2: Convert map entries into a list
        List<Map.Entry<Integer, Integer>> sortedFreqList = new ArrayList<>(freq.entrySet());

        // Step 3: Sort by frequency descending
        Collections.sort(sortedFreqList, (e1, e2) -> e2.getValue() - e1.getValue());

        // Step 4: Collect top K keys
        int[] results = new int[k];
        for (int i = 0; i < k; i++) {
            results[i] = sortedFreqList.get(i).getKey();
        }

        return results;
    }
}
