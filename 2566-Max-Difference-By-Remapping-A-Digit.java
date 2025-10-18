class Solution {
    public int minMaxDifference(int n) {
        int firstMaybeNine = Character.getNumericValue(Integer.toString(n).charAt(0));

        int firstNotNine = 0;
        String str = Integer.toString(n);
        for (char c : str.toCharArray()) {
            if (c != '9') {
                firstNotNine = Character.getNumericValue(c);
                break;
            }
        }
        StringBuilder min = new StringBuilder();
        StringBuilder max = new StringBuilder();
        while (n > 0) {
            int c = n % 10;
            if (firstNotNine == firstMaybeNine) {
                if (c == firstMaybeNine) {
                    max.insert(0, 9);
                    min.insert(0, 0);
                } else {
                    min.insert(0, c);
                    max.insert(0, c);
                }
            } else {
                if (c == firstMaybeNine) {
                    max.insert(0, 9);
                    min.insert(0, 0);
                } else if (c == firstNotNine) {
                    min.insert(0, c);
                    max.insert(0, 9);
                } else {
                    min.insert(0, c);
                    max.insert(0, c);
                }
            }

            n /= 10;
        }
        return Integer.valueOf(max.toString()) - Integer.valueOf(min.toString());
    }
}
