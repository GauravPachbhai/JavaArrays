public class nthPerfectNo {
    public static void main(String args[]) {
        int count = 0;
        int x=0;
        for (long j = 1; j <= 10000; j++) {
            long n = j;
            long sum = 0;

            for (long i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }

            }

            if (sum == n)
                count++;
            if (count == 4) {
                System.out.println("83rd Perfect numbr is: " + j);
                break;
            }
        }
    }
}
