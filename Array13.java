/*
WAP to find the Smaler max and maximum of array
*/
class Array13{
	public static void main(String args[]){
	
		int a[] = {1,2,11,45,5,6};
		int max = a[0];
		int smax=0;
		for(int i=0; i<a.length;i++){
			
			if (max < a[i]){
				smax = max;
				max = a[i];
	
			}
			else{
				if(smax<a[i]){
					smax = a[i];
				}
			}	
	
		}

		System.out.println("Maximum: "+max +"\nSmaller Maximum: "+smax);
	
	}
}
/*
 * Output:
 * Maximum: 45
Smaller Maximum: 11
 */