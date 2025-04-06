class Solution {

    public int maximumLength(String s) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < s.length(); j++) {
                if (sb.length() == 0 || sb.charAt(sb.length() - 1) == s.charAt(j)) {
                    sb.append(s.charAt(j));
                    map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
                } else {
                    break;
                }
            }
        }

        int ans = 0;
        for (String str : map.keySet())
            if (map.get(str) >= 3 && str.length() > ans)
                ans = str.length();

        if (ans == 0)
            return -1;
        return ans;
    }
}