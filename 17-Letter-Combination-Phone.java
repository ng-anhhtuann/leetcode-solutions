class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno",
                "pqrs", "tuv", "wxyz" };
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            List<String> temp = new ArrayList<>();
            String letters = mapping[Character.getNumericValue(digits.charAt(i))];
            for (int j = 0; j < letters.length(); j++) {
                for (String str : result) {
                    temp.add(str + letters.charAt(j));
                }
            }
            result = temp;
        }
        return result;
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        // Preprocess mapping of digits to letters
        String[][] mapping = new String[][] {
                { "0" },
                { "1" },
                { "a", "b", "c" },
                { "d", "e", "f" },
                { "g", "h", "i" },
                { "j", "k", "l" },
                { "m", "n", "o" },
                { "p", "q", "r", "s" },
                { "t", "u", "v" },
                { "w", "x", "y", "z" }
        };
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            int num = Character.getNumericValue(digits.charAt(i));
            List<String> temp = new ArrayList<>();
            for (String str : result) {
                for (int j = 0; j < mapping[num].length; j++) {
                    temp.add(str + mapping[num][j]);
                }
            }
            result = temp;
        }
        return result;
    }

}