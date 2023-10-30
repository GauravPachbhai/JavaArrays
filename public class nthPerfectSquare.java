public class nthPerfectSquare{
    public static void main(String args[]) {
        int count = 0, last =17;
       	int i =0;
	while(true){
		int n = i, sum = 0;
            	int base = 0;

            	while (n != 0) {
                	base++;
                	n /= 10;

            	}

            	n=i;
            	while (n != 0) {
                	sum += Math.pow(n % 10, base);
                	n /= 10;
            	}

            	if (sum == i)
                	count++;
            	if (count == last) {
                	System.out.println("17th Armstrong number is: " + i);
                	break;
            	}
		i++;
	}
    }
}
/*
 * Output: 17th Armstrong number is: 9474
 */
