class Solution {
    public boolean isHappy(int n) {
        Set<Integer> a = new HashSet<>();
        while (n != 1 && !a.contains(n)) {
            a.add(n);
            int sum = 0;
            String str = Integer.toString(n);
            for (int i = 0; i < str.length(); i++) {
                int digit = Character.getNumericValue(str.charAt(i));
                sum += digit * digit;
            }
            n = sum;
        }
        return n == 1;
    }
}
