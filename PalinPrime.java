
/*
Palindromic Prime
*/
class PalinPrime{
	public static void main(String args[]){
	
		int n= 131, n1=n, sum=0;
		while(n1!=0){
			sum*=10;
			sum+=n1%10;
			n1/=10;	
		}
		if(sum == n){
			boolean b=false;
			if(sum==0 || sum==1){
				b = true;
			}
			else{
				for(int i =2; i<=sum/2;i++){
					if(sum%i==0){
						b =true;
						break;
					}
				}
			}
			if(!b){
				System.out.println(n + " is a palindromic prime");
			}
		
		}
		
	}
}

/*
131 is a palindromic prime
*/