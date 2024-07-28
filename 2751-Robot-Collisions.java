class Solution {

    public List<Integer> survivedRobotsHealths(int[] p, int[] h, String dir) {
        int n = p.length;
        Integer[] tmp = new Integer[n];
        List<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; ++i)
            tmp[i] = i;

        Arrays.sort(tmp,
            (l, r) -> Integer.compare(p[l], p[r]));

        for (int i : tmp) {
            if (dir.charAt(i) == 'R') {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && h[i] > 0) {
                    int pop = stack.pop();

                    if (h[pop] > h[i]) {
                        h[pop] -= 1;
                        h[i] = 0;
                        stack.push(pop);
                    } else if (h[pop] < h[i]) {
                        h[i] -= 1;
                        h[pop] = 0;
                    } else {
                        h[i] = 0;
                        h[pop] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < n; ++i)
            if (h[i] > 0)
                res.add(h[i]);
        return res;
    }
}