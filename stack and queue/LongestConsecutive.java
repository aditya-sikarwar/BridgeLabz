import java.util.*;

public class LongestConsecutive {
    public static int findLongest(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int maxLen = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curr = num, streak = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    streak++;
                }
                maxLen = Math.max(maxLen, streak);
            }
        }
        return maxLen;
    }
}
