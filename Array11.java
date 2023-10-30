/*
WAP to replace element from Array 
*/
class Array11{
	public static void main(String args[]){
	
		int a[] = {123,1289,784,535,9283,35248,21732,9835,2327,5673,2134};
		int count = a.length;
		for(int i=0; i<a.length;i++){

			int n=count;
			int base = 1;
			while(n!=0){
				base *=10;
				n/=10;
			}
			a[i]*=base;
			a[i]+=count--;
			
		}

		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		   
	
		
		
	}
}
/*
 * Output:
 * 12311 128910 7849 5358 92837 352486 217325 98354 23273 56732 21341
 */