package chepter14.stats;

public class Stats<T extends  Number > {
    T[] nams ;

    public Stats(T[] o) {
        nams = o;
    }
    public double average(){
        double sum = 0.0;
        for (int i = 0; i <nams.length ; i++) {
            sum+=nams[i].doubleValue();
        }
        return sum /nams.length;
    }
}
