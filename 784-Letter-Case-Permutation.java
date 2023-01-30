class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, s.toCharArray(), 0);
        // System.out.println("====================DONE==================");
        return result;
    }

    private void backtrack(List<String> result, char[] chars, int i) {
        if (i == chars.length) {
            // String generated from array of chars
            result.add(new String(chars));
            // System.out.println("res === " + result);
            return;
        }
        // System.out.println("i === " + i);
        backtrack(result, chars, i + 1);
        // System.out.println("======================================");
        if (!Character.isDigit(chars[i])) {
            chars[i] ^= (1 << 5);
            backtrack(result, chars, i + 1);
        }
    }
}
