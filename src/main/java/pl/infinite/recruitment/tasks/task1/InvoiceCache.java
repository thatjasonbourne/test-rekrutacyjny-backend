package pl.infinite.recruitment.tasks.task1;

import pl.infinite.recruitment.tasks.task1.some.unmodifable.library.Invoice;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InvoiceCache implements Cache<String, Invoice> {

    private final Map<String, Invoice> cache = new ConcurrentHashMap<>();

    @Override
    public boolean hasValue(String key) {
        return cache.containsKey(key);
    }

    @Override
    public Invoice put(String key, Invoice value) {
        return cache.put(key, value);
    }

    @Override
    public Invoice get(String key) {
        return cache.get(key);
    }

    @Override
    public void clear() {
        cache.clear();
    }
}
