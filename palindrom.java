public class palindrom {
    public static void main(String[] args) {
        int count = 0;
	long last = 53;
	long i=0;
        while(true){
		long n= i;
            	long sum = 0;
             
            	while(n !=0){
                	sum*=10;
                	sum += n%10;
                	n/=10;
            	}
            	if(sum == i){
                	count++;
            	}
            	if(count == last){
                	System.out.println(last+"th palindrom number is: "+i);
                	break;
            	}
		i++;
	}
    }
}
/*
 * Output:
 * 53rd palindrom number is: 434
 */