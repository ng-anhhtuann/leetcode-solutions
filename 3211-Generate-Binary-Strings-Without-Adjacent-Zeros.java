class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) return res;
        Queue<String> q = new LinkedList<>();
        q.add("0");
        q.add("1");
        while (!q.isEmpty()) {
            String curr = q.poll();
            if (curr.length() == n) {
                res.add(curr);
            } else {
                if (curr.charAt(curr.length() - 1) == '1') {
                    q.add(curr + "0");
                    q.add(curr + "1");
                } else {
                    q.add(curr + "1");
                }
            }
        }
        return res;
    }
}