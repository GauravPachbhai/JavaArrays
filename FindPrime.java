class FindPrime{

	boolean checkPrime(int n){
		boolean b = false;
		
		if(n==0 || n==1)
			b =true;
		else
			for(int i=2 ;i<n/2; i++)
			if(n%i ==0){
				b = true;
				break;
			}
		return !b;
	}
		
	int[] storePrime(int a[]){
		
		int count =0;
		for(int i=0; i<a.length; i++)
			if(checkPrime(a[i]))
				count++;
	
	
		int b[] = new int[count];
		count =0;
		for(int i=0; i<a.length;i++)
			if(checkPrime(a[i]))
				b[count++] = a[i];

		return b;
	}
	
	void displayArray(int b[]){
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}
}