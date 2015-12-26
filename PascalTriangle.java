import java.util.ArrayList;
import java.util.List;

/**
 * Created by yingzong on 11/5/15.
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows == 0){
            return result;
        }
        List<Integer> rowLast = new ArrayList();
        rowLast.add(1);
        result.add(rowLast);
        for(int i = 1; i < numRows; i++){
            List<Integer> row = new ArrayList();
            row.add(1);
            for(int j = 1;j <= i - 1;j++){
                row.add(rowLast.get(j - 1) + rowLast.get(j));
            }
            row.add(1);
            result.add(row);
            rowLast = row;
        }
        return result;

    }
    public static void main(String[] args) {
        int n = 9;
        PascalTriangle a = new PascalTriangle();
        List<List<Integer>> result = a.generate(n);
        for(int i = 0; i < n; i++){
            System.out.println(result.get(i));
        }


    }
}
