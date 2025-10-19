class Solution {
    public int maxDiff(int n) {
        String str = String.valueOf(n);
        char[] c = str.toCharArray();
        char fC = c[0];

        char sC = 0;
        for (char i : c) {
            if (i != fC) {
                sC = i;
                break;
            }
        }

        if (sC == '0' && fC == '1') {
            for (char i : c) {
                if (i != '0' && i != fC) {
                    sC = i;
                    break;
                }
            }
        }

        StringBuilder max = new StringBuilder();
        StringBuilder min = new StringBuilder();
        while (n > 0) {
            char i = Character.forDigit(n % 10, 10);

            switch (fC) {
                case '9' -> {
                    max.insert(0, i == fC ? i : (sC == 0 || i == sC) ? '9' : i);
                    min.insert(0, i == fC ? '1' : i);
                }
                case '1' -> {
                    min.insert(0, i == fC ? i : (sC == 0 || i == sC) ? '0' : i);
                    max.insert(0, i == fC ? '9' : i);
                }
                default -> {
                    min.insert(0, i == fC ? '1' : i);
                    max.insert(0, i == fC ? '9' : i);
                }
            }
            n /= 10;
        }
        return Integer.valueOf(max.toString()) - Integer.valueOf(min.toString());
    }
}