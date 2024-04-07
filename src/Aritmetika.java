public class Aritmetika {
    public double sudetis(double x, double y){
        return x + y;
    }
    public double atimk(double x, double y){
        return x - y;
    }
    public double sudaugink(double x, double y){
        return x * y;
    }
    public double padalink(double x, double y){
        return x / y;
    }
    public double pakelkLaipsniu(double x, int y){
        double rezult = x;
        for(int i = y-1; i > 0; i--){
            rezult *= x;
        }
        return rezult;
    }
    public String sujunk(String x, String y){
        return x + y;
    }
}


/*
public double pakelkLaipsniu (double sk, int laipsnis){
    return Math.pow(sk, laipsnis);
}*/