/*
nth Prime and Twist
*/
class nthPrimeTwist{
	public static void main(String args[]){
		int count =0;
		int a=0, last = 98;
		while(true){
			int n= a;
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
					count++;
				if(count == last){
					System.out.println(last+"th prime And Twist is: "+a);
					break;
				}
			
			}
			a++;
		}
	}
}

/*
98 prime And Twist is: 1601
*/