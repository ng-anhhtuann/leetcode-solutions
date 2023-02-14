class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : s) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String a = new String(chars);
            if (!map.containsKey(a)) {
                map.put(a, new ArrayList<>());
            }
            map.get(a).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
