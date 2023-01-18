package pl.infinite.recruitment.tasks.task1;

public interface Cache<K, V> {

    boolean hasValue(K key);

    V put(K key, V value);

    V get(K key);

    void clear();
}
