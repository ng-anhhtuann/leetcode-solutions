class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (words.length == 0 || s.length() < words.length * words[0].length()) {
            return result;
        }
        int n = s.length();
        int m = words.length;
        int w = words[0].length();
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i < w; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int start = i, end = i, total = 0;
            while (end + w <= n) {
                String str = s.substring(end, end + w);
                if (counts.containsKey(str)) {
                    seen.put(str, seen.getOrDefault(str, 0) + 1);
                    if (seen.get(str) <= counts.get(str)) {
                        total++;
                    }
                    while (total == m) {
                        if (end + w - start == m * w) {
                            result.add(start);
                        }
                        String startStr = s.substring(start, start + w);
                        seen.put(startStr, seen.get(startStr) - 1);
                        if (seen.get(startStr) < counts.get(startStr)) {
                            total--;
                        }
                        start += w;
                    }
                } else {
                    seen.clear();
                    total = 0;
                    start = end + w;
                }
                end += w;
            }
        }
        return result;
    }
}