package kata2;

import java.util.HashMap;
import java.util.Map;

class Histograma {

    private final Map<Integer, Integer> mapa;

    public Histograma() {
        this.mapa = new HashMap<>();
    }

    boolean contains(int key) {
        return mapa.containsKey(key);
    }

    void put(int key, int value) {
        mapa.put(key, value);
    }

    public int get(int key) {
        return mapa.get(key);
    }

    @Override
    public String toString() {
        /*   return "" + mapa.keySet().stream().map(x -> x + "==>" + get(x) + "\n")
                .reduce("", String::concat);*/
        Object[] keys = mapa.keySet().toArray();
        Object[] values = mapa.values().toArray();
        String result = "";

        for (int i = 0; i < keys.length; i++) {
            result += (keys[i] + "==>" + values[i] + "\n");
        }
        return result;
    }
}
