/*
Prime and Twist
*/
class PrimeTwist{
	public static void main(String args[]){
	
		int n= 13;
		boolean b = false;
		if( n==0 || n==1)
			b =  true;
		else
			for(int i =2; i<=n/2; i++){
				if(n%i==0){
					b = true;
					break;
				}
			}
		if(!b){
			int n1 =n;
			int sum =0;
			while(n1!=0){
				sum *= 10;
				sum += n1%10;
				n1 /= 10;
			}
			if(sum ==0 || sum == 1)
				b = true;
			else
				for(int i = 2; i<=sum/2; i++){
					if(sum%i==0){
						b = true;
						break;
					}
				}
			if(!b)
				System.out.println(n+" is a prime and twist");
		}
	}
}

/*
13 is a prime and twist
*/