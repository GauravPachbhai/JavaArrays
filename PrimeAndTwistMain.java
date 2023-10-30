class PrimeAndTwist{
	int reverseNumber(int n){
		int sum= 0; 
		while(n!=0){
		 	sum = sum*10+ n%10;
			n/=10;
		}
		return sum;
	}

	boolean checkPrime(int n){
		boolean b =false;
		if(n==0 || n==1)
			b = true;
		else
			for(int i =2; i<=n/2; i++){

				if(n%i==0)
					b= true;
				else
					b = false;
			}
		return !b;
	}

	int[] primeAndTwist(int a[]){
		int count = 0;

		for(int i=0; i<a.length; i++){
			if(checkPrime(reverseNumber(a[i])))
				count++;	
		}
		int b[] = new int[count];
		count = 0;
	
		for(int i=0; i<a.length; i++){
			if(checkPrime(reverseNumber(a[i])))
				b[count++] = a[i];	
		}
		return b;	
	}

	void display(int a[]){
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
class PrimeAndTwistMain{
	public static void main(String args[]){
		PrimeAndTwist obj = new PrimeAndTwist();
		int a[]={121, 4332, 444, 232, 45};
		obj.display(obj.primeAndTwist(a));
	}
}