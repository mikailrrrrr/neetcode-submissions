class MyHashSet {
    List<Integer> set;
    public MyHashSet() {
        set = new ArrayList<>();
    }

    public void add(int key) {
        for (int num : set)
            if (key == num)
                return;
        set.add(key);
    }

    public void remove(int key) {
        int idx = 0;
        for (int num : set) {
            if (key == num) {
                set.remove(idx);
                return;
            }
            idx++;
        }
    }

    public boolean contains(int key) {
        for (int num : set) {
            if (key == num)
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */