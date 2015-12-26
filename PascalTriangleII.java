import java.util.ArrayList;
import java.util.List;

/**
 * Created by yingzong on 11/5/15.
 */
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        if(rowIndex < 0){
            return result;
        }
        List<Integer> rowPre = new ArrayList<Integer>();
        rowPre.add(1);

        for(int i = 1; i <= rowIndex; i++){
            List<Integer> rowCur = new ArrayList<Integer>();
            rowCur.add(1);
            for(int j = 1; j < i; j++){
                rowCur.add(rowPre.get(j - 1) + rowPre.get(j));
            }
            rowCur.add(1);
            rowPre  = rowCur;
        }
        return rowPre;

    }
    public static void main(String[] args) {
        int n = 1;
        PascalTriangleII a = new PascalTriangleII();
        List<Integer> result = a.getRow(n);

        System.out.println(result);



    }
}
