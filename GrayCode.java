import java.util.ArrayList;
import java.util.List;

/**
 * Created by yingzong on 10/31/15.
 */
public class GrayCode {

    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        if(n == 0){
            result.add(0);
            return result;
        }

        result = grayCode(n - 1);
        ArrayList<Integer> reverseLast = reverseList(result);
        for(int i = 0; i <= Math.pow(2,n - 1) - 1; i++){
            int num = (1 << (n-1)) + reverseLast.get(i);
            result.add(num);
        }
        return result;

    }

    public ArrayList<Integer> reverseList(List<Integer> list){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = list.size() - 1; i >= 0; i--){
            result.add(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
//        int n = 4;
//        GrayCode a = new GrayCode();
//        List<Integer> result = a.grayCode(n);
        System.out.println(Double.MIN_VALUE);



    }




}