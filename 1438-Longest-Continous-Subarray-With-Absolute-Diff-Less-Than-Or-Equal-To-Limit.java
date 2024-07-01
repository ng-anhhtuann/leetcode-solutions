// class Solution {
//     public int longestSubarray(int[] a, int l) {
//         int n = a.length;
//         int left = 0;
//         int right = 0;
//         int maxLen = 0;

//         int min = a[0];
//         int max = a[0];

//         while (right < n) {
//             min = Math.min(min, a[right]);
//             max = Math.max(max, a[right]);

//             if (max - min <= l) {
//                 maxLen = Math.max(maxLen, right - left + 1);
//                 right++;
//             } else {
//                 left++;
//                 min = a[left];
//                 max = a[left];
//                 for (int i = left; i <= right; i++) {
//                     min = Math.min(min, a[i]);
//                     max = Math.max(max, a[i]);
//                 }
//             }
//         }

//         return maxLen;
//     }
// }

class Solution {

    public int longestSubarray(int[] a, int limit) {
        Deque<Integer> maxDq = new LinkedList<>();
        Deque<Integer> minDq = new LinkedList<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < a.length; ++right) {
            while (!maxDq.isEmpty() && maxDq.peekLast() < a[right]) {
                maxDq.pollLast();
            }
            maxDq.offerLast(a[right]);

            while (!minDq.isEmpty() && minDq.peekLast() > a[right]) {
                minDq.pollLast();
            }
            minDq.offerLast(a[right]);
            while (maxDq.peekFirst() - minDq.peekFirst() > limit) {
                if (maxDq.peekFirst() == a[left]) {
                    maxDq.pollFirst();
                }
                if (minDq.peekFirst() == a[left]) {
                    minDq.pollFirst();
                }
                ++left;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}