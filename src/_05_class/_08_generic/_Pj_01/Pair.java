package _05_class._08_generic._Pj_01;

public class Pair<K, V> {
    private K key;
    private V value;

    // 생성자
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // key에 대한 getter 메서드
    public K getKey() {
        return key;
    }


    // value에 대한 getter 메서드
    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        Pair<Integer, String> pair2 = new Pair<>(2, "Two");

        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
    }
}
