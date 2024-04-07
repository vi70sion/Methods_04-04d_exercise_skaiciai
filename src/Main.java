import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Sukurkti kalse 'Aritmetika'
//        sukurti metoda 'sudek', kuris paima du double tipo parametrus ir grazina rezultata
//        sukurti metoda 'atimk', kuris paima du double tipo parametrus ir grazina rezultata
//        sukurti metoda 'sudaugink', kuris paima du double tipo parametrus ir grazina rezultata
//        sukurti metoda 'padalink', kuris paima du double tipo parametrus ir grazina rezultata
//        sukurti metoda 'pakelkLaipsniu':
//		* parametrai: double reiksme, kuria kelsime laipsniu ir int laipsnis,
//        kuriuo pakelsime duota reiksme.
//		* Naudojame cikla laipsniui pakelti
//		* Grazina rezultata
        Aritmetika aritmetika = new Aritmetika();
        System.out.println(aritmetika.sudetis(1.5, 4.0));
        System.out.println(aritmetika.atimk(6.5, 1.5));
        System.out.println(aritmetika.sudaugink(2.0, 4.0));
        System.out.println(aritmetika.padalink(4.5, 1.5));
        System.out.println(aritmetika.pakelkLaipsniu(5.0, 3));
        System.out.println(aritmetika.sujunk("Labas ", "pasauli"));
        System.out.println();

//        Sukurti klase 'SkaiciuOperacijos'
//        skurti metoda 'sudekSkaicius'
//      * parametruose paiima Double skaiciu List
//		* visus skaicius sarase sudeda, taikome metoda 'sudek' is klases 'Aritmetika'
//      * grazina rezultata

        List<Double> skaiciaiList = new ArrayList<>(){
            {
                add(15.5);
                add(4.5);
                add(2.0);
            }
        };
        SkaiciuOperacijos skaiciuOperacijos = new SkaiciuOperacijos();
        System.out.println(skaiciuOperacijos.sudekSkaicius(skaiciaiList));
        System.out.println();
        System.out.println(skaiciuOperacijos.atimkSkaicius(skaiciaiList));
        System.out.println();
        System.out.println(skaiciuOperacijos.sudauginkSkaicius(skaiciaiList));
        System.out.println();
        System.out.println(skaiciuOperacijos.padalinkSkaicius(skaiciaiList));
        System.out.println();
        System.out.println(skaiciuOperacijos.pakelkSkaiciusLaipsnyje(skaiciaiList, 2));
        System.out.println();

//        Sukuriam du Double List su atsitiktinem reiksmem nuo -100 iki 100 ir kita -99.99 iki 99.99
//        Suikuriam objekta SkaiciuOperacijos.
//        Kvieciame visus metodus kiekvienam List'ui atskirai ir graziai atspausdinam reiksmes.

        int listSize = 5;
        List<Double> list1 = new ArrayList<>();
        for(int i = 0; i < listSize; i++){
            list1.add(-100 + (100 - (-100)) * Math.random()); //nuo -100 iki 100
        }
        List<Double> list2 = new ArrayList<>();
        for(int i = 0; i < listSize; i++){
            list2.add(-99.99 + (99.99 - (-99.99)) * Math.random()); //nuo -99.99 iki 99.99
        }
        System.out.println("List1: " + list1);
        System.out.println("Skaiciu suma: " + skaiciuOperacijos.sudekSkaicius(list1));
        System.out.println("Skaiciu atimtis: " + skaiciuOperacijos.atimkSkaicius(list1));
        System.out.println("Skaiciu sandauga: " + skaiciuOperacijos.sudauginkSkaicius(list1));
        System.out.println("Skaiciu dalyba: " + skaiciuOperacijos.padalinkSkaicius(list1));
        System.out.println("Skaiciai pakelti laipsniu: " + skaiciuOperacijos.pakelkSkaiciusLaipsnyje(list1, 2));
        System.out.println();
        System.out.println("List2: " + list2);
        System.out.println("Skaiciu suma: " + skaiciuOperacijos.sudekSkaicius(list2));
        System.out.println("Skaiciu atimtis: " + skaiciuOperacijos.atimkSkaicius(list2));
        System.out.println("Skaiciu sandauga: " + skaiciuOperacijos.sudauginkSkaicius(list2));
        System.out.println("Skaiciu dalyba: " + skaiciuOperacijos.padalinkSkaicius(list2));
        System.out.println("Skaiciai pakelti laipsniu: " + skaiciuOperacijos.pakelkSkaiciusLaipsnyje(list2, 2));
        System.out.println();

    }
}