class FixArray{
	int sumOFArray(int a[]){
		int sum =0;
		for(int i=0; i<a.length; i++)
			sum += a[i];
		return sum;
	}
	
	double avgOfArray(int a[]){
		return (double)  sumOFArray(a) / a.length; 
	}

	int fixArray(int a[]){
		int shift =0;
		double avg = avgOfArray(a);
		if(avg %1 ==0){
			for(int i=0; i<a.length; i++){
				while(a[i] != avg){
					if(a[i] > avg)
						a[i]--;
					else
						a[i]++;
					shift++;
				}
			}
			shift/=2;
		}
		else
			shift = -1;
		return shift;
	}
}
class FixArrayMain{
	public static void main(String args[]){
		int a[]= {6, 8, 0, 4 ,2};
		FixArray obj = new FixArray();
		System.out.println(obj.fixArray(a));
	}
}