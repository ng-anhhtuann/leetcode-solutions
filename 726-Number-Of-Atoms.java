import java.util.regex.*;

class Solution {
    public String countOfAtoms(String s) {
        Matcher m = Pattern.compile("([A-Z][a-z]*)(\\d*)|(\\()|(\\))(\\d*)").matcher(s);
        List<String[]> list = new ArrayList<>();
        while (m.find()) {
            list.add(
                new String[] {
                    m.group(1),
                    m.group(2),
                    m.group(3),
                    m.group(4),
                    m.group(5),
                });
        }
        Collections.reverse(list);

        Map<String, Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        int mul = 1;

        for (String[] quintuple : list) {
            String atom = quintuple[0];
            String count = quintuple[1];
            String l = quintuple[2];
            String r = quintuple[3];
            String mt = quintuple[4];

            if (atom != null) {
                int cnt = count.length() > 0 ? Integer.parseInt(count) : 1;
                map.put(
                    atom,
                    map.getOrDefault(atom, 0) + cnt * mul);
            } else if (r != null) {
                int currmt = mt.length() > 0
                    ? Integer.parseInt(mt)
                    : 1;
                mul *= currmt;
                stack.push(currmt);
            } else if (l != null) {
                mul /= stack.pop();
            }
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);

        StringBuilder ans = new StringBuilder();
        for (String atom : sortedMap.keySet()) {
            ans.append(atom);
            if (sortedMap.get(atom) > 1) {
                ans.append(sortedMap.get(atom));
            }
        }

        return ans.toString();
    }
}