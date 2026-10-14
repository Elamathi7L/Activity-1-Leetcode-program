class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;

        int[] lastSeen = new int[128];

        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (lastSeen[ch] >= start) {
                start = lastSeen[ch] + 1;
            }

            lastSeen[ch] = i;
            max = Math.max(max, i - start + 1);
        }

        return max;
    }
}
