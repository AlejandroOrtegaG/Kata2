package kata2;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        
        String [] data ={"Rosa", "Pepe", "Jose", "Pepe", "Pepe", "Rosa", "Jose"};
        Histograma histo = new Histograma(data);
        Map<String,Integer> histogr = histo.getHistogram();
        
        histogr.keySet().forEach((i) -> {
            System.out.println(i +"==>" + histogr.get(i));
        });
    }
}
