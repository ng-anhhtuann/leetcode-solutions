class Solution {
    public int longestPalindrome(String[] a) {
        int[][] d = new int[26][26];
        int count = 0;

        for (String i : a) {
            int l = i.charAt(0) - 'a';
            int r = i.charAt(1) - 'a';

            if (d[r][l] > 0) {
                count += 4;
                d[r][l]--;
            } else {
                d[l][r]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (d[i][i] > 0) {
                count += 2;
                break;
            }
        }

        return count;
    }

    public int longestPalindrome(String[] a) {
        int n = a.length;
        int count = 0;
        boolean hasFw = false;
        int maxFw = 0;
        int maxFwIdx = 0;
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (String i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (i.charAt(0) == i.charAt(1))
                hasFw = true;
        }
        // log(map);
        Set<String> set = new HashSet<>();
        for (String i : map.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(i.charAt(1));
            sb.append(i.charAt(0));
            if (i.charAt(0) == i.charAt(1)) {
                list.add(map.get(i));
                set.add(i);
            }
            if (!set.contains(i)) {
                count += Math.min(map.get(i), map.getOrDefault(sb.toString(), 0)) * 4;
                set.add(sb.toString());
                set.add(i);
            }
        }
        // log(set);

        for (int i = 0; i < list.size(); i++) {
            if (maxFw < list.get(i)) {
                maxFw = list.get(i);
                maxFwIdx = i;
            }
        }
        // log(list);
        // System.out.println("mxIdx = " + maxFwIdx);
        // System.out.println("mx = " + maxFw);
        boolean maxIsEven = maxFw % 2 == 0;
        boolean hasOneAndMaxNotOne = false;
        count += maxFw * 2;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= maxFw && i != maxFwIdx) {
                // System.out.println("i = " + i);
                // System.out.println("list.get(i) = " + list.get(i));
                if (list.get(i) % 2 == 1 && maxFw != 1)
                    hasOneAndMaxNotOne = true;
                count += (list.get(i) / 2) * 4;
                // System.out.println("count = " + count);
                // System.out.println("________________________");
            }
        }
        return maxIsEven && hasOneAndMaxNotOne ? count + 2 : count;
    }

    private static void log(List<Integer> a) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        for (int i : a) {
            sb.append(i);
            sb.append(" ");
        }

        sb.append(" }");
        System.out.println(sb.toString());
    }

    private static void log(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        int count = 0;
        int size = map.size();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append(" : ").append(entry.getValue());
            if (++count < size) {
                sb.append(" | ");
            }
        }

        sb.append(" }");
        System.out.println(sb.toString());
    }

    private static void log(Set<String> set) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        int count = 0;
        int size = set.size();

        for (String element : set) {
            sb.append(element);
            if (++count < size) {
                sb.append(" ");
            }
        }

        sb.append(" }");
        System.out.println(sb.toString());
    }
}