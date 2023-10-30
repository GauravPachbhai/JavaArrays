
/*
Palindromic Prime
*/
class nthPalinPrime{
	public static void main(String args[]){
		int i=0, count=0,last = 83;
		while(true){
			int n= i, sum=0;
			while(n!=0){
				sum*=10;
				sum+=n%10;
				n/=10;	
			}
			if(sum == i){
				boolean b=false;
				if(sum==0 || sum==1){
					b = true;
				}
				else{
					for(int j =2; j<=sum/2;j++){
						if(sum%j==0){
							b =true;
							break;
						}
					}
				}
				if(!b){
					count++;
				}
				if(count == last){
				System.out.println(last+"rd is a palindromic prime number ");
				break;
				}
		
			}
			i++;
		}
		
	}
}

/*
Output: 83rd is a palindromic prime number
*/