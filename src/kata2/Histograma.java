package kata2;

import java.util.HashMap;
import java.util.Map;

class Histograma {

    private final String[] data;

    public Histograma(String[] data) {
        this.data = data;
    }

    public String[] getData() {
        return data;
    }
    
    public Map<String, Integer> getHistogram(){
        Map <String, Integer> histogram = new HashMap<>();
        for (String key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
}
