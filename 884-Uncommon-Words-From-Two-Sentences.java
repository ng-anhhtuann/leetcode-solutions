class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a = s1.split(" ");
        String[] b = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (String i : b) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<String> keySet = map.keySet();
        List<String> lst = new ArrayList<>();
        for (String i : keySet)
            if (map.get(i) == 1)
                lst.add(i);

        return lst.toArray(new String[0]);
    }
}