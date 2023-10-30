public class nthPrime {
    public static void main(String args[]){
        int count =0;
       	long last = 
64;
	long  i=0;
	while(true){
		long n = i;
            	boolean b= false;
            	if(n==0|| n==1){
                	b=true;
            	}
           	else{
                	for(long j=2; j<=n/2;j++ ){
                		if(n%j==0){
                 			b = true;
                    			break;
                		}
                	}
                	if(!b){
                   		count++;
                	}
			if(count == last){
               			System.out.println(last+"th prime number is: "+n);
                		break;
			}
            	}
            	i++;
	
	}
    }
}
/*
 * Output: 64th prime number is: 311
 */
