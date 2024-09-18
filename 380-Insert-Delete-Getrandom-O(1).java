class RandomizedSet {

    Map<Integer, Integer> map;
    List<Integer> lst;
    Random rand = new Random();

    public RandomizedSet() {
        map = new HashMap<>();
        lst = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        } else {
            map.put(val, lst.size());
            lst.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        } else {
            int idx = map.get(val);
            if (idx != lst.size()-1) {
                int last = lst.get(lst.size()-1);
                lst.set(idx,last);
                map.put(last, idx);
            }
            map.remove(val);
            lst.remove(lst.size()-1);
            return true;
        }
    }

    public int getRandom() {
        int idx = rand.nextInt(lst.size());
        return lst.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */