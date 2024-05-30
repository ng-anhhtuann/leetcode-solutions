// public class Solution {
//     public int[] singleNumber(int[] a) {
//         if (a.length == 2) return a;
//         int xor = 0;
//         for (int num : a) {
//             xor ^= num;
//             System.out.println("xor = " + xor);
//         }
//         System.out.println("___________________________");
//         System.out.println("xor = " + xor);
//         int diff = xor & (-xor);
//         System.out.println("diff = " + diff);
//         System.out.println("___________________________");
//         int[] res = new int[2];
//         for (int num : a) {
//             if ((num & diff) == 0) {
//                 res[0] ^= num;
//                 System.out.println("res[0] = " + res[0]);
//             } else {
//                 res[1] ^= num;
//                 System.out.println("res[1] = " + res[1]);
//             }
//             System.out.println("------------------------");
//         }
//         return res;
//     }
// }

public class Solution {
    public int[] singleNumber(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] res = new int[2];
        int idx = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                res[idx++] = entry.getKey();
                if (idx == 2) {
                    break;
                }
            }
        }
        return res;
    }
}