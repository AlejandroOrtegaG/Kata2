package kata2;

import java.util.HashMap;
import java.util.Map;

class Histograma<T> {

    private final T[] data;

    public Histograma(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    public Map<T, Integer> getHistogram(){
        Map <T, Integer> histogram = new HashMap<>();
        for (T key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
}
