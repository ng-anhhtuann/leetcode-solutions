class Solution {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> a = new ArrayList<>();
        int num = 1;

        for ( int i = 1; i <= n; i++ ) {
            a.add(num);

            if (num*10 <= n) {
                num *= 10;
            } else {
                while (num % 10 == 9 || num >= n) num /= 10;
                num++;
            }
        }
        return a;
    }
}