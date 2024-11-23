class Solution {

    public List<String> removeSubfolders(String[] a) {
        Arrays.sort(a);
        List<String> lst = new ArrayList<>();
        lst.add(a[0]);
        for (int i = 1; i < a.length; i++) {
            String s = lst.get(lst.size() - 1);
            s += '/';
            if (!a[i].startsWith(s))
                lst.add(a[i]);
        }
        return lst;
    }
}