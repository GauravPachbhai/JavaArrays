class FindPalimdrom{
	boolean checkpalindrom(int n){
		int n1 = n, sum =0;
		while(n1!=0){
			sum = sum*10 + n1%10;
			n1/=10;
		}

		if(n == sum)
			return true;
		else
			return false;		
	}
	
	int[] StorePalindrom(int a[]){
		int count =0;
		for(int i =0; i< a.length; i++){
			if(checkpalindrom(a[i]))
				count++;
		}
		int b[] = new int[count];
		count = 0;
		for(int i=0; i< a.length; i++){
			if(checkpalindrom(a[i])){
				b[count++] = a[i];
			}
		}
		return b;
	}
	
	void printArray(int a[]){
		for(int i =0; i< a.length; i++){
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}

}

class FindPalimdromMain{
	public static void main(String args[]){
		FindPalimdrom obj = new FindPalimdrom();
		int a[]={121, 4332, 444, 232, 45};
		obj.printArray(obj.StorePalindrom(a));
	}
}