import java.util.ArrayList;

/*
 */
public class SumOfResultsFromMathPowOfDigits {
    public static void main(String[] args) {
        System.out.println(eqSumPowDig(500, 3));
    }

    public static ArrayList<Long> eqSumPowDig(long hmax, int exp) {
        ArrayList<Long> list = new ArrayList<>();
        int count = 0;
        for(long i=2; i<hmax; i++)
        {
            String s = Long.toString(i);
            long sum=0;
            for(int j=0; j<s.length(); j++)
            {
                sum += (long) Math.pow(Integer.valueOf(""+s.charAt(j)),exp);
            }
            if(sum==i)
                list.add(i);
        }
        return list;
    }

}
