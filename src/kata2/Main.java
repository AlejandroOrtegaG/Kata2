package kata2;

public class Main {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 2, 2, 3, 1, 2, 5, 2, 1, 3, 2, 2, 4};

        Histograma histograma = new Histograma();

        /*for (int i = 0; i < data.length; i++) {
            int j = data[i];
            if (histograma.contains(data[i])) {
                histograma.put(data[i], histograma.get(data[i])+1);
            }else{
                histograma.put(data[i],1);
            }*/
        for (int key : data) {
            histograma.put(key, histograma.contains(key) ? histograma.get(key) + 1 : 1);
        }
        System.out.println(histograma);
    }
}
