import java.util.HashSet;

/**
 * Created by yingzong on 11/8/15.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> record = new HashSet<Integer>();
        while(!record.contains(n)){
            n = getSquareSum(n);
            if(n == 1){
                return true;
            }
            else{
                record.add(n);
            }
        }
        return false;
    }
    private int getSquareSum(int n){
        int sum = 0;
        while(n != 0){
            sum +=(int) Math.pow((n % 10),2);
            n = n/10;
        }
        return sum;
    }
}
