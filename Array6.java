/*
WAP to reverse the array without using a temp variable
*/
class Array6{
	public static void main(String args[]){
	
		int a[] = {123,1289,784,535,9283,35248,21732,9835,2327,5673,2134};
		
		for(int i=0; i<a.length;i++){
			int n = a[i];
			int last = n%10;
			int first = 0;
		
			while(n!=0){
				first = n;
				n = n/10;

			}
			first = first*10+last;
			a[i] = first;
		}

		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	
		
		
	}
}
/*
Output:
13 19 74 55 93 38 22 95 27 53 24
 */