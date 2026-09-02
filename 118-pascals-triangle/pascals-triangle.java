import java.math.BigInteger;

class Solution {
    public BigInteger fact(int x) {
        BigInteger xFact = BigInteger.ONE;

        for (int i = 1; i <= x; i++) {
            xFact = xFact.multiply(BigInteger.valueOf(i));
        }

        return xFact;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {

                BigInteger icj = fact(i)
                        .divide(fact(i - j).multiply(fact(j)));

                list.get(i).add(icj.intValue());
            }
        }

        return list;
    }
}
