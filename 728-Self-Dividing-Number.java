class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++){
            if (checkDivide(i)) res.add(i);
        }
        return res;
    }
    boolean checkDivide(int num){
        int solid = num;
        while (num != 0){
            int leftOver = num % 10;
            if (leftOver == 0) return false;
            if (solid % leftOver != 0 ) return false;
            num = num / 10;
        }
        return true;
    }
}