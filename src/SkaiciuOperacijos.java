import java.util.ArrayList;
import java.util.List;
public class SkaiciuOperacijos {

    public double sudekSkaicius(List<Double> list){
        Aritmetika aritmetika1 = new Aritmetika();
        double suma = 0;
        for(double elementas : list) {
            suma = aritmetika1.sudetis(elementas, suma);
        }
        return suma;
    }

    public double atimkSkaicius(List<Double> list){
        Aritmetika aritmetika1 = new Aritmetika();
        double rezultatas = list.getFirst();
        for(int i = 1; i < list.size(); i++) {
            rezultatas = aritmetika1.atimk(rezultatas, list.get(i));
        }
        return rezultatas;
    }

    public double sudauginkSkaicius(List<Double> list){
        Aritmetika aritmetika1 = new Aritmetika();
        double rezultatas = list.getFirst();
        for(int i = 1; i < list.size(); i++) {
            rezultatas = aritmetika1.sudaugink(rezultatas, list.get(i));
        }
        return rezultatas;
    }

    public double padalinkSkaicius(List<Double> list){
        Aritmetika aritmetika1 = new Aritmetika();
        double rezultatas = list.getFirst();
        for(int i = 1; i < list.size(); i++) {
            rezultatas = aritmetika1.padalink(rezultatas, list.get(i));
        }
        return rezultatas;
    }

    public List<Double> pakelkSkaiciusLaipsnyje(List<Double> list, int laipsnis){
        Aritmetika aritmetika1 = new Aritmetika();
        List<Double> naujasSar = new ArrayList<Double>();
        for(int i = 0; i < list.size(); i++) {
            naujasSar.add(aritmetika1.pakelkLaipsniu(list.get(i), laipsnis));
        }
        return naujasSar;
    }
}
