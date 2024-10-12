class Solution {

    public List<Integer> diffWaysToCompute(String ex) {
        List<Integer> lst = new ArrayList<>();
        if (ex.length() == 0) return lst;
        if (ex.length() == 1) {
            lst.add(Integer.parseInt(ex));
            return lst;
        }
        if (ex.length() == 2) {
            if (String.valueOf(ex.charAt(0)).matches("\\d"))
                lst.add(Integer.parseInt(ex));
            return lst;
        }
        for (int i = 0; i < ex.length(); i++){
            if (String.valueOf(ex.charAt(i)).matches("\\d")) continue;
            List<Integer> left = diffWaysToCompute(ex.substring(0,i));
            List<Integer> right = diffWaysToCompute(ex.substring(i+1));
            for (int l : left) {
                for (int r : right) {
                    int cal = 0;
                    switch (ex.charAt(i)) {
                        case '+': cal = l + r; break;
                        case '-': cal = l - r; break;
                        case '*': cal = l * r; break;
                    }
                    lst.add(cal);
                }
            }
        }
        return lst;
    }
}