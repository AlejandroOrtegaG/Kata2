package kata2;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 2, 2, 3, 1, 2, 5, 2, 1, 3, 2, 2, 4};
        
        Histograma histo = new Histograma(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        histogr.keySet().forEach((i) -> {
            System.out.println(i +"==>" + histogr.get(i));
        });
    }
}
