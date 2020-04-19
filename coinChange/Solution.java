class Solution {
    //Assume coins = n0, n1, n2,,,nn,  number = x0, x1, x2,,,xn
    //amount = n0*x0 + n1*x1 + n2*x2 + ... nn*xn
    // first sort the coins, then divide amount by the largest denominations, then devide by the 
    public int coinChange(int[] coins, int amount) {
        int n = coins.length -1;
        int[] dpTable = new int[coins.length];
        int remainder = amount;
        for (int i = n; i > 0; i--) {
            int number = remainder / coins[n];
            dpTable[i] = number;
            int remain = remainder % coins[n];
            System.out.println(dpTable[i]);
            System.out.println(remain);
            if (remain == 0 && number != 0)
                break;
            remainder = remain;
        }
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += dpTable[i];
        }
        return result == 0 ? -1 : result;
    }
}