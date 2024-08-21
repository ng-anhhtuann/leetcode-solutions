class Solution {

    public String kthDistinct(String[] a, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : a) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (String str : a) {
            if (map.get(str) == 1) {
                k--;
            }
            if (k == 0) {
                return str;
            }
        }

        return "";
    }
}