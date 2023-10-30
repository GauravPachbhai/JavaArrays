/*
WAP to sum the Inner element of array without using a temp variable
*/
class Array9{
	public static void main(String args[]){
	
		int a[] = {123,1289,784,535,9283,35248,21732,9835,2327,5673,2134};

		for(int i=0; i<a.length;i++){
			int n=a[i];
			int count =0;
			while(n!=0){
				count += n%10;
				n= n/10;
				
			}
			a[i] = count;
		}

		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		  
	
		
		
	}
}
/*
 * Output:
 * 6 20 19 13 22 22 15 25 14 21 10
 */