package chepter14.stats1;

public class Stats <T extends Number >{

    T[] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }
    double average(){
        double sum = 0.0;
        for (int i = 0; i <nums.length ; i++) {
            sum += nums[i].doubleValue();

        }
        return sum/nums.length;
    }
    boolean sameAvg (Stats<?> o){
        if (average() == o.average()){
            return true;

        }
        return false;
    }
}
