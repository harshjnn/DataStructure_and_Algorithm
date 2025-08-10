public class leetcode424 {
    class Solution {
        public int characterReplacement(String s, int k) {
            int[] freq = new int[26];
            int left = 0, maxfreq = 0, maxwindow = 0;
    
            for (int right = 0; right < s.length(); right++) {
                int idx = s.charAt(right) - 'A';
                freq[idx]++;
                maxfreq = Math.max(maxfreq, freq[idx]);
    
                // shrink window if replacements needed exceed k
                if ((right - left + 1) - maxfreq > k) {
                    freq[s.charAt(left) - 'A']--;
                    left++;
                }
    
                maxwindow = Math.max(maxwindow, right - left + 1);
            }
    
            return maxwindow;
        }
    }
    
}
