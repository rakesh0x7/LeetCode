class MyHashMap {
    HashMap<Integer,Integer> h;
    public MyHashMap() {
         h = new HashMap<>();
    }
    
    public void put(int key, int value) {
        h.put(key,value);
    }
    
    public int get(int key) {
        Integer i = h.get(key);
        if(i!=null){int a = i.intValue();
                   return a;}
        return -1;
    }
    
    public void remove(int key) {
        h.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */