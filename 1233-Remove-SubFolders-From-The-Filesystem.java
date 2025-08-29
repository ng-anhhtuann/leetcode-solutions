class Solution {
    public List<String> removeSubfolders(String[] f) {
        Arrays.sort(f);

        int n = f.length;
        List<String> lst = new ArrayList<>();
        lst.add(f[0]);

        for (int i = 1; i < n; i++) {
            String str = lst.get(lst.size() - 1) + "/";
            String curr = f[i];
            if (!curr.startsWith(str))
                lst.add(f[i]);
        }
        return lst;
    }
}