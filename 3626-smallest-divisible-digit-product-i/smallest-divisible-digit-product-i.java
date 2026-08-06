class Solution {
    public int smallestNumber(int n, int t) {
        int num = n;
        int product = 1;

        while (product % t != 0) {
            product = 1;
            int temp = num;      

            while (temp != 0) {
                int ld = temp % 10;
                product *= ld;
                temp = temp / 10;
            }

            if (product % t == 0)
                return num;

            num++;              
        }

        return num;
    }
}