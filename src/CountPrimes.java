public class CountPrimes {

//    Count the number of prime numbers less than a non-negative number, n.
//
//    Example:
//
//    Input: 10
//    Output: 4
//    Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.


    public static int countPrimes(int n) {

        if (n < 2) {
            return 0;
        }

        //default prime and wait to be set composite
        boolean[] isComposites = new boolean[n];
        int compositeCount = 0;

        //get prime from [2,sqrt(n-1)]
        for (int i = 2; i <= Math.sqrt(n-1); i++) {
            if (!isComposites[i]) {
                //mark all composite numbers
                for (int j = 2; i * j <= n-1; j++) {

                    if(!isComposites[i * j]){
                        isComposites[i * j] = true;
                        compositeCount++;
                    }
                }
            }
        }

        //remove 1, n
        return isComposites.length - compositeCount - 2;
    }

    public static void main(String args[]) {
       System.out.println(countPrimes(5));
    }
}
