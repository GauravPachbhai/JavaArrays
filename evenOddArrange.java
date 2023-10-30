/*
input : 125329478;
output: 153972248;
*/
class evenOddArrange{
	public static void main(String args[]){
	/*
	int even = 0, odd = 0;
	int n = 125329478;
	int n1 = n;
	while(n!=0){
		int temp=0;
		if((n%10)%2==0){
			even = even*10 + (n%10);
		}
		else
			odd = odd*10 + (n%10);	
		n /= 10;
	}
	n1 = even;
	
	even = 0;
	while(n1!=0){
		even = even*10+ (n1%10);
		n1 /=10; 
	}
	n1 = odd;
	odd = 0;
	while(n1!=0){
		odd = odd*10+ (n1%10);
		n1 /=10; 
	}
	System.out.println(odd+""+even);
	*/	
	int sum=0;
	int n = 125329478, n1= n;
	while(n1!=0){
		sum*=10;
		sum+= n1%10;
		n1/=10;
	}
	n =sum;
	while(sum!=0){
		if((sum%10)%2 != 0){
			n1*=10;
			n1+= sum%10;
		}
		sum/=10;
	}
	while(n!=0){
		if((n%10)%2 == 0){
			n1*=10;
			n1 += n%10;
		}
		n/=10;
	}

	n =n1;
	System.out.print(n);
	}
}

/*
Output: 153972248
*/